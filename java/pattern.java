public class pattern {
    public static void main(String[] args) {
        // int n = 4;
        // int m = 5;
        // solid rectangle
        // // for (int i = 1; i <= n; i++) {
        // // for (int j = 1; j <= m; j++) {
        // // System.out.print("*");
        // // }
        // // System.out.println();
        // }

        // // hollow rectangle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || i == n || j == 1 || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // half pyramid
        // for(int i=1;i<=4;i++){
        // for (int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // inverted half pyramid
        // for(int i=4;i>=1;i--){
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // inverted half pyramid (rotated 180 degree)
        // int n = 4;

        // // outer ka outer loop for rows
        // for (int i = 1; i <= n; i++) {

        // // inner loop for space print
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }

        // // inner loop for star print
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // number pattern -> half pyramid
        // int n = 5;
        // outer loop
        // for (int i = 1; i <= n; i++) {

        // inner loop
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // inverted half pyramid number pattern
        int n = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
