package basic_0821.example;

import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = {
                new Book(15000),
                new Book(50000),
                new Book(25000)
        };
        System.out.println("정렬 전");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("정렬 후");
//        # 오류가 나는 이유
//        => 어떤 기준으로 비교해야하는지 모르기 때문에 정해줘야함
        Arrays.sort(books);
        for (Book book : books) {
            System.out.println(book);
        }


        System.out.println("---------------------------------------");


        int[] numbers = {15000, 50000, 20000};
        System.out.println("정렬 전");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("정렬 후");
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}

//        # 오류가 나는 이유
//        => 어떤 기준으로 비교해야하는지 모르기 때문에 Comparable<Book>로 정해줘야 함
class Book implements Comparable<Book> {
    int price;

    public Book(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [" +
                "price=" + price +
                ']';
    }

    @Override
    public int compareTo(Book book) {
        return this.price - book.price;
    }
}
