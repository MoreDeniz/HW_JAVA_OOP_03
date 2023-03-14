import java.util.ArrayList;
import java.util.List;

public abstract class Polygon extends Figure{
    protected List<Double> sides = new ArrayList<>();

    protected Polygon(double... sides) throws Exception {
        for (double side : sides) {
            if (side <= 0){
                throw new Exception("Такого многоугольника не существует! " +
                        "Стороны должны быть положительными.");
            }
        }
    }

    public double perimeter(){
        double perimeter = 0;
        for (double side : this.sides){
            perimeter += side;
        }
        return perimeter;
    }
    @Override
    public String toString(){
        return super.toString() + "Стороны: " + sides +
                "; Площадь: "  + this.area() + "; Периметр: " + this.perimeter();
    }
}
