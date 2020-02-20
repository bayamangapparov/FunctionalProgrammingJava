import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FileterClass {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Baiaman", "Emil", "Elbek", "Ruslan", "Joomar", "Bainazar", "Ulan", "Ernazar");

		names.stream()
//			.filter(new Predicate<String>() {
//				public boolean test(String name) {
//					return name.equals("Baiaman");
//				}
//			})
			.filter(FileterClass::isNotBai)
			.forEach(System.out::println);
		
	}
	
	private static boolean isNotBai(String name) {
		
		return !name.equals("Baiaman");
	}

}
