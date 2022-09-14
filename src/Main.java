import java.util.*;
import gpdraw.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        * The main method is not used other than to start another method because it doesn't make sense
        * to restart the main method every time a user messes some input up
        */
        GetABC();
    }

    private static void GetABC() throws InterruptedException {
        Scanner input = new Scanner(System.in); //Scanner for user input, this scanner will be used for every user input in this entire method

        System.out.println("Pythagorean Theorem Helper by Joseph Rosw-Provey 2022\n");
        System.out.println("Your A and B values refer to one of the legs on Your triangle");
        System.out.println("C Refers to your hypotenuse\n");
        System.out.println(
                "    |\\\n" +
                        "    | \\\n" +
                        "    |  \\\n" +
                        "    |   \\\n" +
                        "    |    \\\n" +
                        "    |     \\\n" +
                        " A  |      \\  C\n" +
                        "    |       \\\n" +
                        "    |        \\\n" +
                        "    |         \\\n" +
                        "    |__________\\");
        System.out.println("         B\n"); //this is the triangle ASCII art

        System.out.println("Please enter unknown value then, your A,B,C values ");

            System.out.println("What is your unknown letter: ");
            String unknownVar = input.next(); //The user input gathered here is used for the switch case

        switch (unknownVar.toLowerCase()) {
            case "a" -> { // If the user is missing the variable A in their equation this is what will run
                //x +b^2=c^2
                System.out.println("Please enter B: ");
                double b = input.nextDouble(); //Gathering the known value from B
                System.out.println("Please enter C");
                double c = input.nextDouble(); //Gathering the known value from C
                double answer = Math.pow(c, 2) - Math.pow(b, 2); //Subtracts C and B because they would be on opposite sides of the equation if this was written out
                answer = Math.abs(answer); //Gets the absolute value, so it doesn't mess up the sqrt function. The sqrt function won't square negatives
                answer = Math.sqrt(answer); // squares the sum of C and B
                System.out.println("Answer: " + answer); //Prints the answer to the user


                //Explanation on how to solve the equation
                System.out.println("Explanation: ");
                System.out.println("The equation for this problem: " + b + "²" + "+" + "X" + "²=" + c);
                System.out.println("Do do this problem we need to square every value,");
                System.out.println("So " + b + " becomes " + Math.pow(b, 2) + " and " + c + " becomes " + Math.pow(c, 2));
                System.out.println("Now we simply add these values " + Math.pow(b, 2) + "+" + Math.pow(c, 2) + "=" + (Math.pow(c, 2) + Math.pow(b, 2)));
                System.out.println("Now we square the sum, " + Math.sqrt(Math.pow(c, 2) + Math.pow(b, 2)));
                System.out.println("(And if you needed it rounded to a nice number here it is: " + Math.round(answer * 100.0) / 100.0 + ")");
                System.out.println("(And here it is NOT rounded, just with the decimal chopped off:" + (int) (answer) + ")");
                System.out.println("If your would like to see a visual please type v, if you want to restart type r, if you want to exit type e");
                switch (input.next().toLowerCase()) {
                    case "v" -> visual(answer, b, c);
                    case "r" -> GetABC();
                    case "e" -> System.exit(0);
                    default -> GetABC();
                }
            }// end of case A

            case "b" -> {
                System.out.println("Please enter A: ");
                double a = input.nextDouble(); //Gathering the known value from A
                System.out.println("Please enter C");
                double c2 = input.nextDouble(); //Gathering the known value from C
                double answer2 = Math.pow(c2, 2) - Math.pow(a, 2); //Subtracts C and A because they would be on opposite sides of the equation if this was written out
                answer2 = Math.abs(answer2); //Gets the absolute value, so it doesn't mess up the sqrt function. The sqrt function won't square negatives
                answer2 = Math.sqrt(answer2); // squares the sum of C and A
                System.out.println("Answer: " + answer2);


                //Explanation on how to solve the equation
                System.out.println("Explanation: ");
                System.out.println("The equation for this problem: " + "X" + "²" + "+" + a + "²=" + c2);
                System.out.println("Do do this problem we need to square every value,");
                System.out.println("So " + c2 + " becomes " + Math.pow(c2, 2) + " and " + a + " becomes " + Math.pow(a, 2));
                System.out.println("Now we simply add these values " + Math.pow(c2, 2) + "+" + Math.pow(a, 2) + "=" + (Math.pow(c2, 2) + Math.pow(a, 2)));
                System.out.println("Now we square the sum, " + Math.sqrt(Math.pow(c2, 2) + Math.pow(a, 2)));
                System.out.println("(And if you needed it rounded to a nice number here it is: " + Math.round(answer2 * 100.0) / 100.0 + ")");
                System.out.println("(And here it is NOT rounded, just with the decimal chopped off:" + (int) (answer2) + ")");
                System.out.println("If your would like to see a visual please type v, if you want to restart type r, if you want to exit type e");
                switch (input.next().toLowerCase()) {
                    case "v" -> visual(a, answer2, c2);
                    case "r" -> GetABC();
                    case "e" -> System.exit(0);
                }
            }
            case "c" -> {
                System.out.println("Please enter A: ");
                double a2 = input.nextDouble(); //Gathering the known value from A
                System.out.println("Please enter B");
                double b2 = input.nextDouble(); //Gathering the known value from B
                double answer3 = Math.pow(a2, 2) + Math.pow(b2, 2); //Adds A and B because they would be on the same side of the equation if this was written out
                answer3 = Math.abs(answer3); //Gets the absolute value, so it doesn't mess up the sqrt function. The sqrt function won't square negatives
                answer3 = Math.sqrt(answer3); // squares the sum of C and A
                System.out.println("Answer: " + answer3);

                //Explanation on how to solve the equation
                System.out.println("Explanation: ");
                System.out.println("The equation for this problem: " + a2 + "²" + "+" + b2 + "²=X");
                System.out.println("Do do this problem we need to square every value,");
                System.out.println("So " + a2 + " becomes " + Math.pow(a2, 2) + " and " + b2 + " becomes " + Math.pow(b2, 2));
                System.out.println("Now we simply add these values " + Math.pow(a2, 2) + "+" + Math.pow(b2, 2) + "=" + (Math.pow(a2, 2) + Math.pow(b2, 2)));
                System.out.println("Now we square the sum, " + Math.sqrt(Math.pow(a2, 2) + Math.pow(b2, 2)));
                System.out.println("(And if you needed it rounded to the tenth here it is: " + Math.round(answer3 * 100.0) / 100.0 + ")");
                System.out.println("(And here it is NOT rounded, just with the decimal chopped off: " + (int) (answer3) + ")");
                System.out.println("If your would like to see a visual please type v, if you want to restart type r, if you want to exit type e");
                switch (input.next().toLowerCase()) {
                    case "v" -> visual(a2, b2, answer3);
                    case "r" -> GetABC();
                    case "e" -> System.exit(0);
                }
            }
            default -> { //this runs when a user inputs an invalid choice
                System.out.println("That is not a valid answer, please refer to the diagram and description (resetting in 5s)");
                Thread.sleep(5000); // waits so the user can see it
                GetABC(); //restarts method
            }
        }

    }


    private static void visual(double A,double B, double C){

        SketchPad paper = new SketchPad(600, 600, 0);
        DrawingTool pencil = new DrawingTool(paper);


        String aString = String.valueOf(A);
        int aLength = aString.length();

        System.out.println(aLength);



        //shows the value of a
        pencil.up();
        pencil.turnRight();
        pencil.move((aLength*-10));
        pencil.down();
        pencil.drawString(aString);
        pencil.up();
        pencil.turnLeft();


        pencil.home();
        pencil.down();

        //Creates A line
        pencil.move(100);
        pencil.move(-200);


        //Creates half of the B line
        pencil.turnRight();
        pencil.forward(50);
        pencil.turnRight();
        pencil.up();
        pencil.forward(20);

        //Creates B value text
        pencil.down();
        pencil.drawString(Double.toString(B));
        pencil.up();
        pencil.backward(20);
        pencil.down();

        //resets and resumes the final half of the B line
        pencil.turnLeft();
        pencil.forward(50);

        //Creates Horizontal
        pencil.turnLeft();
        for(int i=0; i<100;i++){

            if(i == 50){ //writes the C Value halfway through
                pencil.up();
                pencil.turnRight();
                pencil.move(10);
                pencil.down();
                pencil.drawString(Double.toString(C));
                pencil.up();
                pencil.move(-10);
                pencil.down();
                pencil.turnLeft();
            }
            pencil.forward(2);
            pencil.turnLeft();
            pencil.forward(1);
            pencil.turnRight();
        }
    }

}