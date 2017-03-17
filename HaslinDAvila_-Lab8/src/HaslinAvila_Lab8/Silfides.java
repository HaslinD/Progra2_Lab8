package HaslinAvila_Lab8;

import javax.swing.JOptionPane;

public class Silfides extends Hadas{
    private int Alas;

    public Silfides(int Alas, String nombre, double altura, int edad, int salud, int poder) {
        super(nombre, altura, edad, salud, poder);
        if (Alas >= 6) {
            this.Alas = Alas;
        } else {
            while (Alas < 6) {
                Alas = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese la cantidad de alas otravez"));
            }
        }
    }

    public int getAlas() {
        return Alas;
    }

    public void setAlas(int Alas) {
        if (Alas >= 6) {
            this.Alas = Alas;
        } else {
            while (Alas < 6) {
                Alas = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese la cantidad de alas otravez"));
            }
        }
    }

   
    @Override
    public String toString() {
        return "Silfides: " + nombre;
    }

}
