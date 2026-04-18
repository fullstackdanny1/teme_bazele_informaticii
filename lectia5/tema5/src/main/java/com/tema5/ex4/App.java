package com.tema5.ex4;

public class App
{ 
   public static void Main(String[] args)
   {
      Plane boeing = new BoeingPlane("11223344", 150000, 200);
      Plane concorde  = new ConcordePlane("13243544", 170000, 150);
      Plane mig = new MigPlane("23453314", 300000);
      Plane tomcat = new TomCatPlane("11563314", 350000);

      boeing.getTotalEnginePower();
      boeing.getMaxPassangers();
      boeing.takeOff();
      boeing.fly();
      boeing.land();
    
      concorde.getTotalEnginePower();
      concorde.getMaxPassangers();
      concorde.takeOff();
      concorde.fly();
      concorde.land();
      concorde.goSuperSonic();
      concorde.goSubSonic();
   
      mig.launchMissile();
      mig.normalGeometry();
      mig.highSpeedGeometry();

      tomcat.launchMissile();
      tomcat.refuel();
   }
}
