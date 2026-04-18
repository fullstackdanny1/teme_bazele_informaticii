package com.tema5.ex4;

public class ConcordePlane extends CommercialPlane
{
    public ConcordePlane(String planeId, int totalEnginePower, int maxPassengers)
    {
        super(planeId, totalEnginePower, maxPassengers);
    }       

    public void getSuperSonic()
    {
        System.out.println(getPlaneId() + "- Supersonic mode activated");
    }
  
    public void getSubSonic()
    {
        System.out.println(getPlaneId() + "- Supersonic mode ddeactivated");
    }
  
}       
