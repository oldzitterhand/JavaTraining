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
	
	public List<Vehicle> finadAllFlyables() {
		return vehicleRepo.finadAllFlyables();
	}
	
	public List<Vehicle> finadAllFloatables() {
		return vehicleRepo.finadAllFloatables();
	}
	
	@Override
	public List<Vehicle> finadAllDriveables() {
		return vehicleRepo.finadAllDriveables();
	}

}
