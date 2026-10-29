public class Triangle implements IFigure, IPerimeter, IArea {
    private String fillColor;
    private String borderColor;

    public Triangle(String fillColor, String borderColor) {
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
    
    public double getPerimeter(double firstSide, double secondSide, double ThirdSide) {
        return firstSide + secondSide + ThirdSide;
    }

    @Override
    public double getArea(double base, double height) {
        return 0.5 * base * height;
    }
}
