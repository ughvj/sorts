import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sortable[] sorts = new Sortable[6];
        sorts[0] = new BubbleSort();
        sorts[1] = new InsertionSort();
        sorts[2] = new MergeSort();
        sorts[3] = new QuickSort();
        sorts[4] = new SelectionSort();
        sorts[5] = new ShellSort();

        for (Sortable s: sorts) {
            System.out.println(s.getName());
            System.out.println(" 比較回数一覧: ");
            for (int i=0; i<4; i++) {
                int n = (int)Math.pow(10, i+1);
                s.Do(generateArrayRandomly(n), n);
                System.out.println("  データ数 " + n + " : " + s.getCount() + "  (" + s.getExecTimeNano() + " ns)");
            }
            System.out.println("");
        }
    }

    private static int[] generateArrayRandomly(int n) {
        Random r = new Random();
        int[] data = new int[n];

        for (int i=0; i<n; i++) data[i] = r.nextInt(65535);

        return data;
    }
}
