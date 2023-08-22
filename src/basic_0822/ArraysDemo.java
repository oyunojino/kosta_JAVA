package basic_0822;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        char[] c1 = {'j', 'a', 'v', 'a'};
        char[] c2 = Arrays.copyOf(c1, c1.length);
        Character[] c3 = {'j', 'a', 'v', 'a'};
        print(c3);

        System.out.println(c1);
        System.out.println(c2);

        String[] s1 = {"A", "B", "C", "D"};
        int d = Arrays.binarySearch(s1, "D");
        System.out.println("outer -> " + d);
        for (String s : s1) {
            if (s.equalsIgnoreCase("d")) {
                System.out.printf("찾았습니다. -> ");
            }
            System.out.println("inner -> " + d);
            print(s1);
        }
    }

    static void print(Object[] objArray) {
        for (Object obj : objArray) {
            System.out.print(obj);
            System.out.print(",");
        }
    }
}
