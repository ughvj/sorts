public class InsertionSort extends Sortable {
    public int[] Do(int[] data, int n) {
        start();

        int j, tmp;
        for(int i = 1; i < n; i++) {
            j = i;
     
            while(j > 0 && data[j-1] > data[j]) {
                count();
                tmp = data[j-1];
                data[j-1] = data[j];
                data[j] = tmp;
                j--;
            }
        }

        end();
        return data;
    }

    public String getName() {
        return "基本挿入法 / Insertion sort";
    }
}
