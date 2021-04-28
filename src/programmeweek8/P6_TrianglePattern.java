package programmeweek8;


public class P6_TrianglePattern {
    public static void main(String[] args) {
        P6_TrianglePattern row = new P6_TrianglePattern();
        row.triangle();

    }

    public void triangle() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }
}
