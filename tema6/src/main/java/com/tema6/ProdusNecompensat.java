public class ProdusNecompensat extends Produs
{

   ProdusNecompensat(String cod, String nume, double pret, int cantitate)
   {
      super(cod, nume, pret, cantitate);
   }

   @Override
   public double calculeazaPret()
   {
      return super.pretDeBaza; 
   }

}
