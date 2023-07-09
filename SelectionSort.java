public class SelectionSort extends Sortable {
    public int[] Do(int[] data, int n) {
        start();

        int tmp, min;
        for(int i = 0; i < n - 1; i++) {
            min = i;
            for(int j = i + 1; j < n; j++) {
                count();
                if(data[j] < data[min]) {
                    min = j;
                }
            }
            tmp = data[i];
            data[i] = data[min];
            data[min] = tmp;
        }

        end();
        return data;
    }

    public String getName() {
        return "基本選択法 / Selection sort";
    }
}
