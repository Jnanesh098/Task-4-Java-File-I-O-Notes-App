# Task 4 – Java File I/O - Notes App

# Date
08/08/2025

## Objective
Create a **CLI-based Notes Application** in Java that allows adding and viewing notes using **File I/O**.

------------------------

## Tools & Technologies
- Java (JDK 8 or above)
- Eclipse IDE
- FileWriter, BufferedReader for file handling

------------------------

## Features
- Add a note to a text file
- View all saved notes
- Persistent storage in `notes.txt`

-----------------------

## Class Structure

### `NoteManager.java`
- **Purpose**: Handles reading/writing notes from/to file
- **Methods**:
  - `addNote(String note)` → Appends a new note to the file
  - `viewNotes()` → Reads all notes from file

### `Main.java`
- **Purpose**: CLI menu for user interaction
- **Options**:
  - Add Note
  - View Notes
  - Exit Application

---------------------------

## Folder Structure (Eclipse)

NotesApp/
└── src/
└── notes/
├── NoteManager.java
└── Main.java

--------------------------

## How to Run (In Eclipse)

1. **Open Eclipse IDE**
2. **File → New → Java Project** → Name: `NotesApp`
3. **Right-click `src` → New → Package** → Name: `notes`
4. Create `NoteManager.java` and `Main.java` inside the package
5. Paste respective code into each file
6. **Right-click `Main.java` → Run As → Java Application**

--------------------------

## Sample Output
   ------ Notes App -------
Add Note
View Notes
Exit
Enter choice: 1
Enter your note: Complete Java Task 4 today
-Note saved successfully!

------- Notes App -------
Add Note
View Notes
Exit
Enter choice: 2
-Saved Notes: Complete Java Task 4 today        

------------------------

## Outcome
By completing this task, you’ll:
- Understand **FileWriter** & **BufferedReader** in Java
- Work with **persistent file storage**
- Build a **simple, functional CLI tool**
