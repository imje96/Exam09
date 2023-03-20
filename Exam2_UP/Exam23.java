package Exam2_UP;

import java.util.ArrayList;

public class Exam23 {
	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Person("홍길동", 20));
		personList.add(new Person("한석봉", 25));

		for (int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);
			System.out.println(person.getName() + "의 나이는 " + person.getAge() + "살");
		}
	}

	static class Person {
		private String name;
		private int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return this.name;
		}

		public int getAge() {
			return this.age;
		}

		public String getInfo() {
			return name + "의 나이는 " + age + "살";
		}
	}

}