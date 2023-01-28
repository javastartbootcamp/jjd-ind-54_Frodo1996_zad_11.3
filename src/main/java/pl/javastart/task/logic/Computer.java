package pl.javastart.task.logic;

import pl.javastart.task.components.HardDrive;
import pl.javastart.task.components.Memory;
import pl.javastart.task.components.Processor;

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