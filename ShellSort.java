public class ShellSort extends Sortable {
    public int[] Do(int[] data, int n) {
        start();

        for (int h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int j;
                int tmp = data[i];
                count();
                for (j = i - h; j >= 0 && data[j] > tmp; j -= h) {
                    data[j + h] = data[j];
                }
                data[j + h] = tmp;
            }
        }

        end();
        return data;
    }

    public String getName() {
        return "シェルソート(改良挿入法) / Shell sort";
    }
}

