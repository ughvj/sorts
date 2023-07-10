public class Sortable {
    private int comparing_count;

    private long startTime;
    private long endTime;

    public int[] Do(int[] data, int n) {
        return data;
    };

    protected void count() {
        this.comparing_count++;
    }

    protected void start() {
        this.startTime = System.nanoTime();
    }

    protected void end() {
        this.endTime = System.nanoTime();
    }

    public int getCount() {
        return this.comparing_count;
    }

    public void clearCount() {
        this.comparing_count = 0;
    }

    public String getName() {
        return "This is super class.";
    }

    public long getExecTimeNano() {
        return this.endTime - this.startTime;
    }
}
