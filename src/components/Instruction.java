package components;


public class Instruction extends Execution {

    public void execute(short instruction) {
        switch(instruction) {
            case 0x00E0:
                display.clear();

        }
    }
}
