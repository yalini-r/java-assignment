public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5;

        int i = 0;
        do {
            int space = rows - i - 1;
            int s = 0;
            do {
                System.out.print(" ");
                s++;
            } while (s <= space);

            int j = 0;
            int num = 1;
            do {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i < rows);
    }
}
