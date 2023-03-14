public class Triangular extends Polygon implements Perimeter {
    private double sideA, sideB, sideC;

    public Triangular(double sideA, double sideB, double sideC) throws Exception{
        this.sides.add(sideA);
        this.sides.add(sideB);
        this.sides.add(sideC);
        if (sideA + sideB <= sideC ||
                sideB + sideC <= sideA ||
                sideA + sideC <= sideB) {
            throw new Exception("Такой треугольник не существует!\n");
        }
    }

    @Override
    public double area() {
        double p = this.perimeter() / 2;
        double s = Math.sqrt(p * (p - this.sides.get(0)) * (p - this.sides.get(1)) * (p - this.sides.get(2)));
        return s;
    }
}
