package ExamPreparationFinalExam;

import java.util.*;

public class P3NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCars = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();
        for (int car = 1; car <= countCars; car++) {
            String data = scanner.nextLine();//Audi A6|38000|62
            String carModel = data.split("\\|")[0];
            int mileage = Integer.parseInt(data.split("\\|")[1]);
            int fuel = Integer.parseInt(data.split("\\|")[2]);
            carsMap.putIfAbsent(carModel, new ArrayList<>());//добавя колата само ако я няма
            carsMap.get(carModel).add(0, mileage);
            carsMap.get(carModel).add(1, fuel);

        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            if (input.contains("Drive")) {
                String car = input.split(" : ")[1];
                int distance = Integer.parseInt(input.split(" : ")[2]);
                int consumedFuel = Integer.parseInt(input.split(" : ")[3]);

                int currentFuel = carsMap.get(car).get(1);
                int currentDistance = carsMap.get(car).get(0);
                if (currentFuel >= consumedFuel) {//отиваме на пътешествие
                    carsMap.get(car).set(1, currentFuel - consumedFuel);
                    carsMap.get(car).set(0, currentDistance + distance);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, consumedFuel);
                } else {
                    System.out.println("Not enough fuel to make that ride");
                }
                if (carsMap.get(car).get(0) >= 100000) {
                    System.out.println("Time to sell the " + car + "!");
                    carsMap.remove(car);
                }
            } else if (input.contains("Refuel")) {
                String car = input.split(" : ")[1];
                int fuelToAdd = Integer.parseInt(input.split(" : ")[2]);
                int currentFuel = carsMap.get(car).get(1);
                if (currentFuel + fuelToAdd > 75) {
                    carsMap.get(car).set(1, 75);
                    System.out.printf("%s refueled with %d liters%n", car, 75 - currentFuel);
                } else {
                    carsMap.get(car).set(1, currentFuel + fuelToAdd);
                    System.out.printf("%s refueled with %d liters%n", car, fuelToAdd);

                }

            } else if (input.contains("Revert")) {
                String car = input.split(" : ")[1];
                int distance = Integer.parseInt(input.split(" : ")[2]);
                int currentDistance = carsMap.get(car).get(0);
                carsMap.get(car).set(0, distance + currentDistance);
                int kmAfterRevert = currentDistance - distance;
                if (kmAfterRevert < 10000) {
                    kmAfterRevert = 10000;
                } else {
                    System.out.printf("%s mileage decreased by %d kilometers", car, distance);
                }
                carsMap.get(car).set(0, kmAfterRevert);
            }
            input = scanner.nextLine();
        }
        carsMap.entrySet().forEach(entry -> {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey()
                    , entry.getValue().get(0), entry.getValue().get(1));
        });

    }
}
