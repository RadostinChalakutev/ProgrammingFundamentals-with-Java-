package P08ObjectAndClasses.excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5VehicleCatalogue {
    public static class Vehicle {
        String Type;
        String Model;
        String Color;
        int Horsepower;

        public Vehicle(String Type, String Model, String Color, int Horsepower) {
            this.Type = Type;
            this.Model = Model;
            this.Color = Color;
            this.Horsepower = Horsepower;

        }
        public String getType() {
            return this.Type;
        }

        public String getModel() {
            return this.Model;
        }

        public String getColor() {
            return this.Color;
        }

        public int getHorsepower() {
            return this.Horsepower;
        }

        public void setType(String type) {
            this.Type = type;
        }

        public void setModel(String model) {
            this.Model = model;
        }

        public void setColor(String color) {
            this.Color = color;
        }

        public void setHorsepower(int horsepower) {
            this.Horsepower = horsepower;
        }

        @Override
        public String toString() {
            String typeVeh = Type.equals("car") ? "Car" : "Truck";
            return "Type: " + typeVeh + "\n" +
                    "Model: " +  Model + "\n" +
                    "Color: " + Color+ "\n" +
                    "Horsepower: " + Horsepower;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehiclesList = new ArrayList<>();


        String input = scanner.nextLine();//truck Man red 200


        while (!input.equals("End")) {
            String[] vehicle = input.split(" ");//["truck" "Man" "red" "200"]
            String type = vehicle[0]; //"truck"
            String model = vehicle[1];//"Man"
            String color = vehicle[2];//"red"
            int horsepower = Integer.parseInt(vehicle[3]);// 200
            Vehicle currentVehicle = new Vehicle(type, model, color, horsepower);
            vehiclesList.add(currentVehicle);


            input = scanner.nextLine();
        }
        String model=scanner.nextLine();


        while (!model.equals("Close the Catalogue")) {
            for (Vehicle vehicle:vehiclesList) {
                if (vehicle.getModel().equals(model))
                System.out.println(vehicle);
            }
           model=scanner.nextLine();
        }
        double sumCar=0;
        double sumTruck=0;
        int countCar=0;
        int countTruck=0;

        for (Vehicle vehicle:vehiclesList) {
            if (vehicle.getType().equals("car")){
                sumCar+=vehicle.getHorsepower();
                countCar++;

            }else if (vehicle.getType().equals("truck")){
                sumTruck+=vehicle.getHorsepower();
                countTruck++;

            }
        }
        double averageCar=sumCar/countCar;
        double averageTruck=sumTruck/countTruck;

        if (countCar==0){
            averageCar=0;
        }
        if (countTruck==0){
            averageTruck=0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.",averageCar);
        System.out.println();
        System.out.printf("Trucks have average horsepower of: %.2f.",averageTruck);

    }
}
