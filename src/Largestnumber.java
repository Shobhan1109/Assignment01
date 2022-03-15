public class Largestnumber {
    public static void main(String[] args) {
        Integer a = 968, b = 560, c = 697;
        if (a > b) {
            if (a < c) {
                System.out.println(c + " c  is the Largest number.");
            } else {
                System.out.println((a + " a is the Largest number"));
            }
        } else {
            if (b > a) {
                if (b < c) {
                    System.out.println(c + " c is the Largest number.");
                } else {
                    System.out.println(b + " b is the Largest number");
                }
            }

        }

    }

}
