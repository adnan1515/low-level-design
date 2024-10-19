package solid;

interface Bike {

	
	public void turnOnEngine() throws Exception;
	public void Ride();
	/*
	 * If class B is sub-type of class A, then we should be able to replace B with A,
	 * 
	 * Subclasses to extend the functionality but not narrow it down
	 */
}
class MotorCycle implements Bike {

	@Override
	public void turnOnEngine() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Ride() {
		// TODO Auto-generated method stub
		
	}
	
}
class Cycle implements Bike {

	@Override
	public void turnOnEngine() throws Exception {
		throw new Exception("Engine not found");
		
	}

	@Override
	public void Ride() {
		// TODO Auto-generated method stub
		
	}
	
}
