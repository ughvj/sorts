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
            int[] data_10 = new int[10];
            int[] data_100 = new int[100];
            int[] data_1000 = new int[1000];
            int[] data_10000 = new int[10000];

            for (int i=0; i<10; i++) data_10[i] = 10 - i;
            for (int i=0; i<100; i++) data_100[i] = 100 - i;
            for (int i=0; i<1000; i++) data_1000[i] = 1000 - i;
            for (int i=0; i<10000; i++) data_10000[i] = 10000 - i;

            System.out.println(s.getName());
            System.out.println(" 比較回数一覧: ");

            s.Do(data_10, 10);
            System.out.println("  データ数 10    : " + s.getCount() + "  (" + s.getExecTimeNano() + " ns)");

            s.Do(data_100, 100);
            System.out.println("  データ数 100   : " + s.getCount() + "  (" + s.getExecTimeNano() + " ns)");

            s.Do(data_1000, 1000);
            System.out.println("  データ数 1000  : " + s.getCount() + "  (" + s.getExecTimeNano() + " ns)");

            s.Do(data_10000, 10000);
            System.out.println("  データ数 10000 : " + s.getCount() + "  (" + s.getExecTimeNano() + " ns)");

            System.out.println("");

        }
    }
}
