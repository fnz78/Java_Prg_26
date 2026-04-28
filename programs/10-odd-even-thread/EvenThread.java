package addeventhread;

public class EvenThread extends Thread {
    int n;

    public EvenThread(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Thread : " + i);
            }
        }
    }
}
