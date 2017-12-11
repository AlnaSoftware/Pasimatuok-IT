package lt.alna.java1;

import lt.alna.java1.computer.Computer;
import lt.alna.java1.computer.parts.Drive;
import lt.alna.java1.computer.parts.Memmory;
import lt.alna.java1.computer.parts.Processor;

import java.util.ArrayList;
import java.util.List;

public class Java1Application {

   private List<Computer> computers = new ArrayList<>();

    public Java1Application() {
        computers.add(new Computer(new Processor(), new Memmory(), new Drive()));
        computers.add(new Computer(new Processor(), new Memmory(), new Drive()));
        computers.add(new Computer(new Processor(), new Memmory(), new Drive()));
    }

    public void run() {
        for (Computer computer : computers) {
            this.doubleTurn(computer);
        }

        //java 8 example :)
//        computers.forEach(computer -> System.out.println(computer));
//        computers.forEach(System.out::println);
    }

    public void doubleTurn(Computer computer) {
        System.out.println(computer.turnOn());
        System.out.println(computer.turnOn());
    }
}
