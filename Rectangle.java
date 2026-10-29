public class Rectangle implements IFigure, IPerimeter, IArea {
    private String fillColor;
    private String borderColor;

    public Rectangle(String fillColor, String borderColor) {
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
}
