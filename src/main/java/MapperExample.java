import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapperExample {

	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Baiaman", "Emil", "Elbek", "Ruslan", "Joomar", "Bainazar", "Ulan", "Ernazar");

		System.out.println("Imperativly!");
		for(String name: names) {
			if(!name.equals("Baiaman")) {
				User user = new User(name);
				System.out.println(user);
			}
		}
		
		System.out.println("Functionally");
		names.stream()
//			.filter(new Predicate<String>() {
//				public boolean test(String name) {
//					return name.equals("Baiaman");
//				}
//			})
			.filter(MapperExample::isNotBai)
//			.map(new Function<String, User>() {
//				@Override
//				public User apply(String name) {
//					
//					User user = new User(name);
//					return user;
//				}
//			})
			.map(User::new)
			.forEach(System.out::println);
		
		names.stream()
		 .filter(MapperExample::isNotBai)
		 .map(User::new)
		 .collect(Collectors.toList());
	}
	
	private static boolean isNotBai(String name) {
		
		return !name.equals("Baiaman");
	}
	
	static class User {
		 private String name;
		 private Integer age = 30;
		 
		 public User(String name) {
			 this.name = name;
			 //this.age = age;
		 }
		 
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		 
		@Override
		public String toString() {
			return "name: " + name + " age: " + age;
		}
	 }

   }

	
