package pl.javastart.task.components;

import pl.javastart.task.exceptions.ComponentsBurnExceptions;
import pl.javastart.task.logic.Component;
import pl.javastart.task.logic.OverclockAble;

public class Processor extends Component implements OverclockAble {
    private static final int BOOST_TIMING_WITH_HUNDRED_MHZ = 100;
    private static final int MAXIMUM_SAFE_TEMPERATURE_FOR_PROCESSOR = 73;
    private static final int TEMPERATURE_INCREASE_AFTER_BOOST = 10;
    private static final int TEMPERATURE_BEFORE_BOOST = 50;
    private int mhz;
    private int temperature;

    public Processor(String model, String producer, String serialNumber, int mhz) {
        super(model, producer, serialNumber);
        this.mhz = mhz;
        this.temperature = TEMPERATURE_BEFORE_BOOST;
    }

    @Override
    public void overclock() {
        setMhz();
    }

    public int getTemperature() {
        return temperature;
    }

    private void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getMhz() {
        return mhz;
    }

    private void setMhz() {
        if ((temperature + TEMPERATURE_INCREASE_AFTER_BOOST) >= MAXIMUM_SAFE_TEMPERATURE_FOR_PROCESSOR) {
            throw new ComponentsBurnExceptions("no way to boost processor anymore, because temperature will be too high");
        }
        this.mhz = mhz + BOOST_TIMING_WITH_HUNDRED_MHZ;
        setTemperature(temperature + TEMPERATURE_INCREASE_AFTER_BOOST);;
    }

    @Override
    public String toString() {
        return "\nProcessor{" +
                "mhz=" + mhz +
                ", temperature = " + temperature +
                '}';
    }
}