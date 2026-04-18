package com.tema5.ex4;

public class CommercialPlane extends Plane
{
    private int maxPassengers;

    public CommercialPlane(String planeId, int totalEnginePower, int maxPassengers)
    {
        super(planeId, totalEnginePower);
	this.maxPassengers = maxPassengers;
    }

    public String getMaxPassengers(){
        return this.maxPassengers();
    }
}


