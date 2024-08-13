//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3 {
    public static void main(String[] args){
        //make a scanner
        Scanner myScanner=new Scanner (System.in);
        //create my variables
        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;
       //get input
        System.out.println ("Enter length: ");
    
        length = myScanner.nextInt();

        System.out.println ("Enter width: ");
        width = myScanner.nextInt();
        //calculate
        area = length*width;
        perimeter = 2*length + 2*width;
        
        
       
              //output
        System.out.println("The length is " + length);
        System.out.println("The width is " + width);
        System.out.println ("The area is " + area);
        System.out.println ("The perimeter is " + perimeter);
    }
}




//Paste console output below:
/*
Enter length: 
20
Enter width: 
10
The length is 20
The width is 10
The area is 200
The perimeter is 60



*/
