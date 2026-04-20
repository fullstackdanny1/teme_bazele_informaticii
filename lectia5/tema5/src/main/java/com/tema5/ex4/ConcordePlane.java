package com.tema5.ex4;

public class ConcordePlane extends CommercialPlane
{
    public ConcordePlane(String planeId, int totalEnginePower, int maxPassengers)
    {
        super(planeId, totalEnginePower, maxPassengers);
    }       

    public void goSuperSonic()
    {
        System.out.println(getPlaneId() + "- Supersonic mode activated");
    }
  
    public void goSubSonic()
    {
        System.out.println(getPlaneId() + "- Supersonic mode ddeactivated");
    }
  
}       
