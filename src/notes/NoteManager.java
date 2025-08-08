package notes;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class NoteManager 
{
	private File file;
	public NoteManager(String fileName)
	{
		this.file=new File(fileName);
		try
		{
			if(file.exists())
			{
				file.createNewFile();
			}
		}
		catch(IOException e)
		{
			System.out.println("Error creating file:"+e.getMessage());
		}
	}
	public void addNote(String note)
	{
		try(FileWriter fw=new FileWriter(file,true))
		{
			fw.write(note + System.lineSeparator());
			System.out.println("Not saved Successfully");
		}
		catch(IOException e)
		{
			System.out.println("Error Writing note:"+e.getMessage());
		}
	}
	public List<String> viewNotes() 
	{
	    List<String> notes = new ArrayList<>();
	    try (BufferedReader br = new BufferedReader(new FileReader(file))) 
	    {
	        String line;
	        while ((line = br.readLine()) != null) 
	        {
	            notes.add(line);
	        }
	    } 
	    catch (IOException e) 
	    {
	        System.out.println("Error reading notes: " + e.getMessage());
	    }
	    return notes;
	    }
	}