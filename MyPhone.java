package Sheshoin_ln_15.MyPhone;

import java.util.ArrayList;
import java.util.Scanner;

public class MyPhone {

    public void Evernote (){
        ArrayList<String> notes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create a note");
            System.out.println("2. View all notes");
            System.out.println("3. Delete a note");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter note: ");
                    String note = scanner.nextLine();
                    notes.add(note);
                    break;
                case 2:
                    for (int i = 0; i < notes.size(); i++) {
                        System.out.println((i + 1) + ". " + notes.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Enter note number to delete: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= notes.size()) {
                        notes.remove(index - 1);
                    } else {
                        System.out.println("Invalid note number.");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

