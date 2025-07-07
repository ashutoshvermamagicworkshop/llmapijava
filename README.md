# llmapijava
LLM API Java

## The Prompt Passed is to Summarize a Large Text into 15 or Less Words.

# Libraries Used:
- OkHttp (for all the low level code needed to send HTTP requets and recieve HTTP responses)
- Jackson (for JSON parsing)

# LLM Api Used: GroqCloud

# Function of Each File Explained:
- Config (an interface storing the LLM API key and the LLM url)
- RequestPayload (a wrapper class to wrap the promt in the format specified by the LLM API documentation)
- Client (an HTTP client that sends the prompt in an HTTP request along with the API key at the specified URL)
- Main (the entry point of the code for testing)
