public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        p1.setX(-1);
        p1.setY(2);
        System.out.println(p1);

        Point2D p2 = new Point2D(2, 4);
        System.out.println(p2);
    }
}
