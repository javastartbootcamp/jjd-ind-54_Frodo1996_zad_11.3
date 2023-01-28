package pl.javastart.task.logic;

import pl.javastart.task.components.Processor;
import pl.javastart.task.exceptions.ComponentsBurnExceptions;

public abstract class Component {
    private static final int BOOST_TIMING_WITH_HUNDRED_MHZ = 100;
    private static final int MAXIMUM_SAFE_TEMPERATURE_FOR_PROCESSOR = 70;
    private static final int TEMPERATURE_INCREASE_AFTER_BOOST = 10;
    Computer computer;
    private String model;
    private String producer;
    private String serialNumber;

    public Component(String model, String producer, String serialNumber) {
        this.model = model;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}