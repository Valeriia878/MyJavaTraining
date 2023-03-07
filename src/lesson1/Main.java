package lesson1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int first = 5;
        int second = first * 5;
        int third = second - first;
        first = first * third;
        System.out.println(first + "," + second + "," + third);
        int x = first + second;
        System.out.println(x);
        int y = third%first;
        System.out.println(y);
    }
}