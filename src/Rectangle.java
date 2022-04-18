public class Rectangle {
    private int x,y;
    private  int width,height;
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    public Rectangle() {
        this(0, 0, 1, 1);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
    }
}
