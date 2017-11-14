package training;

import training.model.Vehicle;
import training.service.VehicleService;
import training.service.VehicleServiceImpl;

/**
 * This is a simple app playing around with some vehicles.
 */
public class SimpleApp 
{
    public static void main( String[] args )
    {
        
        VehicleService vehicleService = new VehicleServiceImpl();
        
        System.out.println("All:");
        for (Vehicle v : vehicleService.findAllVehicles()) {
        	System.out.println(v);
        }

        System.out.println("Floatables:");
        for (Vehicle v : vehicleService.finadAllFloatables()) {
        	System.out.println(v);
        }

        System.out.println("Flyables:");
        for (Vehicle v : vehicleService.finadAllFlyables()) {
        	System.out.println(v);
        }

        System.out.println("Driveables:");
        for (Vehicle v : vehicleService.finadAllDriveables()) {
        	System.out.println(v);
        }
    }
}
