package javapractice4.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        Car car1 = new Car("BWM", 100, new Owner("Ivan", 26, 3), 16000, 2008);
        Car car2 = new Car("Mercedes", 80, new Owner("Ivan", 19, 3), 20000, 2000);
        Car car3 = new Car("Audi", 90, new Owner("Ivan", 30, 8), 15000, 2009);
        Car car4 = new Car("BWM", 120, new Owner("Ivan", 22, 6), 20000, 2015);
        Car car5 = new Car("Kia", 160, new Owner("Ivan", 36, 14), 25000, 1999);
        Car car6 = new Car("BWM", 170, new Owner("Ivan", 22, 5), 35000, 2001);
        Car car7 = new Car("Audi", 200, new Owner("Ivan", 42, 22), 50000, 2008);
        Car car8 = new Car("BWM", 150, new Owner("Ivan", 26, 2), 50000, 2003);
        Car car9 = new Car("Kia", 180, new Owner("Ivan", 19, 1), 20000, 2008);
        Car car10 = new Car("Daewoo", 135, new Owner("Ivan", 24, 4), 15000, 2017);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

//        Зробили половину автопарку ремонт мотору, що збільшить потужність автомобілів на 10%
//        Iterator<task1.Car> iterator = cars.iterator();
//        while (iterator.hasNext()) {
//            task1.Car next =  iterator.next();
//            if(next.getPower() < 150){
//                double result = next.getPower() * 1.1;
//                next.setPower((int)Math.round(result));
//                next.setOwner(new task1.Owner("Ivan", 25,5));
//                System.out.println(next);
//            }
//        }

//        Далі необхідно рати кожну другу машинку (цикл з кроком в 2), та робити їй підвищення потужності двигуна на 10% та ціну на 5%
//        cars.stream().forEach(car -> {
//           if(cars.indexOf(car) % 2 == 0){
//               double powerResult = car.getPower() * 1.1;
//               double priceResult = car.getPrice() * 1.05;
//               car.setPower((int)Math.round(powerResult));
//               car.setPrice((int)Math.round(priceResult));
//               System.out.println(car);
//           }
//        });

//        Після того зробити перевірку досвіду ВСІХ наших водіїв. Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//        cars.stream().forEach(car -> {
//            if(car.getOwner().getExperience() < 5 && car.getOwner().getAge() > 25) {
//                System.out.println("You need to go to courses");
//                car.getOwner().setExperience(car.getOwner().getExperience() + 1);
//                System.out.println("You successfuly compeled courses. Your experience has increased by a 1 year");
//                System.out.println(car);
//            }});

//        Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто в циклі
//        int result = 0;
//        Iterator<task1.Car> iterator = cars.iterator();
//        while (iterator.hasNext()) {
//            task1.Car next =  iterator.next();
//            result += next.getPrice();
//        }
//        System.out.println(result);




    }
}
