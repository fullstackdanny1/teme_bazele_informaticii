package com.tema5.ex4;

public class MigPlane extends FighterPlane
{
    public MigPlane(String planeId, int totalEnginePower)
    {
        super(planeId, totalEnginePower);
    }

    public void normalGeometry()
    {
        System.out.println(getPlaneId() + " - Normal geometry selected");
    }
    
    public void highSpeedGeometry()
    {
        System.out.println(getPlaneId() + " - High speed geometry selected");
    }
        
}

