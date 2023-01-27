import java.util.Scanner;//This is used to initialise scanner
public class Math_operator {//public class is initialised
    public static void main(String[] args){
        while(true){
            Scanner s = new Scanner(System.in);//This line creates an object to scan inputs throughout code.
            System.out.println("Enter '1' for Addition.");//Enter 1 for Addition
            System.out.println("Enter '2' for Subtraction.");//Enter 2 for Subtraction
            System.out.println("Enter '3' for Multiplication.");//Enter 3 for Multiplication
            System.out.println("Enter '4' for Division.");//Enter 4 for Division
            System.out.println("Enter '5' to EXIT.");//Enter 5 to Exit Code
            System.out.println("Enter the Operator >>>");//This line is to notify user to enter choice
            int a = s.nextInt();//This line is used to Enter the choice from user
            switch (a) {//Switch is used to go to case where the input from user matches
                case 1 -> {//This is case 1, used for Addition
                    float b, c;//Floating input is given to precise addition
                    System.out.println("Enter the first no : ");//User enters the first number for addition
                    b = s.nextInt();//Scanning of first number is done in this line
                    System.out.println("Enter the second no : ");//User enters the second number for addition
                    c = s.nextInt();//Scanning of second number is done in this line
                    System.out.println("First number entered is >>>" + b);//This line will show the user's first number entered
                    System.out.println("Second number entered is >>>" + c);//This line will show the user's second number entered
                    float Sum = b + c;//This line will print the sum of the numbers entered by user
                    System.out.println("---------------------------------");
                    System.out.println("Result is >>>" + Sum);//This line will show the user the Addition/Sum of two numbers
                    System.out.println("=================================");
                }
                case 2 -> {
                    float w, e;
                    System.out.println("Enter the first no : ");
                    w = s.nextInt();
                    System.out.println("Enter the second no : ");
                    e = s.nextInt();
                    System.out.println("First number entered is >>>" + w);
                    System.out.println("Second number entered is >>>" + e);
                    float Sub = w - e;
                    System.out.println("---------------------------------");
                    System.out.println("Result is >>>" + Sub);
                    System.out.println("=================================");
                }
                case 3 -> {
                    float r, t;
                    System.out.println("Enter the first no : ");
                    r = s.nextInt();
                    System.out.println("Enter the second no : ");
                    t = s.nextInt();
                    System.out.println("First number entered is >>>" + r);
                    System.out.println("Second number entered is >>>" + t);
                    float Mul = r * t;
                    System.out.println("---------------------------------");
                    System.out.println("Result is : " + Mul);
                    System.out.println("=================================");
                }
                case 4 -> {
                    float y, u;
                    System.out.println("Enter the first no : ");
                    y = s.nextInt();
                    System.out.println("Enter the second no : ");
                    u = s.nextInt();
                    System.out.println("First number entered is >>>" + y);
                    System.out.println("Second number entered is >>>" + u);
                    float Div = y / u;
                    System.out.println("---------------------------------");
                    System.out.println("Result is >>> " + Div);
                    System.out.println("=================================");
                }
                case 5 -> System.exit(0);
                default -> {
                    System.out.println("---------------------------------");
                    System.out.println("!!!Please Enter Valid Input!!!");
                    System.out.println("=================================");
                }
            }
        }
    }
}