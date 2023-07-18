package com.example.graphql;

import com.example.graphql.model.Book;
import com.example.graphql.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookServiceImpl bookService;
	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("The Complete Reference");
		b1.setDesc("Java Book");
		b1.setAuthor("Jason Gotham");
		b1.setPrice(29.35);
		bookService.createBook(b1);

		Book b2 = new Book();
		b2.setTitle("Python Reference");
		b2.setDesc("Python Book");
		b2.setAuthor("Aaron Silk");
		b2.setPrice(63.23);
		bookService.createBook(b2);

		Book b3 = new Book();
		b3.setTitle("The Microservice Patterns");
		b3.setDesc("Java Book");
		b3.setAuthor("Salvik Gotham");
		b3.setPrice(42.22);
		bookService.createBook(b3);

		Book b4 = new Book();
		b4.setTitle("React Guide");
		b4.setDesc("React Book");
		b4.setAuthor("Mosh Hamedani");
		b4.setPrice(25.44);
		bookService.createBook(b4);



	}
}
