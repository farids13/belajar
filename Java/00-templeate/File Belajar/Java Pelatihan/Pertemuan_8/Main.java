import Object.*;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        List<Motorcycle> motorcycles = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        AtomicLong atomicLong = new AtomicLong(1);

        while (true){
            System.out.print("Parkir>");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");

            switch (inputs[0].toLowerCase()){
                case "masuk":
                    if(inputs.length < 3){
                        System.out.println("Require Plate Number!");
                    } else {
                        if(inputs[1].equalsIgnoreCase("mobil")){
                            Car car = new Car(atomicLong.getAndIncrement());
                            car.setPlateNo(inputs[2]);
                            cars = masuk(car, cars);
                            System.out.println("Success add new Mobil");
                        } else if(inputs[1].equalsIgnoreCase("motor")) {
                            Motorcycle motorcycle = new Motorcycle(atomicLong.getAndIncrement());
                            motorcycle.setPlateNo(inputs[2]);
                            motorcycles = masuk(motorcycle, motorcycles);
                            System.out.println("Success add new Motor");
                        } else{
                            System.out.println("Invalid argument : \"" + inputs[1] + "\"");
                        }
                    }
                    break;
                case "keluar":
                    break;
                case "check":
                    check(cars, motorcycles);
                    break;
                default:
                    if(inputs[0].equalsIgnoreCase("exit")){
                        System.out.println("Invalid argument : \"" + inputs[0] + "\"");
                    }
                    break;
            }

            if(inputs[0].equalsIgnoreCase("exit")){
                break;
            }
        }
    }

    public static <T extends Vehicle> List<T> masuk(T object, List<T> list){
        object.setEntryDatetime(LocalDateTime.now());
        list.add(object);
        return list;
    }

    public static void check(List<Car> cars, List<Motorcycle> motorcycles){
        AtomicInteger index = new AtomicInteger(1);
        System.out.println("== List Parkir Kendaraan ==\n");
        System.out.println("== List Mobil ==\n");
        System.out.printf("ID\t%s\t%s%n", "Nomor Plat", "Tanggal Masuk");
        for(Car car : cars){
            System.out.printf("%s\t%s\t%s%n", car.getId(), car.getPlateNo(), car.getEntryDatetime());
        }
        System.out.println("");
        System.out.println("== List Motor ==\n");
        System.out.printf("ID\t%s\t%s%n", "Nomor Plat", "Tanggal Masuk");
        for(Motorcycle motorcycle : motorcycles){
            System.out.printf("%s\t%s\t%s%n", motorcycle.getId(), motorcycle.getPlateNo(), motorcycle.getEntryDatetime());
        }
        System.out.println("");

    }
}
