package training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.model.Vehicle;
import training.service.VehicleService;

/**
 * This is a simple app playing around with some vehicles.
 * We are using Springs XML-based application context here.
 * 
 * @author Patrick Metz
 */
public class SpringApp 
{
    public static void main( String[] args )
    {
    	new SpringApp();
    }
    
    public SpringApp()
    {
    	// open/read the application context file and get the service bean from the context
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    	VehicleService service = (VehicleService)ctx.getBean("vehicleService");
    	ctx.close();
      
    	System.out.println("All:");
    	for (Vehicle v : service.findAllVehicles()) {
    		System.out.println(v);
    	}

    	System.out.println("Floatables:");
    	for (Vehicle v : service.finadAllFloatables()) {
    		System.out.println(v);
    	}

    	System.out.println("Flyables:");
    	for (Vehicle v : service.finadAllFlyables()) {
    		System.out.println(v);
    	}

    	System.out.println("Driveables:");
    	for (Vehicle v : service.finadAllDriveables()) {
    		System.out.println(v);
    	}
    }
}
