package javafirstclass;

import java.io.*;
import java.util.Scanner;

public class Files {
	public static void main(String[] args) throws IOException{
		File fileObj1 = new File("D:\\NewFile.txt");
		try {
			if (fileObj1.createNewFile()) {
				System.out.println("NewFile Created!");
			} else {
				System.out.println("Already exists");
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		FileWriter fWriter = new FileWriter("D:\\NewFile.txt");
		fWriter.write("Java is worse than python" + "\n");
		fWriter.append("second line!" + "\n");
		fWriter.write("Java has a content now as a 3rd line!!");
		fWriter.close();
		
		Scanner sc = new Scanner(System.in);
		FileWriter file = new FileWriter("D:\\NewFile1.txt");
		String data = "";
		BufferedWriter bf = null;
		
		try {
			System.out.println("Enter the content: ");
			bf = new BufferedWriter(file);
			while (!data.contentEquals("/")) {
				data = sc.nextLine();
				bf.write(data,0,data.length());
				bf.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		bf.close();
		sc.close();
		
		char[] array = new char[100];
		
		try {
			FileReader readFile = new FileReader("D:\\NewFile1.txt");
			readFile.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);
			readFile.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		File filedelete = new File("D:\\NewFile1.txt");
		boolean value = filedelete.delete();
		if (value) {
			System.out.println("The File is deleted.");
		}	else {
			System.out.println("The File is not deleted.");

		}
	}
}
