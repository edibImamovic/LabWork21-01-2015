package ba.bitcamp.edibImamovic.path;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {

	public static void fileToSysout(File file) throws IOException {

		try {

			FileInputStream fs = new FileInputStream(file);

			InputStreamReader sr = new InputStreamReader(fs);

			BufferedReader br = new BufferedReader(sr);

			String line = br.readLine();

			while (line != null) {

				System.out.println(line);
				line = br.readLine();

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

	}

	public static void copy(File in, File out) {

		try {
			FileInputStream fis = new FileInputStream(in);
			FileOutputStream fos = new FileOutputStream(out);

			int b;
			try {
				while ((b = fis.read()) > -1) {
					fos.write(b);
				}
			} catch (IOException e) {

				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {
			System.out.println("Zavrseno");
		}

	}

	public static void main(String[] args) {

		String homeDir = System.getProperty("user.home");

		String path = homeDir + File.separator + "Documents" + File.separator
				+ "workspace" + File.separator + "LabWork21-01-2015"
				+ File.separator + "File" + File.separator + "Text.txt";

		File file = new File(path);

		String path2 = homeDir + File.separator + "Documents" + File.separator
				+ "workspace" + File.separator + "LabWork21-01-2015"
				+ File.separator + "File" + File.separator + "Text2.txt";

		File file2 = new File(path2);

		// fileToSysout(file);
		copy(file, file2);

	}

}