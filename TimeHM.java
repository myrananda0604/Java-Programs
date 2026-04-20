class TimeHM {
    int h, m;

    TimeHM(int h, int m) {
        this.h = h;
        this.m = m;
    }

    TimeHM add(TimeHM t) {
        int m = this.m + t.m;
        int h = this.h + t.h + m / 60;
        m = m % 60;

        return new TimeHM(h, m);
    }

    void display() {
        System.out.println(h + "h " + m + "m");
    }

    public static void main(String[] args) {
        TimeHM t1 = new TimeHM(5, 40);
        TimeHM t2 = new TimeHM(3, 30);

        TimeHM result = t1.add(t2);
        result.display();
    }
}