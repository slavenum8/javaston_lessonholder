public interface IArea {

    default double getArea(double height, double length) {
        return height * length;
    }
}
