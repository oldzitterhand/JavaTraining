package training.model;

public abstract class Vehicle {

	/** the make of the vehicle **/
	private String make;
	/** the model name **/
	private String model;
	
	/** number of wheels **/
	private int wheels;
	/** number of seats **/
	private int seats;
	
	/** can this thing swim? **/
	private boolean floatable;
	/** can this thing fly? **/
	private boolean flyable;
	/** can this thing drive on a road? **/
	private boolean driveable;
	
	/** Constructor of this class **/
	public Vehicle(String make, String model, int wheels, int seats,
			boolean floatable, boolean flyable, boolean driveable) {
		this.make = make;
		this.model = model;
		this.wheels = wheels;
		this.seats = seats;
		this.floatable = floatable;
		this.flyable = flyable;
		this.driveable = driveable;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public boolean isFloatable() {
		return floatable;
	}

	public boolean isFlyable() {
		return flyable;
	}
	
	public boolean isDriveable() {
		return driveable;
	}

	@Override
	public String toString() {
		return String.format("%s [make: %s, model: %s, wheels: %d, seats: %d, floatable: %s, flyable: %s]",
				this.getClass().getSimpleName() ,make, model, wheels, seats, floatable, flyable);
	}
}
