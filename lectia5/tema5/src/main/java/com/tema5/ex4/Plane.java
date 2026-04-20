	package com.tema5.ex4;

	public class Plane
	{
	    private String planeId;
	    private int totalEnginePower;

	    public Plane(String planeId, int totalEnginePower)
	    {
		this.planeId = planeId;
		this.totalEnginePower = totalEnginePower;
	    }

	    public String getPlaneId()
	    { 
		return this.planeId;
	    }

	    public int getTotalEnginePower()
	    {
		return this.totalEnginePower;
	    }

	    public void takeOff(){
		System.out.println(this.getPlaneId() + " - Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete");
	    }

	    public void fly()
	    {
		System.out.println(this.getPlaneId() + "- Flying");
	    }

	    public void land()
	    {
		System.out.println(this.getPlaneId() + "- Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
            }

}
