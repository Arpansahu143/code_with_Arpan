public class Q4 {

    private int x;
    private int y;

    public Q4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Q4(Q4 other) {
        this.x = other.x;
        this.y = other.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {

        Q4 p1 = new Q4(3, 4);

        Q4 p2 = new Q4(p1);

        System.out.println("Original Point p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Copied Point p2: (" + p2.getX() + ", " + p2.getY() + ")");

        p1.setX(7);
        p1.setY(8);

        System.out.println("\nAfter modifying p1:");
        System.out.println("Original Point p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Copied Point p2 (unchanged): (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
