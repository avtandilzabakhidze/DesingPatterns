package pattern.structural.decorator;

class ItalicText extends TextDecorator {
    public ItalicText(Text text) {
        super(text);
    }

    public String format() {
        return "<i>" + super.format() + "</i>"; // Adds italic formatting
    }
}