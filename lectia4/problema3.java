package lectia4;
import java.io.*;

public class problema3 {
    public static void main(String[] args){
        
        String linie;
        String linieCitita;
        String fisier;
        int numarLiniiEgale = 0;
        BufferedReader br = null;
        BufferedReader fr = null;
        
        try {
            
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduceti o linie de text: ");
            linie = br.readLine();

            System.out.println("Introduceti numele unui fisier: ");
            fisier = br.readLine();

            fr = new BufferedReader(new FileReader(fisier));

            while((linieCitita = fr.readLine()) != null)
            {
                if(linie.equals(linieCitita)) numarLiniiEgale++;
            }

            System.out.println("Numarul de linii din fisier egale cu linia citita este: " + numarLiniiEgale);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

}