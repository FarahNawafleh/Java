
import java.io.*;

public class FilesReadWrite {

	public static void main(String[] args) {	
		
		String content = readFile(
				"C:\\Users\\Farah\\Desktop\\Upskilling\\Cohort5_Java_FarahNawafleh\\FirstProject\\src\\Farah.txt");
		System.out.println(content);
		writeToFile("C:\\Users\\Farah\\Desktop\\Upskilling\\Cohort5_Java_FarahNawafleh\\FirstProject\\src\\output.txt", "Welcome to this simple java code");

	}

	public static void writeToFile(String fileName, String msg) {
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.append(msg);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readFile(String fileName) {

		try {
			FileReader file = new FileReader(fileName);
			String text = "";
			int c;
			while ((c = file.read()) != -1) {
				text += (char) c;
			}
			file.close();
			return (text);

		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
			return null;
		}
	}
}
