import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.io.IOException;
import java.util.List;

public class Client {
    private OkHttpClient client;
    private ObjectMapper mapper;
    private String key;
    private String url;

    public Client(String key, String url) {
        this.key = key;
        this.url = url;
        client = new OkHttpClient();
        mapper = new ObjectMapper();
    }

    public void summarize(String text) {
        try {
            var tml = List.of(new RequestPayload.Message("user", "Summarize in 15 words containing the entire crux: " + text));
            var tmp = new RequestPayload("llama-3.3-70b-versatile", tml);
            var reqpayload = mapper.writeValueAsString(tmp);
            var reqbody = RequestBody.create(reqpayload, MediaType.get("application/json"));
            var req = new Request.Builder().url(url).addHeader("Authorization", "Bearer " + key).post(reqbody).build();

            var res = client.newCall(req).execute();
            if (!res.isSuccessful()) System.err.println(res.body().string());
            else {
                var respayload = res.body().string();//mapper.readValue(res.body().string(), String.class);
                System.out.println(respayload);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
