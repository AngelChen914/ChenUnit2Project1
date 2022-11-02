public class LinearEquation {
    // Instance Variables
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    // Creates a LinearEquation object
    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        }



    // Calculates and returns distance between (x1, y1) and (x2, y2)
    public double distance(){
        return roundedToHundredth(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }



    // Calculates and returns the y-intercept of the line
    public double yIntercept(){
        double yInt = y1 - (slope() * x1);
        return roundedToHundredth(yInt);
    }



    // Calculates and returns the slope of the line
    public double slope(){
        return roundedToHundredth((double)(y2 - y1)/(x2 - x1));
    }



    /* Returns a String that represents the linear equation of the line. I used int x and y and String one
    to make things easier. I wrote a bunch of if-else statements for the y intercept being <, >, or = to 0
    and within each of those, I added more if-else statements that look very similar to each other.
       */
    public String equation() {
        int y = y2 - y1;
        int x = x2 - x1;
        String one = "";
        if(yIntercept() > 0){
            if(y == x){
                one = "y = x + " + yIntercept();
            }else if(y == 0){
                one = "y = " + y1;
            }else if(y > 0 && x > 0 && y%x != 0){
                one = "y = " + y + "/" + x + "x + " + yIntercept();
            }else if(y > 0 && x > 0 && y%x == 0){
                int reduced = y/x; // assigned y/x to int reduced to make it look cleaner
                one = "y = " + reduced + "x + " + yIntercept();
            }else if(y < 0 && x < 0 && y%x != 0){
                // Used negativeY and X because it was easier for me to read
                int negativeY = y * -1;
                int negativeX = x * -1;
                one = "y = " + negativeY + "/" + negativeX + "x + " + yIntercept();
            }else if(y < 0 && x < 0 && y%x == 0){
                int reduced1 = y/x;
                one = "y = " + reduced1 + "x + " + yIntercept();
            }else if(y < 0 && x > 0 && y%x != 0){
                one = "y = " + y + "/" + x + "x + " + yIntercept();
            }else if(y < 0 && x > 0 && y%x == 0 && Math.abs(y) != Math.abs(x)){
                int reduced2 = y/x;
                one = "y = " + reduced2 + "x + " + yIntercept();
            }else if(y < 0 && x > 0 && y%x == 0 && Math.abs(y) == Math.abs(x)){
                one = "y = -x + " + yIntercept();
            }else if(y > 0 && x < 0 && y%x != 0){
                int negativeX1 = x * -1;
                one = "y = " + "-" + y + "/" + negativeX1 + "x + " + yIntercept();
            }else if(y > 0 && x < 0 && y%x == 0 && Math.abs(y) != Math.abs(x)){
                int reduced3 = y/x;
                one = "y = " + reduced3 + "x + " + yIntercept();
            }else if(y > 0 && x < 0 && y%x == 0 && Math.abs(y) == Math.abs(x)){
                one = "y = -x + " + yIntercept();
            }

        }else if(yIntercept() < 0){
            double yIntercept = yIntercept() * -1;
            if(y == 0){
                one = "y = " + y1;
            }else if(y == x){
                one = "y = x - " + yIntercept;
            }else if(y > 0 && x > 0 && y%x != 0){
                one = "y = " + y + "/" + x + "x - " + yIntercept;
            }else if(y > 0 && x > 0 && y%x == 0){
                int reduced = y/x;
                one = "y = " + reduced + "x - " + yIntercept;
            }else if(y < 0 && x < 0 && y%x != 0){
                int negativeY = y * -1;
                int negativeX = x * -1;
                one = "y = " + negativeY + "/" + negativeX + "x - " + yIntercept;
            }else if(y < 0 && x < 0 && y%x == 0){
                int reduced1 = y/x;
                one = "y = " + reduced1 + "x - " + yIntercept;
            }else if(y < 0 && x > 0 && y%x != 0){
                one = "y = " + y + "/" + x + "x - " + yIntercept;
            }else if(y < 0 && x > 0 && y%x == 0 && Math.abs(y) != Math.abs(x)){
                int reduced2 = y/x;
                one = "y = " + reduced2 + "x - " + yIntercept;
            }else if(y < 0 && x > 0 && y%x == 0 && Math.abs(y) == Math.abs(x)){
                one = "y = -x - " + yIntercept;
            }else if(y > 0 && x < 0 && y%x != 0){
                int negativeX1 = x * -1;
                one = "y = " + "-" + y + "/" + negativeX1 + "x - " + yIntercept;
            }else if(y > 0 && x < 0 && y%x == 0 && Math.abs(y) != Math.abs(x)){
                int reduced3 = y/x;
                one = "y = " + reduced3 + "x - " + yIntercept;
            }else if(y > 0 && x < 0 && y%x == 0 && Math.abs(y) == Math.abs(x)){
                one = "y = -x - " + yIntercept;
            }
        }else if(yIntercept() == 0){
            if(y == x){
                one = "y = x";
            }else if(y > 0 && x > 0 && y%x != 0){
                one = "y = " + y + "/" + x + "x";
            }else if(y > 0 && x > 0 && y%x == 0){
                int reduced = y/x;
                one = "y = " + reduced + "x";
            }else if(y < 0 && x < 0 && y%x != 0){
                int negativeY = y * -1;
                int negativeX = x * -1;
                one = "y = " + negativeY + "/" + negativeX + "x + " + yIntercept();
            }else if(y < 0 && x < 0 && y%x == 0){
                int reduced1 = y/x;
                one = "y = " + reduced1 + "x";
            }else if(y < 0 && x > 0 && y%x != 0){
                one = "y = " + y + "/" + x + "x";
            }else if(y < 0 && x > 0 && y%x == 0 && Math.abs(y) != Math.abs(x)){
                int reduced2 = y/x;
                one = "y = " + reduced2 + "x";
            }else if(y < 0 && x > 0 && y%x == 0 && Math.abs(y) == Math.abs(x)){
                one = "y = -x";
            }else if(y > 0 && x < 0 && y%x != 0){
                int negativeX1 = x * -1;
                one = "y = " + "-" + y + "/" + negativeX1 + "x";
            }else if(y > 0 && x < 0 && y%x == 0 && Math.abs(y) != Math.abs(x)){
                int reduced3 = y/x;
                one = "y = " + reduced3 + "x";
            }else if(y > 0 && x < 0 && y%x == 0 && Math.abs(y) == Math.abs(x)){
                one = "y = -x";
            }
        }
        return one;
    }




    // Returns a String of the coordinate point on the line in specified format
    public String coordinateForX(double xValue){
        double coordinateY = xValue * slope() + yIntercept();
        return "(" + xValue + ", " + coordinateY + ")";
    }




    // Returns the value toRound rounded to the nearest hundredths place
    public double roundedToHundredth(double toRound){
        return Math.round(toRound * 100.0) / 100.0;
    }




    // Returns a string with all the information about the linear equation
    public String lineInfo(){
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" + "\n" + "The equation of the line between these points is: " + equation() + "\n" + "The slope of this line is: " + slope() + "\n" + "The y-intercept of the line is " + yIntercept() + "\n" + "The distance between the two points is: " + distance();
    }

}
