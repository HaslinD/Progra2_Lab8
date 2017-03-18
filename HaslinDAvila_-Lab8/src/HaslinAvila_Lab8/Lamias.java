package HaslinAvila_Lab8;

import javax.swing.JOptionPane;

public class Lamias extends Hadas{
    private double Aleta;
    private int Branquias;

    public Lamias(double Aleta, int Branquias, String nombre, double altura, int edad, int salud, int poder) {
        super(nombre, altura, edad, salud, poder);
        if (Aleta > 0 && Aleta <= 5) {
            this.Aleta = Aleta;
        } else {
            while (Aleta <= 0 && Aleta > 5) {
                Aleta = Double.parseDouble(JOptionPane.showInputDialog(
                        "Ingrese el Tamaño Otravez"));
            }
        }
        if (Branquias > 0 && Branquias <= 8) {
            this.Branquias = Branquias;
        } else {
            while (Branquias <= 0 && Branquias > 8) {
                Branquias = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese el Tamaño Otravez"));
            }
        }
    }

    public double getAleta() {
        return Aleta;
    }

    public void setAleta(double Aleta) {
        if (Aleta > 0 && Aleta <= 5) {
            this.Aleta = Aleta;
        } else {
            while (Aleta <= 0 && Aleta > 5) {
                Aleta = Double.parseDouble(JOptionPane.showInputDialog(
                        "Ingrese el Tamaño Otravez"));
            }
        }
    }

    public int getBranquias() {
        return Branquias;
    }

    public void setBranquias(int Branquias) {
        if (Branquias > 0 && Branquias <= 8) {
            this.Branquias = Branquias;
        } else {
            while (Branquias <= 0 && Branquias > 8) {
                Branquias = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese el Tamaño Otravez"));
            }
        }
    }

    @Override
    public String toString() {
        return "Lamias: " + nombre;
    }
    
    
}
