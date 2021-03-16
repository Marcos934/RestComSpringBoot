package br.com.erudio;

public class Greeting {

    private final long id;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    private final String content;

    public String getContent() {
        return content;
    }
}
