import java.util.Scanner;
public class Main {
        public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome!");
            System.out.println("Enter coordinate 1: ");
            String coordinate1 = scan.nextLine();
            System.out.println("Enter coordinate 2: ");
            String coordinate2 = scan.nextLine();

            //converts the Strings into ints and stores it in x1, x2, y1, y1 and uses it in LinearEquation
            int x1 = Integer.parseInt(coordinate1.substring(1, coordinate1.indexOf(",")));
            int y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(" ") + 1, coordinate1.indexOf(")")));
            int x2 = Integer.parseInt(coordinate2.substring(1, coordinate2.indexOf(",")));
            int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(" ") + 1, coordinate2.indexOf(")")));

            //Does not run if the points are on a vertical line
            if(x1 == x2){
                System.out.println("These points are on a vertical line: x = " + x1);
                System.exit(0);
            }
            LinearEquation linear = new LinearEquation(x1, y1, x2, y2);
            System.out.println(linear.lineInfo());
            System.out.println("Enter a value for x: ");
            double xVal = scan.nextDouble();
            System.out.println(linear.coordinateForX(xVal));
        }
    }

