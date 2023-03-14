public abstract class Figure implements Comparable<Figure>{
    public abstract double area();

    public Figure(){
    }
    @Override
    public int compareTo(Figure o){
        return Double.compare(this.area(), o.area());
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ":\n";
    }
}
