package pattern.structural.decorator;

public class Domain {
    public static void main(String[] args) {
        Text plainText = new PlainText("This is a plain text.");
        Text boldItalicText = new BoldText(new ItalicText(plainText));

        System.out.println("Formatted Text: " + boldItalicText.format());
    }
}
