class Distance {
    int m, cm, mm;

    Distance(int m, int cm, int mm) {
        this.m = m;
        this.cm = cm;
        this.mm = mm;
    }

    Distance add(Distance d) {
        int mm = this.mm + d.mm;
        int cm = this.cm + d.cm + mm / 10;
        int m = this.m + d.m + cm / 100;

        mm = mm % 10;
        cm = cm % 100;

        return new Distance(m, cm, mm);
    }

    void display() {
        System.out.println(m + "m " + cm + "cm " + mm + "mm");
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(2, 50, 5);
        Distance d2 = new Distance(3, 60, 8);

        Distance result = d1.add(d2);
        result.display();
    }
}