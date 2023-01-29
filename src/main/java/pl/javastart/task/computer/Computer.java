package pl.javastart.task.computer;

import pl.javastart.task.computer.component.HardDrive;
import pl.javastart.task.computer.component.Memory;
import pl.javastart.task.computer.component.Processor;

public class Computer {
    Memory memory;
    Processor processor;
    HardDrive hardDrive;

    public Computer(Memory memory, Processor processor, HardDrive hardDrive) {
        this.memory = memory;
        this.processor = processor;
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return "\nComputer parameters:" + memory + processor + hardDrive;
    }
}