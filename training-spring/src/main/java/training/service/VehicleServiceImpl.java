package training.service;

import java.util.List;

import training.model.Vehicle;
import training.repository.VehicleRepo;
import training.repository.VehicleRepoImpl;

/**
 * A classic implementation of the vehicle service
 * 
 * @author Patrick Metz
 */
public class VehicleServiceImpl implements VehicleService {
	
	private VehicleRepo vehicleRepo;
	
	public VehicleServiceImpl() {
		vehicleRepo = new VehicleRepoImpl();
	}
	
	public List<Vehicle> findAllVehicles() {
		return vehicleRepo.findAllVehicles();
	}
	
	public List<Vehicle> findAllFlyables() {
		return vehicleRepo.findAllFlyables();
	}
	
	public List<Vehicle> findAllFloatables() {
		return vehicleRepo.findAllFloatables();
	}
	
	@Override
	public List<Vehicle> findAllDriveables() {
		return vehicleRepo.findAllDriveables();
	}

}
