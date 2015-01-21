package ba.bitcamp.edibImamovic.path;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExercisesCSV {

	public static void main(String[] args) {
		UserClass u = new UserClass("Camper", 26, true);

		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(System.out);
			oos.writeObject(u);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

}
