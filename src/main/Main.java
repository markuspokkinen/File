package main;

import java.util.Scanner;

import methods.*;

public class Main {
	static Scanner lukija = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadText rt = new ReadText();

		System.out.println("Write[w] to a file or read[r] from a file, [e to exit]");
		char letter = lukija.nextLine().charAt(0);

		do{
		if(letter == 'w'){
			System.out.println("write here what you want to save to file");
			String string = lukija.nextLine();
			System.out.println("name of the file:");
			String file = lukija.nextLine();
			rt.write(string, file);

		}else if(letter == 'r'){
			System.out.println("name the file you want to read");
			String file = lukija.nextLine();
			//String file = "test.txt";
			System.out.println(rt.read(file));
		}
		System.out.println("Write[w] to a file or read[r] from a file, [e to exit]");
		letter = lukija.nextLine().charAt(0);

		}while(letter != 'e');
		System.out.println("exited");
	}

}
