package HaslinAvila_Lab8;

public class Hamadriades extends Hadas{
    private double salArbol;

    public Hamadriades(double salArbol, String nombre, double altura, int edad, int salud, int poder) {
        super(nombre, altura, edad, salud, poder);
        this.salArbol = salArbol;
    }

    public double getSalArbol() {
        return salArbol;
    }

    public void setSalArbol(double salArbol) {
        this.salArbol = salArbol;
    }

    @Override
    public String toString() {
        return "Hamadriades: " + nombre;
    }
    
}
