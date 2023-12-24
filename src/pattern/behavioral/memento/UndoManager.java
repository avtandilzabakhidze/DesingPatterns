package pattern.behavioral.memento;

import java.util.Stack;

public class UndoManager {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            EditorMemento memento = history.pop();
            editor.restore(memento);
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
