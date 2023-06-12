public class Main {
    public static void main(String[] args) {
        boolean k = true;
        boolean[] doors = new boolean[100];
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0)
                    k = !k;
            }
            doors[i - 1] = k;
            if (!k) // ! из-за того что не учитываем деление самого на себя
                System.out.println("Door No " + i + " is closed ");
            else
                System.out.println("Door No " + i + " is opened ");
        }
    }
}