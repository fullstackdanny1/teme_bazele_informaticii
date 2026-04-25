package com.tema5.ex4;

public class FighterPlane extends Plane
{
    public FighterPlane(String planeId, int totalEnginePower)
    {
        super(planeId, totalEnginePower);
    }

    public void launchMissile()
    {
        System.out.println(getPlaneId() + "- Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
    }    
}

