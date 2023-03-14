import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Figures implements Iterable<Figure>{
    @Override
    public Iterator<Figure> iterator() {
        return figures.iterator();
    }
    ArrayList<Figure> figures = new ArrayList<>();
    // Вывод информации о фигуре
    public void showInfo(){
        for (Figure figure : figures){
            System.out.println(figure);
        }
    }
    // Добавить новую фигуру
    public void addFigure(Figure figure){
        this.figures.add(figure);
    }
    // Удалить фигуру
    public void removeFigure(int i){
        this.figures.remove(i);
    }
    // Изменить фигуру по индексу
    public void changeFigure(int i, Figure figure){
        this.figures.set(i, figure);
    }
    // Сортировать по площади
    public void sortByArea(){
        Collections.sort(this.figures);
    }
    static void addNewFigure(Figures figures) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выбери фигуру: \n1 - Круг\n2 - Прямоугольник\n3 - Квадрат\n" +
                "4 - Треугольник\n");
        int num = scan.nextInt();
        switch (num){
            case 1:
                System.out.println("Введите радиус: ");
                double radius = scan.nextInt();
                try {
                    figures.addFigure(new Circle(radius));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                System.out.println("Введите длину: ");
                double sideA = scan.nextInt();
                System.out.println("Введите ширину: ");
                double sideB = scan.nextInt();
                try {
                    figures.addFigure(new Rectangular(sideA, sideB));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case 3:
                System.out.println("Введите длину стороны: ");
                sideA = scan.nextInt();
                try {
                    figures.addFigure(new Square(sideA));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case 4:
                System.out.println("Введите длину стороны A: ");
                sideA = scan.nextInt();
                System.out.println("Введите длину стороны B: ");
                sideB = scan.nextInt();
                System.out.println("Введите длину стороны C: ");
                double sideC = scan.nextInt();
                try {
                    figures.addFigure(new Triangular(sideA, sideB, sideC));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                System.out.println("Животное:\t Неверный ввод!");
                break;
        }
        scan.close();
    }
}
