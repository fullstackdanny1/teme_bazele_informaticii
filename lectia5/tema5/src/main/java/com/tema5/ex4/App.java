package com.tema5.ex4;

public class App
{ 
   public static void main(String[] args)
   {
      Plane boeing = new BoeingPlane("11223344", 150000, 200);
      Plane concorde  = new ConcordePlane("13243544", 170000, 150);
      Plane mig = new MigPlane("23453314", 300000);
      Plane tomcat = new TomCatPlane("11563314", 350000);

      boeing.getTotalEnginePower();
      ((CommercialPlane)boeing).getMaxPassengers();
      boeing.takeOff();
      boeing.fly();
      boeing.land();
    
      concorde.getTotalEnginePower();
      ((CommercialPlane)concorde).getMaxPassengers();
      concorde.land();
      ((ConcordePlane)concorde).goSuperSonic();
      ((ConcordePlane)concorde).goSubSonic();
   
      ((FighterPlane)mig).launchMissile();
      ((MigPlane)mig).normalGeometry();
      ((MigPlane)mig).highSpeedGeometry();

      ((FighterPlane)tomcat).launchMissile();
      ((TomCatPlane)tomcat).refuel();
   }
}
