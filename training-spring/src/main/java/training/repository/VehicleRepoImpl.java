package training.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import training.model.Aeroplane;
import training.model.Amphibian;
import training.model.Car;
import training.model.Ship;
import training.model.Vehicle;

@Component("vehicleRepo")
public class VehicleRepoImpl implements VehicleRepo {
	
	public List<Vehicle> findAllVehicles() {
		return createVehicles();
	}
	
	public List<Vehicle> findAllFlyables() {
		return createVehicles().stream().filter(v -> v.isFlyable()).collect(Collectors.toList());
	}
	
	public List<Vehicle> findAllFloatables() {
		return createVehicles().stream().filter(v -> v.isFloatable()).collect(Collectors.toList());
	}
	
	@Override
	public List<Vehicle> findAllDriveables() {
		return createVehicles().stream().filter(v -> v.isDriveable()).collect(Collectors.toList());
	}

	/**
	 * This method is actually a sort of database mock.
	 * @return a list of vehicles
	 */
	private List<Vehicle> createVehicles() {
		List<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(new Aeroplane("Airbus", "A380", 26, 500));
		vehicles.add(new Aeroplane("British Aircraft Corporation", "Concorde", 14, 300));
		
		vehicles.add(new Ship("Harland & Wolff", "RMS Titanic", 2400));
		vehicles.add(new Ship("Blohm & Voss", "Bismarck", 2200));
		
		vehicles.add(new Car("Ferrari", "Formula 1", 4, 1));
		vehicles.add(new Car("Skoda", "Octavia RS", 4, 5));
		
		vehicles.add(new Amphibian("Soviet Union", "BTR-80", 8, 10));
		
		return vehicles;
	}

}
