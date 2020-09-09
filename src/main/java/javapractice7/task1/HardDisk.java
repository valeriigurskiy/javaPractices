package javapractice7.task1;

public class HardDisk {
    private String diskModel;
    private DiskType diskType;
    private int diskMemory;
    private Country country;

    @Override
    public String toString() {
        return "task1.HardDisk{" +
                "diskModel='" + diskModel + '\'' +
                ", diskType=" + diskType +
                ", diskMemory=" + diskMemory +
                ", country=" + country +
                '}';
    }

    public String getDiskModel() {
        return diskModel;
    }

    public void setDiskModel(String diskModel) {
        this.diskModel = diskModel;
    }

    public DiskType getDiskType() {
        return diskType;
    }

    public void setDiskType(DiskType diskType) {
        this.diskType = diskType;
    }

    public int getDiskMemory() {
        return diskMemory;
    }

    public void setDiskMemory(int diskMemory) {
        this.diskMemory = diskMemory;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public HardDisk(String diskModel, DiskType diskType, int diskMemory, Country country) {
        this.diskModel = diskModel;
        this.diskType = diskType;
        this.diskMemory = diskMemory;
        this.country = country;
    }
}
