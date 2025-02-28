import ejercicios.e1.Circle;
import ejercicios.e1.Cylinder ;

public class Main {
    public static void main(String[] args) {
        // Crear círculos con diferentes constructores
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(7.5, "blue");

        // Imprimir información de los círculos
        System.out.println("Círculo 1: " + circle1);
        System.out.println("Área del círculo 1: " + circle1.getArea());

        System.out.println("Círculo 2: " + circle2);
        System.out.println("Área del círculo 2: " + circle2.getArea());

        System.out.println("Círculo 3: " + circle3);
        System.out.println("Área del círculo 3: " + circle3.getArea());

        // Modificar propiedades de un círculo
        circle1.setRadius(3.0);
        circle1.setColor("green");

        System.out.println("Círculo 1 modificado: " + circle1);
        System.out.println("Nueva área del círculo 1: " + circle1.getArea());

        // Crear cilindros con diferentes constructores
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(10.0);
        Cylinder cylinder3 = new Cylinder(4.0, 12.0);

        // Imprimir información de los cilindros
        System.out.println("Cilindro 1: " + cylinder1);
        System.out.println("Volumen del cilindro 1: " + cylinder1.getVolume());

        System.out.println("Cilindro 2: " + cylinder2);
        System.out.println("Volumen del cilindro 2: " + cylinder2.getVolume());

        System.out.println("Cilindro 3: " + cylinder3);
        System.out.println("Volumen del cilindro 3: " + cylinder3.getVolume());
    }
}