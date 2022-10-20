public class Point2D {

    private int x, y;

    private double length;

    private static int pointsCounter;

    private final int pointID;

    public Point2D() {
        this(0, 0);  // это конструктор умолчаний, а конструктор по умолчанию создается Java когда вообще нет конструкторов, передаем управление на основной полный коструктор
    }

    public Point2D(int x, int y) {
        setX(x); // тут лучше передавать на сеттеры, т кт там может быть логика
        setY(y);
        pointID = pointsCounter++;
    }

    public int getX() {
        return x;
    }

    public final void setX(int x) { // лучше сделать сеттеры final, чтобы из нельзя было переопределить
        this.x = x;
        lengthCalc();
    }

    public int getY() {
        return y;
    }

    public final void setY(int y) { // лучше сделать сеттеры final, чтобы метод из нельзя было переопределить
        this.y = y;
        lengthCalc();
    }

    public double getLength() {
        return length;
    }

    public int getPointID() {
        return pointID;
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(x);
        sb.append(", ");
        sb.append(y);
        sb.append(")");

        return sb.toString();
    }

    public final String printLength() {
        //return this.toString() + ", length = " + this.getLength();
        StringBuilder sb = new StringBuilder(this.toString());
        sb.append(", length = ");
        sb.append(this.getLength());
        return sb.toString();

    }

    public final String printID {
        StringBuilder sb = new StringBuilder(this.toString());
        sb.append(", ID = ");
        sb.append(this.getPointID());
        return sb.toString();
    }

    private void lengthCalc() {
        length = Math.sqrt(x*x + y*y);
    }
}
