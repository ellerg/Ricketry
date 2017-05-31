
public class Fins extends Rocket{
	private double rc;
	private double tc;
	private double h;
	private double s;
	
	public Fins(double mass, double rootchord, double tipchord, double sweep, double CoD, double height ){
		super(mass, thrust, CoD, surfaceArea);
		rc = rootchord;
		tc = tipchord;
		h = height;
		s = sweep;
		
	}
	public double surfaceArea(double rootchord, double tipchord, double sweep, double height){
		//pl1 = partial length 1
		double pl1 = Math.tan(sweep)*4;
		//pa1 = partial area 1
		double pa1 = Math.sqrt(Math.pow(pl1, 2) + Math.pow(height,2));
		//pl2 = partial length 2 
		double pl2 = tipchord - pl1;
		//pa2 = partial area 2
		double pa2 = pl2 * height;
		//pl3 = partial area 3
		double pl3 = rootchord - pl1;
		//pa3 = partial area 3
		double pa3 = Math.sqrt(Math.pow(pl3, 2) + Math.pow(height,2));
		return 2 * (pa1+ pa2 + pa3);
	}
	public double getRootchord(){
		return rc;
	}
	public double getTipchord(){
		return tc;
	}
	public double getHeight(){
		return h;
	}
	public double getSweep(){
		return s;
	}
}
