package pattern.structural.decorator;

class PlainText implements Text {
    private String content;

    public PlainText(String content) {
        this.content = content;
    }

    public String format() {
        return content;
    }
}