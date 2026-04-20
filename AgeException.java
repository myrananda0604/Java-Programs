class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

class TestAge {
    public static void main(String[] args) {
        int age = 10;

        try {
            if (age < 18)
                throw new AgeException("Not eligible");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}