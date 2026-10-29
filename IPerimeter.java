public interface IPerimeter {

    default double getPerimeter(double height, double length) {
        return height * length;
    }

}
