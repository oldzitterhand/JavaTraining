package training.service;

import java.util.List;

import training.model.Vehicle;

/**
 * The interface of the vehicle service
 * 
 * @author Patrick Metz
 */
public interface VehicleService {

	/**
	 * Finds all vehicles.
	 * @return a list of vehicles
	 */
	public List<Vehicle> findAllVehicles();
	
	/**
	 * Finds all flyable vehicles.
	 *@return a list of vehicles
	 */
	public List<Vehicle> findAllFlyables();

	/**
	 * Finds all floatable vehicles.
	 * @return a list of vehicles
	 */

	public List<Vehicle> findAllFloatables();

	/**
	 * Finds all driveable vehicles.
	 * @return a list of vehicles
	 */

	public List<Vehicle> findAllDriveables();
	
}
