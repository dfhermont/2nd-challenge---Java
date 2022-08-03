import java.io.File;
import java.io.FileNotFoundException;  
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.util.Arrays;

public class test {
	
	private void addAdjacentNodes() {
		// create node if not exist
		// create node 
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		boolean run = true;
		int i = 0;
		while (run) {
			try {
				File myObj = new File("C:/Users/danhernandez/OneDrive - ENDAVA/Desktop/Challenges/2nd challenge - Java/matriz.txt");
				Scanner myReader = new Scanner(myObj);

				String[] vectorSize = new String[2];

				if (myReader.hasNextLine())
					vectorSize = myReader.nextLine().split(",");

				String[][] matrix = new String[new Integer(vectorSize[0])][new Integer(vectorSize[1])];
				
				while (myReader.hasNextLine() && i < new Integer(vectorSize[0])) {
					String data = myReader.nextLine();
					matrix[i] = data.split(","); 
					i++;
				}
				
				System.out.println("Matrix:");
				
				System.out.println(Arrays.deepToString(matrix).replace("],","\n").replace(",","\t| ")
                        .replaceAll("[\\[\\]]", " "));
				
				myReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("The file does not exist");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				run = false;
			}
		}
	}

}