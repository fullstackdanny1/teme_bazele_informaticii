public class ProdusCompensat extends Produs
{
   double coeficientDeCompensare;

   ProdusCompensat(String cod, String nume, double pret, int cantitate, double coeficient)
   {
      super(cod, nume, pret, cantitate);
      this.coeficientDeCompensare = coeficient;
   } 
   
   @Override
   public double calculeazaPret()
   {
      return super.pretDeBaza * this.coeficientDeCompensare;
   }

}
