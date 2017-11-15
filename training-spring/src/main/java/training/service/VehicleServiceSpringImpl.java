package training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import training.model.Vehicle;
import training.repository.VehicleRepo;

/**
 * An implementation of the vehicle service using Spring
 * 
 * @author Patrick Metz
 */
@Component("vehicleService")
public class VehicleServiceSpringImpl implements VehicleService {
	
	@Autowired
	private VehicleRepo vehicleRepo;
	
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

	public VehicleRepo getVehicleRepo() {
		return vehicleRepo;
	}

	public void setVehicleRepo(VehicleRepo vehicleRepo) {
		this.vehicleRepo = vehicleRepo;
	}

}
