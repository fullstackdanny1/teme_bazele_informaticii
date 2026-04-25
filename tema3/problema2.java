package lectia3;

public class problema2 {
    public static void main(String[] args) {
        Carte carte1 = new Carte(100);
        Carte carte2 = new Carte(250);

        System.out.println(carte1.equals(carte2));
    }
}

class Carte {
    private int numarPagini = 0;

    Carte(int nrPagini){
        this.numarPagini = nrPagini;
    }

    public int getNumarPagini()
    {
        return this.numarPagini;
    }

    boolean equals(Carte carte)
    {
        return this.numarPagini == carte.getNumarPagini();
    }
}
