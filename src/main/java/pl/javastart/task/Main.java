package pl.javastart.task;

import pl.javastart.task.computer.Computer;
import pl.javastart.task.computer.component.HardDrive;
import pl.javastart.task.computer.component.Memory;
import pl.javastart.task.computer.component.Processor;
import pl.javastart.task.computer.component.ComponentsBurnException;

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
        } catch (ComponentsBurnException e) {
            System.err.println(e.getMessage());
        }

        //// zostawione do testów :D
//        try {
//            System.out.println(computer1);
//            processor.overclock();
//            System.out.println(computer1);
//            processor.overclock();
//            System.out.println(computer1);
//            processor.overclock();
//            System.out.println(computer1);
//        } catch (ComponentsBurnExceptions e) {
//            System.err.println(e.getMessage());
//        }
    }
}