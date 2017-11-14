package training.repository;

import java.util.List;

import training.model.Vehicle;

/**
 * The interface for the vehicle repository.
 * 
 * @author Patrick Metz
 */
public interface VehicleRepo {

	/**
	 * Finds all vehicles.
	 * @return a list of vehicles
	 */
	public List<Vehicle> findAllVehicles();
	
	/**
	 * Finds all flyable vehicles.
	 *@return a list of vehicles
	 */
	public List<Vehicle> finadAllFlyables();

	/**
	 * Finds all floatable vehicles.
	 * @return a list of vehicles
	 */

	public List<Vehicle> finadAllFloatables();

	/**
	 * Finds all driveable vehicles.
	 * @return a list of vehicles
	 */

	public List<Vehicle> finadAllDriveables();
}
