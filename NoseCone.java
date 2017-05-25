
public class NoseCone extends Rocket {
	private double mass;
	private double coefficientOfDrag;
	private double surfaceArea;
	private String shape;
	private double length;
	private double diameter;
	
	public NoseCone(double mass, double CoD, double surfaceArea, String shape, double length, double diameter) {
		super (mass, CoD, surfaceArea, length);
		this.mass = mass;
		this.coefficientOfDrag = CoD;
		this.surfaceArea = surfaceArea;
		this.shape = shape;
		this.length = length;
		this.diameter = diameter;
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

}
