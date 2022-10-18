public class Point2D {

    private int x, y;

    public Point2D() {
        this(0, 0);  // это конструктор умолчаний, а конструктор по умолчанию создается Java когда вообще нет конструкторов, передаем управление на основной полный коструктор
    }

    public Point2D(int x, int y) {
        setX(x); // тут лучше передавать на сеттеры, т кт там может быть логика
        setY(y);
    }

    public int getX() {
        return x;
    }

    public final void setX(int x) { // лучше сделать сеттеры final, чтобы из нельзя было переопределить
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public final void setY(int y) { // лучше сделать сеттеры final, чтобы из нельзя было переопределить
        this.y = y;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(x);
        sb.append(", ");
        sb.append(y);
        sb.append(")");

        return sb.toString();
    }
}
