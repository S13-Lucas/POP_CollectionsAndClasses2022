import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ProcessNames {

	//Task 1 - read in all data from a file
	public ArrayList<String> readNames(String fileName) throws Exception {
		ArrayList<String> names = new ArrayList<String>(); //create array list names 'names'

		File fileOfNames = new File(fileName);
		Scanner fileScan = new Scanner(fileOfNames); //create scanner object

		while (fileScan.hasNext()) { // use while loop as we do not know how many items need to be scanned, (until there are no more items to scan)

			names.add(fileScan.nextLine()); // add scanned item to array list
		}
		fileScan.close();
		return names;
	}


	//Task 2 - sort the data
	public ArrayList<String> sortNames(ArrayList<String> myNames) {
		Collections.sort(myNames);// use sort method to sort array list
		return myNames;
	}



	//Task3 - find name position
	public int findNamePosition(ArrayList<String> myNames, String name) {
		boolean isFound = false; // create a found condition so that the while loop can end, use isFound naming convention as it is a boolean
		int i = 0;

		while (isFound == false && i < myNames.size()) { // loop while the item isn't found and i isn't larger than size of array as to not get element out of bounds error
			if(myNames.get(i).equals(name)) {
				isFound = true;
			} else {
				i++;
			}
		}
		if (isFound == true) {
			return i;
		} else {
			return -1; // return -1 to show the element was not found
		}
	}


	//Task4 - delete name
	public ArrayList<String> deleteName(ArrayList<String> myNames, String name) {
		boolean found = false;
		int i = 0;

		while (found == false && i < myNames.size()) {
			if (myNames.get(i).equals(name)) { // if element is the same as given name
				myNames.remove(i); //  remove that element
				found = true;
			} else {
				i++;
			}
		}
		return myNames;
	}

	//Task5 - change name
	public ArrayList<String> changeName(ArrayList<String> myNames, String nameX, String newName){
		myNames.set(findNamePosition(myNames,nameX),newName); // set element to newName where nameX was, found position using findNamePosition
		return myNames;
	}
}