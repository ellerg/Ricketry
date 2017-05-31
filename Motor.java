
public class Motor extends Rocket {
	private double m;
	private double ti;
	private double dt;
	private double bt;

	public Motor(double mass, double totalimpulse, double CoD, double surfaceArea, double delaytime, double burntime
			) {
		super(mass, thrust, CoD, surfaceArea);
		m = mass;
		ti = totalimpulse;
		dt = delaytime;
		bt = burntime;
		// TODO Auto-generated constructor stub
	}
	public double getMass(){
		return m;
	}
	public double getTotalImpulse(){
		return ti;
	}

	public double getDelayTime(){
		return dt;
	}

	public double getBurnTime()){
		return bt;
	}

	public double getTotalTime(){
		return bt + dt;
	}


}
