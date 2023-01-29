package pl.javastart.task.computer.component;

public class Memory extends Component implements Overclockable {
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
        int tempAfter = temperature + TEMPERATURE_INCREASE_AFTER_BOOST;
        if (tempAfter >= MAXIMUM_SAFE_TEMPERATURE_FOR_MEMORY) {
            throw new ComponentsBurnException("no way to boost memory anymore, because temperature will be too high");
        }
        timing += BOOST_TIMING_WITH_HUNDRED_MHZ;
        temperature = tempAfter;
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

    private void setTiming(int timing) {
        this.timing = timing;
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