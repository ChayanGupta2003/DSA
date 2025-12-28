public class Pascal2D {
    public static void main(String[] args) {
        int n = 5;
        int[][] p = new int[n][n];

        for (int i = 0; i < n; i++) {
            p[i][0] = 1;
            p[i][i] = 1;

            for (int j = 1; j < i; j++) {
                p[i][j] = p[i - 1][j - 1] + p[i - 1][j];
            }
        }

        // pyramid print
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
                System.out.print(p[i][j] + " ");

            System.out.println();
        }
    }
}
