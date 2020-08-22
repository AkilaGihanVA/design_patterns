package com.akila.designpattern.builder;

/**
 * @author AKILA_GIHAN on 8/22/2020
 * @project design_patterns
 */
public class Computer {

    private String casing;
    private String motherBoard;
    private String processor;
    private String ram;
    private String hardDisk;

    public static class Builder {

        private String casing;
        private String motherBoard;
        private String processor;
        private String ram;
        private String hardDisk;

        public Computer build() {
            Computer computer = new Computer(this);
            return computer;
        }

        public Builder setCasing(String casing) {
            this.casing = casing;
            return this;
        }

        public Builder setMotherBoard(String motherBoard) {
            this.motherBoard = motherBoard;
            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setHardDisk(String hardDisk) {
            this.hardDisk = hardDisk;
            return this;
        }
    }

    Computer(Builder builder) {
        this.hardDisk = builder.hardDisk;
        this.casing = builder.casing;
        this.ram = builder.ram;
        this.motherBoard = builder.motherBoard;
        this.processor = builder.processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "casing='" + casing + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }

    public String getCasing() {
        return casing;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }
}
