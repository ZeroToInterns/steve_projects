
public class SodaCan implements Comparable{
	public double radius;
	public double height;
	public double contents;
	
	public static final double FLUID_OUNCES_CONVERSION = 0.554112554;
	
	
	public SodaCan(){
		this.radius=1.2109;
		this.height=4.704;
		double volume = Math.PI*radius*radius*height;
		this.contents= volume*FLUID_OUNCES_CONVERSION;
	}
		
	public SodaCan(double radius, double height){
		if(height <0 || radius <0) {
			this.height=4.704;
			this.radius=1.12109;
		}
		else{
			this.radius=radius;
			this.height=height;
		}
			//calculate volume
			double volume = Math.PI*this.radius*this.radius*height;
			
			//convert volume to fluid ounces and update capacity
			this.contents= volume*FLUID_OUNCES_CONVERSION; 
			
		}
		//returns the radius of the soda can 
		public double getRadius(){
			return this.radius;
		}
		//gets the height of the soda can 
		public double getHeight() {
			return this.height;
		}
		//drinks a certain amount of soda from the contents
		public void drink(double fluidOunces) {
			if(this.contents < fluidOunces) {
				System.out.println("You don't have enough soda to drink that much!");
			}
			else {
				this.contents -= fluidOunces;
			}
		}
		//returns the current contents of soda in the can 
		public double getContents() {
			return this.contents;
		}
	@Override
	//compare one soda to another
	public int compareTo(Object o) {
		SodaCan otherSoda = (SodaCan) o;
		if(this.contents > otherSoda.contents) {
			return 1;
		}
		else if(this.contents <otherSoda.contents) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
	

