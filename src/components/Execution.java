package components;

public class Execution {
    protected Memory memory;
    protected Display display;
    public Execution() {
        memory = new Memory();
        // This structure is dumbb
        display = new Display(memory);
    }
}