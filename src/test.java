import java.io.File;
import java.io.FileNotFoundException;  
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.util.Arrays;

public class test {
	
	//private void addAdjacentNodes() {
		// create node if not exist
		// create node 
	//}

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			try {
				File myObj = new File("C:/Users/danhernandez/OneDrive - ENDAVA/Desktop/Challenges/2nd challenge/challenge/matriz.txt");
				Scanner myReader = new Scanner(myObj);

				String[] vectorSize = new String[2];

				if (myReader.hasNextLine())
					vectorSize = myReader.nextLine().split(",");

				int [][] matrix = new int[new Integer(vectorSize[0])][new Integer(vectorSize[1])];
				
				while (myReader.hasNextLine()) {
                    for (int i=0; i<matrix.length; i++){
                        String[] data = myReader.nextLine().trim().split(",");
                        for (int j=0; j<data.length; j++){
                            matrix[i][j] = Integer.parseInt(data[j]);
                        }
                    }					
				}
				
				System.out.println("Matrix:");
				
				System.out.println(Arrays.deepToString(matrix));
                System.out.println(matrix.getClass().getComponentType());
				
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