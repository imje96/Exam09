package Exam2_UP;

import java.util.ArrayList;

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}
}

public class Exam22 {
	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Person("홍길동"));
		personList.add(new Person("한석봉"));
//		Person p1 = new Person("홍길동");
//		Person p2 = new Person("한석봉");
//		personList.add(p1);
//		personList.add(p2);

		for (int i = 0; i < personList.size(); i++) {
			System.out.println(personList.get(i).name);
		}
	}
}
