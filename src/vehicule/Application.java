package vehicule;

public class Application {
	public static void main(String[] args){
		
		/*transmission et v pas trop pertinent comme nom de variable */
		Vehicule vehicule  = new Vehicule();
		vehicule.setTireSize(0.5588);
		vehicule.getEngine().setRpm(3500);
		vehicule.getTransmission().setCurrentGear(Transmission.FIFTH_GEAR);
		vehicule.getTransmission().setDifferentialRatio(4.041);
		Trip transmission = new Trip(100, vehicule);		
		System.out.println("Car traveling at : " + "->I need help to get this result<-");
		System.out.println("Expected trip duration : " + transmission.getExpectedTripDuration());
		System.out.println(("Car speed:" + transmission.calculVitesse()));
	}
	
	 
}
