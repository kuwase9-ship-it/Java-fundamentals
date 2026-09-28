package src.java_method;

public class Ride {
        public static void main(String[] args) {
        
        double distanceInMiles = 18.5;       
        int timeOfDay = 22;                  
        String weatherCondition = "Rain";   
        double baseFare;

       
        switch (weatherCondition) {
            case "Clear":
                baseFare = 5.00;
                break;
            case "Rain":
                baseFare = 7.50;
                break;
            case "Snow":
                baseFare = 10.00;
                break;
            default:
                baseFare = 5.00; 
        }

        
        double fare = baseFare + (distanceInMiles * 1.50);

        
        if ((timeOfDay >= 17 && timeOfDay <= 19) || distanceInMiles > 15) {
            fare += 3.00;
        }

        
        if (timeOfDay >= 0 && timeOfDay <= 5) {
            fare *= 0.80; 
        }

        // --- Task 4: Output ---
        System.out.println("DriveMe Ride Summary:");
        System.out.println("----------------------");
        System.out.println();
        System.out.println("Distance: " + distanceInMiles + " miles");
        System.out.println("Time of Day: " + timeOfDay + ":00 hrs");
        System.out.println("Weather: " + weatherCondition);
        System.out.println("Final Fare: $" + fare);
    }
}



