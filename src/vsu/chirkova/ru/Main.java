package vsu.chirkova.ru;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту h (нечётная, >= 5) ");
        int h = scanner.nextInt();
        if (h < 5 || h % 2 == 0)
             System.out.print("Неверное число, попробуйте снова");
        else
            print(h); }
        public static void print(int h){
            int w = h;
            int firstBackSlash = 2;
            int firstSlash = w - 2;
            int between = (h - 3) / 2;
            int nextBackSlash = ((w - 1) / 2) + 2;
            int nextSlash = ((w - 1) / 2);
            for (int r = 0; r < between + 1; r++) {
                if (r == 0) {
                    System.out.print('*');
                    for (int c = 1; c < w - 1; c++) {
                        System.out.print(' ');
                    }
                    System.out.println('*');
                } else {
                    System.out.print('|');
                    for (int c = 2; c <= w - 2; c++) {
                        if (c == firstBackSlash)
                            System.out.print('\\');
                        else {
                            System.out.print(' ');
                        }
                        if (c == firstSlash)
                            System.out.print('/');
                    }
                    System.out.println('|');
                    firstSlash--;
                    firstBackSlash++;

                }
            }
            for (int r = between + 1; r < h; r++) {
                if (r == between + 1) {
                    System.out.print('|');
                    for (int c = 1; c <= w - 2; c++) {
                        if (c == ((w - 1) / 2)) {
                            System.out.print('*');
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println('|');
                } else {
                    if (r == h - 1) {
                        System.out.print('*');
                        for (int c = 1; c < w - 1; c++) {
                            System.out.print(' ');
                        }
                        System.out.println('*');
                    } else {
                        System.out.print('|');
                        for (int c = 2; c <= w - 1; c++) {
                            if (c == nextBackSlash)
                                System.out.print('\\');
                            if (c == nextSlash)
                                System.out.print('/');
                            else {
                                if (c != nextBackSlash && c != nextSlash)
                                    System.out.print(' ');
                            }
                        }
                        System.out.println('|');
                        nextSlash--;
                        nextBackSlash++;
                    }
                }
            }
        }
    }
