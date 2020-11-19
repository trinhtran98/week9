
package week9;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;




public class week9 {

	private static Scanner fileRead; 
	
	
	
	
	
	
	public static void main(String[] args)
{
		String filepath= "C:\\java-stuff/Users.csv";
		String searchTerm= "41";
		readRecord(searchTerm,filepath);
}
	public static void readRecord (String searchTerm, String filepath)
	{
		boolean found= false;
		String ID= ""; String user= "";
	try
	{
		fileRead= new Scanner(new File(filepath));
		fileRead.useDelimiter("[,\n]");
		while(fileRead.hasNext () && !found)
		{
			ID= fileRead.next();
			user= fileRead.next();
			
			if(ID.contentEquals(searchTerm))
			{
				found= true;
			}
		}
		
			
	
	if (found)
	{
		JOptionPane.showMessageDialog(null, "10.0.0." + ID + " " +user);
	}
	else
	{
		JOptionPane.showMessageDialog(null, "record not found");
	}
	}
	
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null, "error");
	}
	
}
}

