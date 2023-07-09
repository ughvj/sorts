public class MergeSort extends Sortable {
    public int[] Do(int[] data, int n) {
        start();
        int[] buff = new int[n];

        sort_recursive(data, buff, 0, n - 1);
        buff = null;

        end();
        return data;
    }

    private void sort_recursive(int[] data, int[] buff, int left, int right) {
        if (left >= right) {
            return ;
        }

        int i;
        int center = (left + right) / 2;
        int p = 0;
        int j = 0;
        int k = left;

        sort_recursive(data, buff, left, center);
        sort_recursive(data, buff, center + 1, right);

        for (i = left; i <= center; i++) {
            buff[p++] = data[i];
        }
        while (i <= right && j < p) {
            count();
            data[k++] = (buff[j] <= data[i]) ? buff[j++] : data[i++]; 
        }
        while (j < p) {
            data[k++] = buff[j++];
        }
    }

    public String getName() {
        return "マージソート / Merge sort";
    }
}
