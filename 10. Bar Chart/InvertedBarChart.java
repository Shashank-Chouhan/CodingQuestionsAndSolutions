public class InvertedBarChart {
    public static void main(String[] args) {
        int[] a = {3, 5, 1, 0, 7, 6};
        int max = 7;
        int len = a.length;
        for (int i = 0; i < max; i++) {
            for (int p = 0; p < len; p++) {
                if (a[p] == 0) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                    a[p] -= 1;
                }
            }
            System.out.println();
        }
    }
}
