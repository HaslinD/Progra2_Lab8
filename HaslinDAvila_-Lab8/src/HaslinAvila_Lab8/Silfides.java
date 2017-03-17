package HaslinAvila_Lab8;

public class Silfides extends Hadas{
    private int Alas;

    public Silfides(int Alas, String nombre, double altura, int edad, int salud, int poder) {
        super(nombre, altura, edad, salud, poder);
        this.Alas = Alas;
    }

    public int getAlas() {
        return Alas;
    }

    public void setAlas(int Alas) {
        this.Alas = Alas;
    }

   
    @Override
    public String toString() {
        return "Silfides: " + nombre;
    }

}
