package lambdaexpression;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonLambdaExpressionDemo {

	public static void main(String[] args) {
		List<Person>listOfPerson=Arrays.asList(
				new Person("Deepa","Ravi"),
				new Person("Kajal","chanukya"),
				new Person("Rupaa","Siva"),
				new Person("banu","Kajal")
				);
		Collections.sort(listOfPerson,new Comparator<Person>() {
			@Override
			public int compare(Person person1, Person person2) {
				 // TODO Auto-generated method stub
				return 
						person1.getLastname().compareTo(person2.getLastname());
			}
			

			
			
		});
		printAll(listOfPerson);
	
				
		// TODO Auto-generated method stub

		 System.out.println("__________________________");
	 printLastNameWithA(listOfPerson);
	 
}
	
		
		// TODO Auto-generated method stub
		
	private static void printLastNameWithA(List<Person> listOfPerson) {
		for(Person p:listOfPerson) {
			if(p.getLastname().startsWith("K")||p.getLastname().startsWith("S"))
				System.out.println(p.getLastname());
		}
		// TODO Auto-generated method stub
		
	}


	

	

	private static void printAll(List<Person> listOfPerson) {
		for(Person p:listOfPerson) {
			//System.out.println(p.getLastname());
			
		}
		// TODO Auto-generated method stub
		
	}

}
