
public class thermoeter {
	private double temperature;

	public void raiseTemp(double currentTemp) {
		while(currentTemp<90) {
			currentTemp++;
		}
		
		temperature = currentTemp;
	}
	
 }

	public static void main(String[] args) {
		Thermometer therm = new Thermometer();
		therm.raiseTemp(65.0);
	}
}