public class pattern2 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                a++;
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
