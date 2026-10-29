public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle("white", "blue");
        System.out.println(rec.getPerimeter(10, 2));
        System.out.println(rec.getArea(5, 2));
        rec.getColor();

        Triangle tri = new Triangle("orange", "red");
        System.out.println(tri.getPerimeter(2, 5, 10));
        System.out.println(tri.getArea(10, 2));
        tri.getColor();

        Circle cir = new Circle("green", "purple");
        System.out.println(cir.getPerimeter(5));
        System.out.println(cir.getArea(5));
        cir.getColor();
    }
}
