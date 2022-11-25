import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ProcessNames {

    //Task 1 - read in all data from a file

    /**
     * reads names from a file, regardless of number, and puts them in an array list
     * @param fileName holds file name
     * @return returns array list of names
     * @throws Exception
     */
    public ArrayList<String> readNames(String fileName) throws Exception {
        ArrayList<String> names = new ArrayList<String>();

        File fileOfNames = new File(fileName);
        Scanner fileScan = new Scanner(fileOfNames);

        while (fileScan.hasNext()) {

            names.add(fileScan.nextLine());
        }
        fileScan.close();
        return names;
    }


    //Task 2 - sort the data

    /**
     * used sort method to sort names in an array list
     * @param myNames holds array list of names
     * @return returns sorted array list
     */
    public ArrayList<String> sortNames(ArrayList<String> myNames) {
        Collections.sort(myNames);
        return myNames;
    }



    //Task3 - find name position

    /**
     * takes a name for an input and performs a linear search to find the index of search item or if it is not in the array list
     * @param myNames holds array list of names
     * @param name holds search item
     * @return returns index of search item
     */
    public int findNamePosition(ArrayList<String> myNames, String name) {
        boolean isFound = false;
        int i = 0;

        while (!isFound && i < myNames.size()) {
            if(myNames.get(i).equalsIgnoreCase(name)) {
                isFound = true;
            } else {
                i++;
            }
        }
        if (isFound) {
            return i;
        } else {
            return -1; // return -1 to show the element was not found
        }
    }


    //Task4 - delete name

    /**
     * finds a specified search item from an array list and removes that item
     * @param myNames holds array list of names
     * @param name holds search item
     * @return returns modified array list
     */
    public ArrayList<String> deleteName(ArrayList<String> myNames, String name) {
        boolean found = false;
        int i = 0;

        while (!found && i < myNames.size()) {
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

    /**
     * finds a specified search item in an array list and replaces that item with a new specified name
     * @param myNames holds array list of names
     * @param nameX holds search item
     * @param newName holds new name
     * @return returns modified array list
     */
    public ArrayList<String> changeName(ArrayList<String> myNames, String nameX, String newName){
        myNames.set(findNamePosition(myNames,nameX),newName); // set element to newName where nameX was, found position using findNamePosition
        return myNames;
    }
}