import java.util.*;

public class Depozit
{
   private ArrayList<Produs> inventar;

   Depozit()
   {
      inventar = new ArrayList<Produs>(50);
   }

   public void afiseazaInventar(){
     System.out.println("Inventar: ");
     for(Produs p : inventar)
     {
        System.out.println(p);
     } 
  }

  public void adaugaProdus(Produs produs)
  {
     for(Produs p : inventar)
     {
        if(p.codProdus.equals(produs.codProdus))
        {
           p.cantitateProdus += produs.cantitateProdus;
           return;
        }
     }
     inventar.add(produs);
  }

}
