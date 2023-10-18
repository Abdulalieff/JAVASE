// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GeoShape circle = new Circle(5);
        GeoShape rectangle = new Rectangle(4, 6);
        GeoShape triangle = new Triangle(3, 8);

        System.out.println("Calculated Circle Area: " + circle.areaCalculator());

        System.out.println("Calculated Rectangle Area: " + rectangle.areaCalculator());

        System.out.println("Calculated Triangle Area: " + triangle.areaCalculator());
    }
}