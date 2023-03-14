public class Circle extends Figure implements CircleLong{
    private double radius;
    double pi = 3.14;

    public Circle(double radius) throws Exception {
        this.radius = radius;
        if (radius <= 0) {
            throw new Exception(String.format("Круг радиусом: %.1f не существует!\n", radius));
        }
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public double circleLong() {
        return 2 * pi * getRadius();
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "Радиус: " + this.radius + "; Площадь: " + this.area()
                + "; Длина окружности: " + this.circleLong();
    }
}
