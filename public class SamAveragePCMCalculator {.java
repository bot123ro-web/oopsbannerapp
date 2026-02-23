public class KilometerToMilesConverter {

    public static void main(String[] args) {

        // Given values
        double distanceInKilometers = 10.8;
        double conversionFactor = 1.6;   // 1 km = 1.6 miles

        // Result variable
        double distanceInMiles = distanceInKilometers * conversionFactor;

        // Output
        System.out.println("The distance " + distanceInKilometers 
                + " km in miles is " + distanceInMiles);
    }
}