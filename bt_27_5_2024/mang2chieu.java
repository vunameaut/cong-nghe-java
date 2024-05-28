package test.bt_27_5_2024;

import java.util.Scanner;

import org.omg.CORBA.MARSHAL;

public class mang2chieu {

    // Hàm nhập và in ma trận 2 chiều
    void nhapvain() {
        int[][] a;
        int m, n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số hàng:");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột:");
        n = scanner.nextInt();

        a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập vào phần tử thứ a[" + i + "][" + j + "]:");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận A là:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Hàm in ma trận nghịch đảo
    void mangnghichdao() {
        int[][] a;
        int m, n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số hàng:");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột:");
        n = scanner.nextInt();

        a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập vào phần tử thứ a[" + i + "][" + j + "]:");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A là:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Ma trận đảo của A là:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[j][i] + "\t");
            }
            System.out.println();
        }
    }

    void contrunhachia() {
        int[][] a, b, c, e;
        int m, n, k, l;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số hàng của ma trận A:");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận A:");
        n = scanner.nextInt();

        a = new int[m][n];

        System.out.println("Nhập vào số hàng của ma trận B:");
        k = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận B:");
        l = scanner.nextInt();

        b = new int[k][l];

        System.out.println("Nhập các phần tử của ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập vào phần tử thứ a[" + i + "][" + j + "]:");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập các phần tử của ma trận B:");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                System.out.println("Nhập vào phần tử thứ b[" + i + "][" + j + "]:");
                b[i][j] = scanner.nextInt();
            }
        }

        // Kiểm tra điều kiện để nhân ma trận
        if (n != k) {
            System.out.println("Hai ma trận không thể nhân được với nhau.");
        } else {
            c = new int[m][l];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < l; j++) {
                    c[i][j] = 0;
                    for (int x = 0; x < n; x++) {
                        c[i][j] += a[i][x] * b[x][j];
                    }
                }
            }
            System.out.println("Ma trận tích của A và B là:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < l; j++) {
                    System.out.print(c[i][j] + "\t");
                }
                System.out.println();
            }
        }

        // Kiểm tra điều kiện để cộng và trừ ma trận
        if (m == k && n == l) {
            e = new int[m][n];
            System.out.println("Ma trận tổng của A và B là:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    e[i][j] = a[i][j] + b[i][j];
                    System.out.print(e[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("Ma trận hiệu của A và B là:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    e[i][j] = a[i][j] - b[i][j];
                    System.out.print(e[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Hai ma trận không cùng kích thước nên không thể cộng hoặc trừ.");
        }
    }

    void tongcacso() {
        int[][] a;
        int m, n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số hàng:");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột:");
        n = scanner.nextInt();

        a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập vào phần tử thứ a[" + i + "][" + j + "]:");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        float tbc = 0;
        int num = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                num += a[i][j];
            }

        }
        System.out.println("Tổng cac so trong Ma trận A là: " + num);

        tbc = (float) num / (m * n);
        System.out.println("Trung bình cộng của Ma trận A là: " + tbc);
    }

    void timmaxmin() {
        int[][] a;
        int m, n, max, min;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số hàng:");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột:");
        n = scanner.nextInt();

        a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập vào phần tử thứ a[" + i + "][" + j + "]:");
                a[i][j] = scanner.nextInt();
            }
        }
        max = min = a[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                } else if (min > a[i][j]) {
                    min = a[i][j];
                }

            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }

    void DuongCheo() {
        int[][] a;
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào kích thước của ma trận vuông:");
        n = scanner.nextInt();

        a = new int[n][n];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập vào phần tử thứ a[" + i + "][" + j + "]:");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A là:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        int numc = 0;
        int maxc = 0;
        int minc = 0;
        System.out.println("Các phần tử trên đường chéo chính là:\n");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][i] + "\t");
            numc += a[i][i];
            if (maxc < a[i][i]) {
                maxc = a[i][i];
            } else if (minc > a[i][i]) {
                minc = a[i][i];
            }
        }
        System.out.println("\ntong cac so tren duong cheo chinh la : " + numc);
        System.out.println("Max: " + maxc);
        System.out.println("Min: " + minc);
        System.out.println();

        int nump = 0;
        int maxp = 0;
        int minp = 0;
        System.out.println("Các phần tử trên đường chéo phụ là:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][n - 1 - i] + "\t");
            nump += a[i][n - 1 - i];
            if (maxp < a[i][n - 1 - i]) {
                maxp = a[i][n - 1 - i];
            } else if (minp > a[i][n - 1 - i]) {
                minp = a[i][n - 1 - i];
            }
        }
        System.out.println("\ntong cac so tren duong cheo phu la : " + nump);
        System.out.println("Max: " + maxp);
        System.out.println("Min: " + minp);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("1: Mảng 2 chiều"); // Mảng 2 chiều
        System.out.println("2: Mảng đảo chiều"); // Mảng đảo chiều
        System.out.println("3: Mảng nhân, chia"); // Mảng nhân, chia
        System.out.println("4: Tổng các số"); // Tổng các số
        System.out.println("5: Tìm max, min"); // Tìm max, min
        System.out.println("6: Đường chéo"); // Đường chéo

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        mang2chieu mang2Chieu = new mang2chieu();

        switch (choice) {
            case 1:
                mang2Chieu.nhapvain();
                break;
            case 2:
                mang2Chieu.mangnghichdao();
                break;
            case 3:
                mang2Chieu.contrunhachia();
                break;
            case 4:
                mang2Chieu.tongcacso();
                break;
            case 5:
                mang2Chieu.timmaxmin();
                break;
            case 6:
                mang2Chieu.DuongCheo();
                break;
            default:
                System.out.println("Bạn đã nhập sai"); // Bạn đã nhập sai
                break;
        }

        scanner.close(); 
    }
}