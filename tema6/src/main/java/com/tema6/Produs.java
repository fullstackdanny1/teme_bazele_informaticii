public abstract class Produs
{
   String codProdus;
   String numeProdus;
   double pretDeBaza;
   int cantitateProdus; 

   Produs(String cod, String nume, double pret, int cantitate)
   {
      this.codProdus = cod;
      this.numeProdus = nume;
      this.pretDeBaza = pret;
      this.cantitateProdus = cantitate;
   }

   public abstract double calculeazaPret();

   @Override
   public String toString()
   {
      return "Cod produs: " + this.codProdus + "\n Nume produs: " + this.numeProdus + "\nPret: " + this.calculeazaPret() + "\nCantitate: " + this.cantitateProdus;
   }
}

