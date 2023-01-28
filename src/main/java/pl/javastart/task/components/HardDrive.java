package pl.javastart.task.components;

import pl.javastart.task.logic.Component;

public class HardDrive extends Component {
    private int capacity;

    public HardDrive(String model, String producer, String serialNumber, int capacity) {
        super(model, producer, serialNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "\nHardDrive{" +
                "capacity=" + capacity +
                '}';
    }
}