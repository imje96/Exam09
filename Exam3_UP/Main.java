package Exam3;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) throws ParseException {
		List<Book> books = new ArrayList<>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");

		books.add(new Book("이펙티브 자바", format.parse("2018/11/01"), "자바"));
		books.add(new Book("오준석의 플러터 생존코딩", format.parse("2021/05/28"), "플러터"));
		books.add(new Book("오준석의 안드로이드 생존코딩", format.parse("2021/12/17"), "코틀린"));

		Collections.sort(books);
		System.out.println(books);

		Book book = new Book("오브젝트", format.parse("2019/06/17"), "객체지향");
//        Book book2 = book.clone();

		System.out.println(book);
//        System.out.println(book2);
	}
}