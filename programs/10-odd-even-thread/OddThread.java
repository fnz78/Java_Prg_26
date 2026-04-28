package addeventhread;

public class OddThread extends Thread {
    int n;

    public OddThread(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Thread : " + i);
            }
        }
    }
}
