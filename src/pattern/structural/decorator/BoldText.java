package pattern.structural.decorator;

class BoldText extends TextDecorator {
    public BoldText(Text text) {
        super(text);
    }

    public String format() {
        return "<b>" + super.format() + "</b>"; // Adds bold formatting
    }
}