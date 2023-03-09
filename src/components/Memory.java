package components;

// This class contains methods for anything memory related (program counter, RAM, registries)
public class Memory {
    private byte[] memory;
    private short pc;
    private byte[] registers;
    private boolean[] keyboard;

    public Memory() {
        memory = new byte[4096];
        registers = new byte[16];
        keyboard = new boolean[16];
    }
    public short getMemory(short index) {
        return memory[index];
    }
}
