package demoOptionals;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person("Sushmith",null);
//		String email = person
//				.getEmail()
//				.map(String::toLowerCase)
//				.orElse("Email not provided");
		
//		System.out.println(email);
		
		if(person.getEmail().isPresent()) {
			String email= person.getEmail().get();
			System.out.println(email.toLowerCase());
		}else {
			System.out.println("Email not provided");
		}
	}
}

class Person{
	private final String name;
	private final String email;
	
	Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}	
}
