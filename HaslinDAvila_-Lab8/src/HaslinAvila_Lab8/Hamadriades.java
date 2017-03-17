package HaslinAvila_Lab8;

public class Hamadriades extends Hadas{
    private double salArbol;

    public Hamadriades(double salArbol, String nombre, double altura, int edad, int salud, int poder) {
        super(nombre, altura, edad, salud, poder);
        if (salArbol <= 0) {
            this.salArbol = 0;
        } else {
            this.salArbol = salArbol;
        }
    }

    public double getSalArbol() {
        return salArbol;
    }

    public void setSalArbol(double salArbol) {
        if (salArbol <= 0) {
            this.salArbol = 0;
        } else {
            this.salArbol = salArbol;
        }
    }

    @Override
    public String toString() {
        return "Hamadriades: " + nombre;
    }
    
}
