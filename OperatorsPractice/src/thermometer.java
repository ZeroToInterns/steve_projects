
public class thermometer {

	public static String returnTemp(int temp) {
		if(temp>=90) {
			return "Too Hot"; 
		}
		else if(temp>60 && temp<90) {
			return "Just right";
		}
		else
	{
		return "Too cold";
	}
	}
		// check if temp is greater than 90 
			// if it is then return too hot 
		// check if temp is greater than 60 and less than 90
			// if it is then return just right
		//return too cold
}