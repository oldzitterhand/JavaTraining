package training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import training.model.Vehicle;
import training.service.VehicleService;

/**
 * This is a simple app playing around with some vehicles.
 */
@ComponentScan(basePackages = "training")
public class SpringAppComponent 
{
	@Autowired
	private VehicleService service;

	public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAppComponent.class);
        SpringAppComponent p = context.getBean(SpringAppComponent.class);
        ((AbstractApplicationContext) context).close();
        
        p.start();
    }
    
    private void start()
    {
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
