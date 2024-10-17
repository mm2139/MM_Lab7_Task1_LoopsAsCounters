public class LoopsAsCounters {
    public static void main(String[] args) {


        for (int i = 30; i>-1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i<31; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i<19; i = i+3) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 18; i>-1; i = i-3) {
            System.out.print(i + " ");
        }

    }
}