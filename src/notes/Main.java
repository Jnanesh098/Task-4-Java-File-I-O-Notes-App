package notes;

import java.util.List;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		NoteManager manager=new NoteManager("notes.txt");
		
		while(true)
		{
			System.out.println("----------Notes App----------");
			System.out.println("1. Add Note");
			System.out.println("2. View Notes");
			System.out.println("3. Exit");
			System.out.println("Enter Choice:");
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1 ->{
				System.out.println("Enter your note:");
				String note=sc.nextLine();
				manager.addNote(note);
			}
			case 2 ->{
				List<String>notes=manager.viewNotes();
				if(notes.isEmpty())
				{
					System.out.println("No notes available");
				}
				else
				{
					System.out.println("saved notes:");
					notes.forEach(System.out::println);
				}
			}
			case 3 ->{
				System.out.println("Exiting notes App");
				sc.close();
				return;
			}
			default ->System.out.println("Invalid choice Try again");
			}
		}
	}
}
