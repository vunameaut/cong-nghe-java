package test;

public class bt1 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên từ 100 đến 200 chia cho 5 dư 2 là: ");
        int i = 100;
        int count = 0;
        for (i = 100; i < 200; i++) {
            if (i % 5 == 2) {
                System.out.println(" " + i);
                count++;
            }
            i++;

        }

        System.out.println("\ncount: " + count);
    }
}
