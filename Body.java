
public class Body extends Rocket {

	public Body(double mass, double thrust, double CoD, double surfaceArea) {
		super(mass, thrust, CoD, surfaceArea);
		t = thrust
		// TODO Auto-generated constructor stub
	}
	public double surfaceArea(double length, double diameter){
		return (3.1415926353 * diameter * length)
	}

}
