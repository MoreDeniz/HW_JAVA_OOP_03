public class Rectangular extends Polygon implements Perimeter{
    protected double sideA;
    private double sideB;
    public Rectangular(double sideA, double sideB) throws Exception {
        this.sides.add(sideA);
        this.sides.add(sideB);
        this.sides.add(sideA);
        this.sides.add(sideB);
    }

    @Override
    public double area() {
        double s = this.sides.get(0) * this.sides.get(1);
        return s;
    }
}
