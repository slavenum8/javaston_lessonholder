public class Circle implements IFigure, IPerimeter, IArea {
    private String fillColor;
    private String borderColor;
    private final double PI = 3.14159;

    public Circle(String fillColor, String borderColor) {
        setFillColor(fillColor);
        setBorderColor(borderColor);
    }

    @Override
    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public void getColor() {
        System.out.println("Цвет заливки: " + fillColor + ". Цвет границы: " + borderColor + ".");
    }

    public double getPerimeter(double radius) {
        return 2 * PI * radius;
    }

    public double getArea(double radius) {
        return PI * (radius * radius);
    }
}
