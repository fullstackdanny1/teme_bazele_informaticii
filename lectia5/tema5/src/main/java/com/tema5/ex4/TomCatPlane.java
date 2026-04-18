package com.tema5.ex4;

public class TomCatPlane extends FighterPlane
{
    public TomCatPlane(String planeId, int totalEnginePower)
    {
        super(planeId, totalEnginePower);
    }
   
    public void refuel()
    {
        System.out.println(getPlaneId() + " - Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete");
    }
        
}
