public class Time {
    int hour, minute, second;

    // Constructor
    Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    // Method to add two time objects
    Time add(Time t) {
        int s = this.second + t.second;
        int m = this.minute + t.minute;
        int h = this.hour + t.hour;

        // Convert seconds to minutes
        if (s >= 60) {
            m += s / 60;
            s = s % 60;
        }

        // Convert minutes to hours
        if (m >= 60) {
            h += m / 60;
            m = m % 60;
        }

        return new Time(h, m, s);
    }

    // Display time
    void display() {
        System.out.println(hour + " hrs " + minute + " mins " + second + " secs");
    }
}
