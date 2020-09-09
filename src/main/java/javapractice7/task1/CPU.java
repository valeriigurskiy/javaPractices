package javapractice7.task1;

public class CPU {
    private String type;
    private int kernels;
    private int frequency;
    private Country country;

    @Override
    public String toString() {
        return "task1.CPU{" +
                "type=" + type +
                ", kernels=" + kernels +
                ", frequency=" + frequency +
                ", country=" + country +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getKernels() {
        return kernels;
    }

    public void setKernels(int kernels) {
        this.kernels = kernels;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public CPU(String type, int kernels, int frequency, Country country) {
        this.type = type;
        this.kernels = kernels;
        this.frequency = frequency;
        this.country = country;
    }
}
