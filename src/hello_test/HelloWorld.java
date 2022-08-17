/**
 * 
 */
package hello_test;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.io.FileWriter;
import java.io.IOException;


/**
 * @author Wynton Huang
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		// demo of list and loop
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 31; i++) {
			numbers.add(i);
		}
		for (Integer number : numbers) {
			System.out.println(number);
			
			FizzBuzz.fizzBuzz(number);
		}
		System.out.println(numbers);
		
		// demo of map
		HashMap<String, String> locations = new HashMap<String, String>();
		locations.put("Thanalan", "Ul'Dah");
		locations.put("Black Shroud", "Gridania");
		locations.put("La Noscea", "Limsa Lominsa");
		
		System.out.println(locations);
		
		// demo of set
		HashSet<String> spells = new HashSet<String>();
		spells.add("Fire");
		spells.add("Blizzard");
		spells.add("Cure");
		spells.add("Aero");
		System.out.println(spells);
		
		// open/create a new file
		String fileName = "testfile.txt";
		CreateFile.createFile(fileName);
		try {
			FileWriter testWriter = new FileWriter(fileName);
			testWriter.write(numbers.toString() + "\n" + locations.toString() + "\n" + spells.toString());
			testWriter.close();
			System.out.println("Write successful");
		} catch (IOException e) {
			System.out.println("File writing failed");
			e.printStackTrace();
		}
		// finish writing and close
		
		// regex demo using a password
		
		String testPassword = "TestPassword1233%"; 	//a valid potential password
		String failPassword = "fail me please";		//a failure to be shamed like the failure it is
		
		System.out.println("Checking a good password...");
		if(PasswordRegex.check(testPassword)) {
			System.out.println("regex success");
		} else {
			System.out.println("regex failed");
		}
		
		System.out.println("Checking a bad password...");
		if(PasswordRegex.check(failPassword)) {
			System.out.println("regex failed");
		} else {
			System.out.println("regex success");
		}
		
		
	}
	
	

}
