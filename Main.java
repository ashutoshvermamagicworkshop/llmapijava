public class Main {
    public static void main(String[] args) {
        var client = new Client(Config.key, Config.url);
        var text = "Taylor Swift's greatness transcends music—she is a cultural phenomenon, a lyrical genius, and a masterful storyteller. From her country roots to her pop and indie evolution, she has continuously reinvented herself without losing authenticity. Her ability to craft deeply personal yet universally relatable songs has built a bond with fans that few artists can match. Albums like 1989, Red, and Folklore showcase her incredible range—emotionally, sonically, and poetically. Swift’s impact goes beyond artistry; she’s a trailblazer in standing up for artists’ rights, fearlessly challenging major industry systems like Spotify and Big Machine. With a sharp business mind and unwavering control over her brand, she exemplifies what it means to be both a creative and strategic powerhouse. The Eras Tour proved her influence isn’t confined to charts—she stimulates entire economies and inspires millions with every performance. Swift's legacy is also rooted in her empathy and emotional intelligence; she’s become a voice for a generation navigating love, loss, growth, and self-discovery. Her songwriting resonates across ages and experiences, reminding listeners they’re not alone. With over a decade of dominance and no signs of slowing down, Taylor Swift’s greatness lies in her rare ability to evolve, inspire, and empower—all with a pen and a melody.";

        client.summarize(text);
    }
}
