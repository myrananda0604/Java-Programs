class DistanceMC {
    int m, cm;

    DistanceMC(int m, int cm) {
        this.m = m;
        this.cm = cm;
    }

    DistanceMC add(DistanceMC d) {
        int cm = this.cm + d.cm;
        int m = this.m + d.m + cm / 100;
        cm = cm % 100;

        return new DistanceMC(m, cm);
    }

    void display() {
        System.out.println(m + "m " + cm + "cm");
    }

    public static void main(String[] args) {
        DistanceMC d1 = new DistanceMC(2, 80);
        DistanceMC d2 = new DistanceMC(1, 50);

        DistanceMC result = d1.add(d2);
        result.display();
    }
}