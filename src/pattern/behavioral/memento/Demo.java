package pattern.behavioral.memento;

public class Demo {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        UndoManager undoManager = new UndoManager();

        textEditor.setContent("First draft.");
        undoManager.saveState(textEditor); // Save state

        textEditor.setContent("Modified content.");
        undoManager.saveState(textEditor); // Save state

        System.out.println("Current Content: " + textEditor.getContent());

        undoManager.undo(textEditor); // Undo
        System.out.println("Content after Undo: " + textEditor.getContent());

        undoManager.undo(textEditor); // Undo again
    }
}
