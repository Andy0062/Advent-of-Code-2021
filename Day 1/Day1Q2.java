import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class Day1Q2{
    public static void main(String[] args){
        int currentTotal = 0;
        int previousTotal = 0;
        int nextTotal = 0;
        int round = 0;
        int counter = 0;
        try {
            File myObj = new File("E:\\Documents\\GitHub\\Advent-of-Code-2021\\Day 1\\input2.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                round++;
                if(round >= 4){
                    currentTotal += Integer.parseInt(data);
                    nextTotal += Integer.parseInt(data);
                    if(currentTotal > previousTotal){
                        counter++;
                    }
                    previousTotal = currentTotal;
                    currentTotal = nextTotal;
                    nextTotal = Integer.parseInt(data);
                }
                else if(round >= 3){
                    previousTotal += Integer.parseInt(data);
                    currentTotal += Integer.parseInt(data);
                    nextTotal += Integer.parseInt(data);
                }
                else if(round == 2){
                    currentTotal += Integer.parseInt(data);
                    previousTotal += Integer.parseInt(data);
                }
                else{
                    previousTotal += Integer.parseInt(data);
                }


            }
            System.out.println("Counter: " + counter);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        
    }
}