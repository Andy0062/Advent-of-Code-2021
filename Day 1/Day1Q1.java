import java.io.File;  // Import the File class
        import java.io.FileNotFoundException;  // Import this class to handle errors
        import java.util.Scanner; // Import the Scanner class to read text files

class AoC{
    public static void main(String[] args){
        int currentNumber = 0;
        int previousNumber = -1;
        int counter = 0;
        try {
            File myObj = new File("E:\\Documents\\GitHub\\Advent-of-Code-2021\\Day 1\\input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                currentNumber = Integer.parseInt(data);
                if(currentNumber > previousNumber && previousNumber >= 0){
                    counter++;
                }
                previousNumber = currentNumber;
            }
            System.out.println("Counter: " + counter);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        
    }
}