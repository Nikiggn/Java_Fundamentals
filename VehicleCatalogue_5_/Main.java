package VehicleCatalogue_5_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Vehicle> car = new ArrayList<>();

        List<Vehicle> truck = new ArrayList<>();

        while (true){
            String command = scanner.nextLine();
            if (command.equals("End")){
                break;
            }

            String type = command.split(" ")[0];
            String model = command.split(" ")[1];
            String color = command.split(" ")[2];
            int horsePower = Integer.parseInt(command.split(" ")[3]);

            Vehicle vehicle = new Vehicle(type, model ,color, horsePower);

            if (type.equals("car")){
                car.add(vehicle);
            }else {
                truck.add(vehicle);
            }

        }

//        Type: {typeOfVehicle}
//        Model: {modelOfVehicle}
//        Color: {colorOfVehicle}
//        Horsepower: {horsepowerOfVehicle}


        while (true){
            String command = scanner.nextLine();
            if (command.equals("Close the Catalogue")){
                break;
            }

            //if (car.get())

        }
    }
}
