package eecs1022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Strings
{
	double grade;
	double counter;
	static double avg;
	
	public Double Stringes() throws FileNotFoundException {
    
	String name = "C:\\Users\\Abdul\\eclipse-workspace\\1090marks.txt";
	File file = new File(name);
	Scanner input = new Scanner(file);
	while (input.hasNextLine())
	{
	    String line = input.nextLine();
	    String part[] = line.split("\\|");
	    if (part.length > 1) {
	    grade += Integer.parseInt(part[1]);
	    }
	    counter++;
	    
	}
	input.close();
	avg = grade/counter;
	return avg;
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		Strings a = new Strings();
		System.out.println(a.Stringes());
	}

}

 
