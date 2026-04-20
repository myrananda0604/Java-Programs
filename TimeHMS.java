class TimeHMS {
    int h, m, s;

    TimeHMS(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    TimeHMS add(TimeHMS t) {
        int s = this.s + t.s;
        int m = this.m + t.m + s / 60;
        int h = this.h + t.h + m / 60;

        s = s % 60;
        m = m % 60;

        return new TimeHMS(h, m, s);
    }

    void display() {
        System.out.println(h + "h " + m + "m " + s + "s");
    }

    public static void main(String[] args) {
        TimeHMS t1 = new TimeHMS(2, 45, 50);
        TimeHMS t2 = new TimeHMS(3, 30, 20);

        TimeHMS result = t1.add(t2);
        result.display();
    }
}