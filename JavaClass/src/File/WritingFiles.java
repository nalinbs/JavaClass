package File;

import java.io.*;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\nikini wassa\\mytextFile.txt");
		FileWriter fw= new FileWriter(f,true);//when we give trtue it not override file it will add new lines every time
		
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("First Line");
		writer.newLine();
		writer.write("My name is Nalin");
		
		System.out.println(" File Created !!");
		
		for(int i=0; i<4;i++) {
			
			for(int j=0;j<3;j++) {
				
				int num= (int) (Math.random()*100);
				writer.write(num+"\t");
				
				
			}
		}
		writer.close();
		

	}

}
