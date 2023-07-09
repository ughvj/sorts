public class BubbleSort extends Sortable {
    public int[] Do(int[] data, int n) {
        start();

        int tmp;
        for(int i = 0; i < n - 1; i++) {
            for(int j = n - 1; j >= i + 1; j--) {
                count();
                if(data[j-1] > data[j]) {
                    tmp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = tmp;
                }
            }
        }
        
        end();
        return data;
    }

    public String getName() {
        return "バブルソート(隣接交換法) / Bubble sort";
    }
}
