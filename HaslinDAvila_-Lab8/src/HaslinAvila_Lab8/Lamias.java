package HaslinAvila_Lab8;

public class Lamias extends Hadas{
    private double Aleta;
    private int Branquias;

    public Lamias(double Aleta, int Branquias, String nombre, double altura, int edad, int salud, int poder) {
        super(nombre, altura, edad, salud, poder);
        this.Aleta = Aleta;
        this.Branquias = Branquias;
    }

    public double getAleta() {
        return Aleta;
    }

    public void setAleta(double Aleta) {
        this.Aleta = Aleta;
    }

    public int getBranquias() {
        return Branquias;
    }

    public void setBranquias(int Branquias) {
        this.Branquias = Branquias;
    }

    @Override
    public String toString() {
        return "Lamias{" + "Aleta=" + Aleta + ", Branquias=" + Branquias + '}';
    }
    
    
}
