import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class Day2Q1{
    public static void main(String[] args){
        int depth = 0;
        int forward = 0;
        try {
            File myObj = new File("E:\\Documents\\GitHub\\Advent-of-Code-2021\\Day 2\\input1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                data = data.replace(" ", ",");
                String[]splitInput = data.split(",");
                if(splitInput[0].contains("up")){
                    depth -= Integer.parseInt(splitInput[1]);
                }
                else if(splitInput[0].contains("down")){
                    depth += Integer.parseInt(splitInput[1]);
                }
                else{
                    forward += Integer.parseInt(splitInput[1]);
                    //System.out.println("Adding: " + splitInput[1] + " to forward");
                }
            }
            System.out.println("Depth: " + depth);
            System.out.println("Forward: " + forward);
            System.out.println(depth * forward);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        
    }
}