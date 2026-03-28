package lectia3;

public class problema4 {
    public static void main(String[] args) {
        Piramida p1 = new Piramida();
        Piramida p2 = new Piramida(9);
        p1.afiseazaPiramida();
        p2.afiseazaPiramida();
    }
}

class Piramida{
    private int n;
    
    Piramida(){
        this.n = 5;
    }

    Piramida(int n){
        this.n = n;
    }

    public void afiseazaPiramida(){

        for(int i = 1; i <= this.n; i++){
            System.out.print(i);
            for(int j = this.n - i; j > 0; j--)
            {
                System.out.print(" " + i);
            }
            System.out.print('\n');
        }
    }
}
