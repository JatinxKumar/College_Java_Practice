import java.util.Stack;

public class UndoRedoStack {
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public UndoRedoStack() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void performAction(String action) {
        undoStack.push(action);
        System.out.println("Action performed: " + action);
        // Clear redo stack as a new action is performed
        redoStack.clear();
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("No actions to undo");
            return;
        }

        String action = undoStack.pop();
        redoStack.push(action);
        System.out.println("Undo action: " + action);
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("No actions to redo");
            return;
        }

        String action = redoStack.pop();
        undoStack.push(action);
        System.out.println("Redo action: " + action);
    }

    public void printHistory() {
        if (undoStack.isEmpty()) {
            System.out.println("No actions performed yet");
            return;
        }

        System.out.println("Action history:");
        for (String action : undoStack) {
            System.out.println(action);
        }
    }

    public static void main(String[] args) {
        UndoRedoStack stack = new UndoRedoStack();

        stack.performAction("Write text");
        stack.performAction("Delete line");
        stack.performAction("Add paragraph");

        stack.printHistory();
        stack.undo();
        stack.redo();
    }
}
