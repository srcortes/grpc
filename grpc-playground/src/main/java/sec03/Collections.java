package sec03;

import com.grpc.models.sec04.Book;
import com.grpc.models.sec04.Library;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    private static final Logger log  = LoggerFactory.getLogger(Collections.class);

    public static void main(String[] args) {

        Book book = Book.newBuilder()
                .setTitle("Harry Potther and askaban prisioner")
                .setAuthor("J.K Rowling")
                .setPublicationYear(1997).build();

        Book book1 = book.toBuilder().setAuthor("Robert C Martin")
                .setTitle("Clean architecture").setPublicationYear(1990).build();
        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        bookList.add(book1);

        Library library  = Library.newBuilder().setName("EDITORIAL CLEAN")
                //.addBooks(book).addBooks(book1).build();
                        .addAllBooks(bookList).build();
        log.info("Library contain {}", library);

    }
}
