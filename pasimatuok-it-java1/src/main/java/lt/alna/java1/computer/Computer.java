package lt.alna.java1.computer;

import lt.alna.java1.computer.parts.Drive;
import lt.alna.java1.computer.parts.Memmory;
import lt.alna.java1.computer.parts.Processor;

public class Computer {

    private Processor processor;
    private Memmory memmory;
    private Drive drive;

    private boolean on = false;

    public Computer (Processor processor, Memmory memmory, Drive drive) {
        this.processor = processor;
        this.memmory = memmory;
        this.drive = drive;
    }

    public String turnOn() {
        String computerResponse;

        if (this.on == false) {
            this.on = true;
            computerResponse = "kompiuteris sėkmingai įjungtas";
        } else {
            computerResponse = "KLAIDA";
        }

        return computerResponse;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memmory getMemmory() {
        return memmory;
    }

    public Drive getDrive() {
        return drive;
    }
}
