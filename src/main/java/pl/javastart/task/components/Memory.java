package pl.javastart.task.components;

import pl.javastart.task.exceptions.ComponentsBurnExceptions;
import pl.javastart.task.logic.Component;
import pl.javastart.task.logic.OverclockAble;

public class Memory extends Component implements OverclockAble {
    private static final int TEMPERATURE_INCREASE_AFTER_BOOST = 15;
    private static final int TEMPERATURE_FOR_MINIMUM_RAM_TIMING = 50;
    private static final int MAXIMUM_SAFE_TEMPERATURE_FOR_MEMORY = 70;
    private static final int BOOST_TIMING_WITH_HUNDRED_MHZ = 100;
    private int amountOfRam;
    private int timing;
    private int temperature;

    public Memory(String model, String producer, String serialNumber, int amountOfRam, int timing) {
        super(model, producer, serialNumber);
        this.amountOfRam = amountOfRam;
        this.timing = timing;
        this.temperature = TEMPERATURE_FOR_MINIMUM_RAM_TIMING;
    }

    @Override
    public void overclock() {
        setTiming();
    }

    public int getTemperature() {
        return temperature;
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getAmountOfRam() {
        return amountOfRam;
    }

    private void setAmountOfRam(int amountOfRam) {
        this.amountOfRam = amountOfRam;
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming() {
        if (temperature + TEMPERATURE_INCREASE_AFTER_BOOST >= MAXIMUM_SAFE_TEMPERATURE_FOR_MEMORY) {
            throw new ComponentsBurnExceptions("no way to boost memory anymore, because temperature will be too high");
        }
        this.timing = timing + BOOST_TIMING_WITH_HUNDRED_MHZ;
        setTemperature(temperature + TEMPERATURE_INCREASE_AFTER_BOOST);
    }

    @Override
    public String toString() {
        return "\nMemory{" +
                "amountOfRam = " + amountOfRam +
                ", timing = " + timing +
                ", temperature = " + temperature +
                '}';
    }
}