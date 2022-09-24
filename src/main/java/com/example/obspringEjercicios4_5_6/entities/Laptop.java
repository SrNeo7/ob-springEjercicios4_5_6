package com.example.obspringEjercicios4_5_6.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String manufacturer;

    private String model;

    private String microProcessor;

    private Double cpuFrequenzy;

    private Integer ram;

    private Integer ssd;

    private Double screenSize;

    private String os;

    public Laptop() {
    }

    public Laptop(Long id, String manufacturer, String model, String microProcessor, Double cpuFrequenzy, Integer ram, Integer ssd, Double screenSize, String os) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.microProcessor = microProcessor;
        this.cpuFrequenzy = cpuFrequenzy;
        this.ram = ram;
        this.ssd = ssd;
        this.screenSize = screenSize;
        this.os = os;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMicroProcessor() {
        return microProcessor;
    }

    public void setMicroProcessor(String microProcessor) {
        this.microProcessor = microProcessor;
    }

    public Double getCpuFrequenzy() {
        return cpuFrequenzy;
    }

    public void setCpuFrequenzy(Double cpuFrequenzy) {
        this.cpuFrequenzy = cpuFrequenzy;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
