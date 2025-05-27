import java.util.*;

public class TripApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Count of trips: ");
        int tripsCount = scanner.nextInt();

        int [] travelDistance = new int[tripsCount];
        int [] fuelConsuption = new int[tripsCount];
        int [] gasolinePrice = new int[tripsCount];
        int [] carTanksCapacity = new int[tripsCount];

        for (int i = 0; i < tripsCount; i++) {
            System.out.print(String.format("Travel Distance for trip_%d (km): ", i + 1));
            travelDistance[i] = scanner.nextInt();

            System.out.print(String.format("Fuel consumption per 100km for trip_%d: ", i + 1));
            fuelConsuption[i] = scanner.nextInt();

            System.out.print(String.format("Gasoline price per liter for trip_%d: ", i + 1));
            gasolinePrice[i] = scanner.nextInt();

            System.out.print(String.format("Tank capacity for trip_%d (liters): ", i + 1));
            carTanksCapacity[i] = scanner.nextInt();

            int fuelNeeded = (travelDistance[i] * fuelConsuption[i]) / 100;
            int totalCost = fuelNeeded * gasolinePrice[i];

            System.out.println(fuelNeeded > carTanksCapacity[i]
                ? "Tank is NOT enough!"
                : "Tank is enough");

            System.out.println("Fuel Needed: " + fuelNeeded);
            System.out.println("Total Cost: " + totalCost);
            System.out.println("-----");
        }

        int sum = Arrays.stream(travelDistance).sum();
        int max = Arrays.stream(travelDistance).max().orElse(0);
        int min = Arrays.stream(travelDistance).min().orElse(0);
        int avg = sum / tripsCount;

        System.out.println("Total Distance: " + sum);
        System.out.println("Max Distance: " + max);
        System.out.println("Min Distance: " + min);
        System.out.println("Average Distance: " + avg);

    }
}
