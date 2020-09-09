package javapractice7.task1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("1", 2010, 1, 200, new HardDisk("1", DiskType.HDD, 500, Country.USA), new CPU("i7", 2, 4, Country.INDIA));
        Computer computer2 = new Computer("1", 2012, 1, 1000, new HardDisk("1", DiskType.SSD, 1000, Country.INDIA), new CPU("amd", 2, 4, Country.INDIA));
        Computer computer3 = new Computer("1", 2015, 1, 800, new HardDisk("1", DiskType.SSD, 500, Country.INDIA), new CPU("i7", 2, 4, Country.CHINA));
        Computer computer4 = new Computer("1", 2010, 1, 200, new HardDisk("1", DiskType.HDD, 200, Country.CHINA), new CPU("amd", 2, 4, Country.KOREA));
        Computer computer5 = new Computer("1", 2012, 1, 1000, new HardDisk("1", DiskType.HDD, 1000, Country.USA), new CPU("i7", 2, 4, Country.KOREA));
        Computer computer6 = new Computer("1", 2015, 1, 200, new HardDisk("1", DiskType.SSD, 750, Country.CHINA), new CPU("amd", 2, 4, Country.KOREA));
        Computer computer7 = new Computer("1", 2010, 1, 600, new HardDisk("1", DiskType.HDD, 200, Country.USA), new CPU("amd", 2, 4, Country.KOREA));
        Computer computer8 = new Computer("1", 2010, 1, 200, new HardDisk("1", DiskType.SSD, 1000, Country.INDIA), new CPU("i7", 2, 4, Country.INDIA));
        Computer computer9 = new Computer("1", 2011, 1, 400, new HardDisk("1", DiskType.SSD, 500, Country.CHINA), new CPU("i7", 2, 4, Country.CHINA));
        Computer computer10 = new Computer("1", 2015, 1, 600, new HardDisk("1", DiskType.HDD, 750, Country.USA), new CPU("i7", 2, 4, Country.USA));
        Computer computer11 = new Computer("1", 2015, 1, 200, new HardDisk("1", DiskType.SSD, 500, Country.KOREA), new CPU("amd", 2, 4, Country.INDIA));
        Computer computer12 = new Computer("1", 2012, 1, 1000, new HardDisk("1", DiskType.SSD, 1000, Country.KOREA), new CPU("i7", 2, 4, Country.CHINA));
        Computer computer13 = new Computer("1", 2010, 1, 200, new HardDisk("1", DiskType.HDD, 750, Country.CHINA), new CPU("amd", 2, 4, Country.INDIA));
        Computer computer14 = new Computer("1", 2010, 1, 750, new HardDisk("1", DiskType.SSD, 200, Country.USA), new CPU("amd", 2, 4, Country.CHINA));
        Computer computer15 = new Computer("1", 2012, 1, 1000, new HardDisk("1", DiskType.HDD, 200, Country.CHINA), new CPU("i7", 2, 4, Country.INDIA));
        Computer computer16 = new Computer("1", 2015, 1, 200, new HardDisk("1", DiskType.SSD, 1000, Country.INDIA), new CPU("i7", 2, 4, Country.CHINA));
        Computer computer17 = new Computer("1", 2010, 1, 600, new HardDisk("1", DiskType.HDD, 500, Country.CHINA), new CPU("i7", 2, 4, Country.USA));
        Computer computer18 = new Computer("1", 2010, 1, 150, new HardDisk("1", DiskType.SSD, 1000, Country.USA), new CPU("amd", 2, 4, Country.INDIA));
        Computer computer19 = new Computer("1", 2010, 1, 200, new HardDisk("1", DiskType.HDD, 200, Country.KOREA), new CPU("i7", 2, 4, Country.USA));
        Computer computer20 = new Computer("1", 2012, 1, 1000, new HardDisk("1", DiskType.SSD, 1000, Country.USA), new CPU("amd", 2, 4, Country.INDIA));

        List<Computer> computerList = new ArrayList<Computer>();
        computerList.add(computer1);
        computerList.add(computer2);
        computerList.add(computer3);
        computerList.add(computer4);
        computerList.add(computer5);
        computerList.add(computer6);
        computerList.add(computer7);
        computerList.add(computer8);
        computerList.add(computer9);
        computerList.add(computer10);
        computerList.add(computer11);
        computerList.add(computer12);
        computerList.add(computer13);
        computerList.add(computer14);
        computerList.add(computer15);
        computerList.add(computer16);
        computerList.add(computer17);
        computerList.add(computer18);
        computerList.add(computer19);
        computerList.add(computer20);

        List<Computer> collect = computerList.stream().filter(computer -> computer.getYear() > 2010).collect(Collectors.toList());
//        System.out.println(collect.toString());

        List<Computer> collect1 = computerList.stream().filter(computer -> computer.getYear() > 2010 && computer.getHardDisk().getCountry() == Country.CHINA).collect(Collectors.toList());
//        System.out.println(collect1);

        List<Computer> collect2 = computerList.stream().filter(computer -> computer.getYear() > 2010 && computer.getHardDisk().getCountry() != Country.CHINA).collect(Collectors.toList());
//        System.out.println(collect2);

        List<Computer> collect3 = computerList.stream().filter(computer -> computer.getHardDisk().getDiskMemory() > 500).collect(Collectors.toList());
//        System.out.println(collect3);

        List<Computer> i7 = computerList.stream().filter(computer -> computer.getHardDisk().getDiskType() == DiskType.SSD && computer.getHardDisk().getDiskMemory() > 500 && computer.getCpu().getType().equals("i7")).collect(Collectors.toList());
//        System.out.println(i7);

        Collections.sort(i7, new SortByPrice());
        System.out.println(i7);

    }
}
