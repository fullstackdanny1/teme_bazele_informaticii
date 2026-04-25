package lectia3;

public class problema3 {
    public static void main(String[] args) {
        Patrat p1 = new Patrat();
        Patrat p2 = new Patrat(15);

        System.out.println(p1);
        System.out.println(p2);
    }
}

class Patrat{
    private int latura;

    Patrat() {
        latura = 10;
    }

    Patrat(int l)
    {
        this.latura = l;
    }

    public int calculeazaAria(){
        return latura * latura;
    }

    public String toString(){
        return "Patrat " + this.latura + " Aria " + this.calculeazaAria();
    }
}
