package pl.javastart.task.logic;

import pl.javastart.task.components.HardDrive;
import pl.javastart.task.components.Memory;
import pl.javastart.task.components.Processor;
import pl.javastart.task.exceptions.ComponentsBurnExceptions;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("i5-10300H", "Intel", "123241", 3000);
        Memory memory = new Memory("Fury", "Kingston", "2270B", 4096, 1066);
        HardDrive hardDrive = new HardDrive("CX400", "Goodram", "ABERO71", 128);
        Computer computer1 = new Computer(memory, processor, hardDrive);
        try {
            System.out.println(computer1);
            memory.overclock();
            System.out.println(computer1);
            memory.overclock();
            System.out.println(computer1);
            memory.overclock();
            System.out.println(computer1);
        } catch (ComponentsBurnExceptions e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(computer1);
            processor.overclock();
            System.out.println(computer1);
            processor.overclock();
            System.out.println(computer1);
            processor.overclock();
            System.out.println(computer1);
        } catch (ComponentsBurnExceptions e) {
            System.err.println(e.getMessage());
        }
    }
}