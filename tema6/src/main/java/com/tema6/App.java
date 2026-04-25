public class App
{
   public static void main(String[] args)
   {
      Depozit depozit = new Depozit();

      Produs p1 = new ProdusCompensat("1", "Tigaie dry cooker", 125.99, 15, 0.8);
      Produs p2 = new ProdusNecompensat("2", "Aragaz cu butelie", 1299.99, 5);
      Produs p3 = new ProdusNecompensat("3", "Cutzit japonez made in China", 75.99, 10);
      Produs p4 = new ProdusCompensat("4", "Set de pahare pepsi promotie", 49.99, 3, 0.5);
      Produs p5 = new ProdusCompensat("1", "Tigaie dry cooker", 125.99, 3, 0.8);
   
      depozit.adaugaProdus(p1);
      depozit.adaugaProdus(p2);
      depozit.adaugaProdus(p3);
      depozit.adaugaProdus(p4);
      depozit.adaugaProdus(p5);

      depozit.afiseazaInventar();   
   }
}
