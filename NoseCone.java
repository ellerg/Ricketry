import flanagan.integration.Integration;
import java.math;

public class NoseCone extends Rocket {
	private double mass;
	private double coefficientOfDrag;
	private double surfaceArea;
	private String shape;
	private double length;
	private double diameter;
	private double C;
	
	public NoseCone(double mass, double CoD, double surfaceArea, String shape, double length, double diameter) {
		super (mass, CoD, surfaceArea, length);
		this.mass = mass;
		this.coefficientOfDrag = CoD;
		this.surfaceArea = surfaceArea;
		this.shape = shape;
		this.length = length;
		this.diameter = diameter;
		this.C = length/diameter;
	}
	
	public double getMass(){
		return this.mass;
	}
	
	public double getCoD(){
		//Need equations for calculation
		return this.coefficientOfDrag;
	}
	
	public double getSurfaceArea(){
		//Need equations for calculation
		return this.surfaceArea;
	}
	
	public String getShape(){
		return this.shape;
	}
	
	public double getLength(){
		return this.length;
	}
	public double getDiameter(){
		return this.diameter;
	}
	public double getSurfaceArea(){
		if(shape.equals(ogive)){
			return integration(Math.sqrt(Math.pow(diameter((C*C)+.25), 2) - Math.pow(x, 2)) (diameter((C*C)+.25), 2), 0, height );
		}
		else if(shape.equals(conical)){
			return (3.14159)* Math.pow((diameter/2), 2) + (3.14159)*(diameter/2)*(Math.sqrt(Math.pow(diameter/2,2)+Math.pow(height, 2)));
		}
		else if(shape.equals(eliptical)){
			return (2*3.14159)*integration(-(10/Math.pow(diameter/2, 2) )Math.pow(x, 2) + height, 0, height);
		}
	}
}
