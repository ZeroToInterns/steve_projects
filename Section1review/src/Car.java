
public class Car {
	public int maxRange;
	public int currentRange; 
	public String make;
	
	public Car(String make, int theMaxRange) {
		maxRange= theMaxRange;
		currentRange= 0;
		this.make= make;
	}
	
	public void charge() {
	currentRange= maxRange;
	}
	
	public void drive(int miles) {
		if(currentRange<=0) {
			System.out.println("Cannot Move");
		}
		else if(miles>=currentRange) {
			System.out.println("Not enough gas");
		}
		currentRange= currentRange-miles;
	}
	public String getMake() {
		return this.make;
	}
	
	public int getCurrentRange() {
		return currentRange;
	}
	
	public int getMaxRange() {
		return maxRange;
	}
}
