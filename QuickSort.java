public class QuickSort extends Sortable {
    public int[] Do(int[] data, int n) {
        start();

        sort_recursive(data, 0, n-1);

        end();
        return data;
    }

    private void sort_recursive(int[] data, int left, int right) {
        if (left >= right) {
            return;
        }
        int p = data[(left+right)/2];
        int l = left, r = right, tmp;
        while(l <= r) {
            while(data[l] < p) l++;
            while(data[r] > p) r--;
            count();
            if (l <= r) {
                tmp = data[l];
                data[l] = data[r];
                data[r] = tmp;
                l++;
                r--;
            }
        }
        sort_recursive(data, left, r);
        sort_recursive(data, l, right);
    }

    public String getName() {
        return "クイックソート / Quick sort";
    }
}
