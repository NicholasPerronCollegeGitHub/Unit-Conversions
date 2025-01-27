import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        char mode        ='!';
        int select1      = -1;
        int select2      = -1;
        double number    =  0;
        double numholder =  0;
        String unit1     = "";
        String unit2     = "";
        Scanner selection = new Scanner(System.in);
        while(mode !='E'){
            if(mode == '!'){
                System.out.println("Please enter the mode you would like to select (using the characters in the square brackets)");
                System.out.println("[M]ass ");  
                System.out.println("[L]ength");
                System.out.println("[T]emperature");  
                System.out.println("[V]olume");
                System.out.println("[S]peed");
                System.out.println("Alternatively, input [E] to exit."); 
                mode = selection.nextLine().toUpperCase().charAt(0);
            } else if (mode !='M' && mode !='L' && mode !='T' && mode !='V' && mode !='S'){
                System.out.println("Please enter a valid mode ([M],[L],[T],[V],[S],or[E])");
                mode = selection.nextLine().toUpperCase().charAt(0);
            }
            while(mode == 'M'){
                while(select1 == -1){
                    System.out.println("Please enter a number to select the first unit type");
                    System.out.println("[0]: Back");
                    System.out.println("[1]: Miligram");
                    System.out.println("[2]: Gram");
                    System.out.println("[3]: Kilogram");
                    System.out.println("[4]: Ounce");
                    System.out.println("[5]: Pound");
                    select1 = selection.nextInt();
                }
                while(select1 >5 || select1 < -1){
                    System.out.println("Please enter a valid unit type");
                    select1 = selection.nextInt();
                }
                if(select1 == 0){
                    select1 = -1;
                    select2 = -1;
                    mode    = '!';
                    selection.nextLine(); //gets rid of newline character after inputting the back key so that the program does not crash
                    continue;
                }
                System.out.print("Please enter The number of units to convert: ");
                number = selection.nextFloat();
                numholder = number;
                switch(select1){

                    case 1:
                    number = number / 1000;
                    unit1   = "Miligrams";
                    break;
                    case 2:

                    unit1   = "Grams";
                    break;
                    case 3:

                    number = number * 1000;
                    unit1   = "Kilograms";
                    break;

                    case 4:
                    number = number * 28.35;
                    unit1   = "Ounces";
                    break;

                    case 5:
                    number = number * 453.6;
                    unit1  = "Pounds";
                    break;

                }
                while(select2 == -1 || select2 < -1){
                    System.out.println("Please enter a number to select the Second unit type");
                    System.out.println("[0]: Back");
                    System.out.println("[1]: Miligram");
                    System.out.println("[2]: Gram");
                    System.out.println("[3]: Kilogram");
                    System.out.println("[4]: Ounce");
                    System.out.println("[5]: Pound");
                    select2 = selection.nextInt();
                }
                while(select2 >5){
                    System.out.println("Please enter a valid unit type");
                    select2 = selection.nextInt();
                }
                if(select2 == 0){
                    select1 = -1;
                    select2 = -1;
                    mode    = '!';
                    selection.nextLine(); //gets rid of newline character after inputting the back key so that the program does not crash
                    continue;
                }

                switch(select2){

                    case 1:
                    number = number * 1000;
                    unit2   = "Miligrams";
                    break;
                    
                    case 2:

                    unit2   = "Grams";
                    break;
                    case 3:

                    number = number / 1000;
                    unit2   = "Kilograms";
                    break;

                    case 4:
                    number = number / 28.35;
                    unit2   = "Ounces";
                    break;

                    case 5:
                    number = number / 453.6;
                    unit2  = "Pounds";
                    break;

                }
                
                System.out.println("Converting " + numholder + " " + unit1 + " to " + unit2 + " results in " + number + " " + unit2 + ".");
                select1 = -1;
                select2 = -1;
                mode    = '!';
                selection.nextLine();
                System.out.print("Press Enter to continue");
                selection.nextLine();
                continue;

            }
            while(mode == 'L'){
                while(select1 == -1){
                    System.out.println("Please enter a number to select the first unit type");
                    System.out.println("[0]: Back");
                    System.out.println("[1]: Milimeter");
                    System.out.println("[2]: Centimeter");
                    System.out.println("[3]: Meter");
                    System.out.println("[4]: Kilometer");
                    System.out.println("[5]: Inch");
                    System.out.println("[6]: Foot");
                    System.out.println("[7]: Yard");
                    System.out.println("[8]: Mile");
                    select1 = selection.nextInt();
                }
                while(select1 > 8 || select1 < -1){
                    System.out.println("Please enter a valid unit type");
                    select1 = selection.nextInt();
                }
                if(select1 == 0){
                    select1 = -1;
                    select2 = -1;
                    mode    = '!';
                    selection.nextLine(); //gets rid of newline character after inputting the back key so that the program does not crash
                    continue;
                }
                System.out.print("Please Enter The number of units to convert: ");
                number = selection.nextFloat();
                numholder = number;
                switch(select1){

                    case 1:

                    number = number / 1000;
                    unit1 = "Milimeters";
                    break;

                    case 2:

                    number = number /100;
                    unit1 = "Centimeters";
                    break;

                    case 3:

                    unit1 = "Meters";
                    break;

                    case 4:

                    unit1 = "Kilometers";
                    number = number * 1000;
                    break;

                    case 5:

                    unit1 = "Inches";
                    number = number / 39.37;
                    break;

                    case 6:

                    unit1 = "Feet";
                    number = number / 3.281;
                    break;

                    case 7:

                    unit1 = "Yards";
                    number = number / 1.094;
                    break;

                    case 8:
                    
                    unit1 = "Miles";
                    number = number * 1609;

                }
                while(select2 == -1 || select2 < -1){
                    System.out.println("Please enter a number to select the Second unit type");
                    System.out.println("[0]: Back");
                    System.out.println("[1]: Milimeter");
                    System.out.println("[2]: Centimeter");
                    System.out.println("[3]: Meter");
                    System.out.println("[4]: Kilometer");
                    System.out.println("[5]: Inch");
                    System.out.println("[6]: Foot");
                    System.out.println("[7]: Yard");
                    System.out.println("[8]: Mile");
                    
                    select2 = selection.nextInt();
                }
                while(select2 > 8){
                    System.out.println("Please enter a valid unit type");
                    select2 = selection.nextInt();
                }
                if(select2 == 0){
                    select1 = -1;
                    select2 = -1;
                    mode    = '!';
                    selection.nextLine(); //gets rid of newline character after inputting the back key so that the program does not crash
                    continue;
                }

                switch(select2){

                    case 1:

                    number = number * 1000;
                    unit2 = "Milimeters";
                    break;

                    case 2:

                    number = number * 100;
                    unit2 = "Centimeters";
                    break;

                    case 3:

                    unit2 = "Meters";
                    break;

                    case 4:

                    unit2 = "Kilometers";
                    number = number / 1000;
                    break;

                    case 5:

                    unit2 = "Inches";
                    number = number * 39.37;
                    break;

                    case 6:

                    unit2 = "Feet";
                    number = number * 3.281;
                    break;

                    case 7:

                    unit2 = "Yards";
                    number = number * 1.094;
                    break;

                    case 8:
                    
                    unit2 = "Miles";
                    number = number / 1609;

                }
                
                System.out.println("Converting " + numholder + " " + unit1 + " to " + unit2 + " results in " + number + " " + unit2 + ".");
                select1 = -1;
                select2 = -1;
                mode    = '!';
                selection.nextLine();
                System.out.print("Press Enter to continue");
                selection.nextLine();
                continue;

            }
            while(mode == 'T'){
                while(select1 == -1){
                    System.out.println("Please enter a number to select the first unit type");
                    System.out.println("[0]: Back");
                    System.out.println("[1]: Fahrenheit");
                    System.out.println("[2]: Celsius");
                    System.out.println("[3]: Kelvin");
                    select1 = selection.nextInt();
                }
                while(select1 >3 || select1 < -1){
                    System.out.println("Please enter a valid unit type");
                    select1 = selection.nextInt();
                }
                if(select1 == 0){
                    select1 = -1;
                    select2 = -1;
                    mode    = '!';
                    selection.nextLine(); //gets rid of newline character after inputting the back key so that the program does not crash
                    continue;
                }
                System.out.print("Please Enter The number of units to convert: ");
                number = selection.nextFloat();
                numholder = number;
                switch(select1){

                    case 1:
                    
                    unit1 = "Degrees Fahrenheit"; //split as I was getting odd errors when this was all one equation
                    number = number - 32;
                    number = number / 9;
                    number = number * 5;
                    break;
                    
                    case 2:

                    unit1 = "Degrees Celsius";
                    break;

                    case 3:

                    unit1 = "Degrees Kelvin";
                    number = number - 273.15;
                    break;

                }
                while(select2 == -1 || select2 < -1){
                    System.out.println("Please enter a number to select the Second unit type");
                    System.out.println("[0]: Back");
                    System.out.println("[1]: Fahrenheit");
                    System.out.println("[2]: Celsius");
                    System.out.println("[3]: Kelvin");
                    
                    select2 = selection.nextInt();
                }
                while(select2 >3){
                    System.out.println("Please enter a valid unit type");
                    select2 = selection.nextInt();
                }
                if(select2 == 0){
                    select1 = -1;
                    select2 = -1;
                    mode    = '!';
                    selection.nextLine(); //gets rid of newline character after inputting the back key so that the program does not crash
                    continue;
                }

                switch(select2){

                    case 1:
                    
                    unit2 = "Degrees Fahrenheit"; //split for reasons described above
                    number = number * 9;
                    number = number / 5;
                    number = number + 32;
                    break;
                    
                    case 2:

                    unit2 = "Degrees Celsius";
                    break;

                    case 3:

                    unit2 = "Degrees Kelvin";
                    number = number + 273.15;
                    break;

                }
                
                System.out.println("Converting " + numholder + " " + unit1 + " to " + unit2 + " results in " + number + " " + unit2 + ".");
                select1 = -1;
                select2 = -1;
                mode    = '!';
                selection.nextLine();
                System.out.print("Press Enter to continue");
                selection.nextLine();
                continue;

            }
            while(mode == 'V'){
                while(select1 == -1){
                    System.out.println("Please enter a number to select the first unit type");
                    System.out.println("[0]: Back");
                    System.out.println("[1]: Mililiter");
                    System.out.println("[2]: Liter");
                    System.out.println("[3]: Cubic Meter");
                    System.out.println("[4]: US gallon");
                    System.out.println("[5]: US quart");
                    System.out.println("[6]: US pint");
                    System.out.println("[7]: US cup");
                    System.out.println("[8]: US fluid ounce");
                    System.out.println("[9]: Imperial gallon");
                    System.out.println("[10]: Imperial quart");
                    System.out.println("[11]: Imperial pint");
                    System.out.println("[12]: Imperial cup");
                    System.out.println("[13]: Imperial fluid ounce");
                    select1 = selection.nextInt();
                }
                while(select1 > 13 || select1 < -1){
                    System.out.println("Please enter a valid unit type");
                    select1 = selection.nextInt();
                }
                if(select1 == 0){
                    select1 = -1;
                    select2 = -1;
                    mode    = '!';
                    selection.nextLine(); //gets rid of newline character after inputting the back key so that the program does not crash
                    continue;
                }
                System.out.print("Please Enter The number of units to convert: ");
                number = selection.nextFloat();
                numholder = number;
                switch(select1){

                    case 1:

                    unit1 = "Mililliters";
                    number = number / 1000;
                    break;

                    case 2:

                    unit1 = "Liters";
                    break;

                    case 3:

                    unit1 = "Cubic meters";
                    number = number * 1000;
                    break;

                    case 4:

                    unit1 = "US gallons";
                    number = number * 3.785;
                    break;

                    case 5:

                    unit1 = "US quarts"; 
                    number = number / 1.057;
                    break;

                    case 6:

                    unit1 = "US pints";
                    number = number / 2.113;
                    break;

                    case 7:

                    unit1 = "US cups";
                    number = number / 4.167;
                    break;

                    case 8:

                    unit1 = "US fluid ounces";
                    number = number / 33.814;
                    break;

                    case 9:

                    unit1 = "Imperial gallons";
                    number = number * 4.546;
                    break;

                    case 10:

                    unit1 = "Imperial quarts";
                    number = number * 1.137;
                    break;

                    case 11:

                    unit1 = "Imperial pints";
                    number = number / 1.76;
                    break;

                    case 12:

                    unit1 = "Imperial cups";
                    number = number / 3.52;
                    break;

                    case 13:

                    unit1 = "Imperial fluid ounces";
                    number = number / 35.195;
                    break;

                }
                while(select2 == -1 || select2 < -1){
                    System.out.println("Please enter a number to select the Second unit type");
                    System.out.println("[0]: Back");
                    System.out.println("[1]: Mililiter");
                    System.out.println("[2]: Liter");
                    System.out.println("[3]: Cubic Meter");
                    System.out.println("[4]: US gallon");
                    System.out.println("[5]: US quart");
                    System.out.println("[6]: US pint");
                    System.out.println("[7]: US cup");
                    System.out.println("[8]: US fluid ounce");
                    System.out.println("[9]: Imperial gallon");
                    System.out.println("[10]: Imperial quart");
                    System.out.println("[11]: Imperial pint");
                    System.out.println("[12]: Imperial cup");
                    System.out.println("[13]: Imperial fluid ounce");
                    
                    select2 = selection.nextInt();
                }
                while(select2 > 13){
                    System.out.println("Please enter a valid unit type");
                    select2 = selection.nextInt();
                }
                if(select2 == 0){
                    select1 = -1;
                    select2 = -1;
                    mode    = '!';
                    selection.nextLine(); //gets rid of newline character after inputting the back key so that the program does not crash
                    continue;
                }

                switch(select2){

                    case 1:

                    unit2 = "Mililliters";
                    number = number * 1000;
                    break;

                    case 2:

                    unit2 = "Liters";
                    break;

                    case 3:

                    unit2 = "Cubic meters";
                    number = number / 1000;
                    break;

                    case 4:

                    unit2 = "US gallons";
                    number = number / 3.785;
                    break;

                    case 5:

                    unit2 = "US quarts"; 
                    number = number * 1.057;
                    break;

                    case 6:

                    unit2 = "US pints";
                    number = number * 2.113;
                    break;

                    case 7:

                    unit2 = "US cups";
                    number = number * 4.167;
                    break;

                    case 8:

                    unit2 = "US fluid ounces";
                    number = number * 33.814;
                    break;

                    case 9:

                    unit2 = "Imperial gallons";
                    number = number / 4.546;
                    break;

                    case 10:

                    unit2 = "Imperial quarts";
                    number = number / 1.137;
                    break;

                    case 11:

                    unit2 = "Imperial pints";
                    number = number * 1.76;
                    break;

                    case 12:

                    unit2 = "Imperial cups";
                    number = number * 3.52;
                    break;

                    case 13:

                    unit2 = "Imperial fluid ounces";
                    number = number * 35.195;
                    break;
                    
                }
                
                System.out.println("Converting " + numholder + " " + unit1 + " to " + unit2 + " results in " + number + " " + unit2 + ".");
                select1 = -1;
                select2 = -1;
                mode    = '!';
                selection.nextLine();
                System.out.print("Press Enter to continue");
                selection.nextLine();
                continue;

            }
            while(mode == 'S'){
                while(select1 == -1){
                    System.out.println("Please enter a number to select the first unit type");
                    System.out.println("[0]: Back");
                    System.out.println("[1]: Miles per hour");
                    System.out.println("[2]: Feet per second");
                    System.out.println("[3]: Meters per second");
                    System.out.println("[4]: Kilometers per hour");
                    select1 = selection.nextInt();
                }
                while(select1 >4 || select1 < -1){
                    System.out.println("Please enter a valid unit type");
                    select1 = selection.nextInt();
                }
                if(select1 == 0){
                    select1 = -1;
                    select2 = -1;
                    mode    = '!';
                    selection.nextLine(); //gets rid of newline character after inputting the back key so that the program does not crash
                    continue;
                }
                System.out.print("Please Enter The number of units to convert: ");
                number = selection.nextFloat();
                numholder = number;
                switch(select1){

                    case 1:

                    unit1 = "Miles per hour";
                    number = number / 2.237;
                    break;

                    case 2:

                    unit1 = "Feet per second";
                    number = number / 3.281;
                    break;

                    case 3:

                    unit1 = "Meters per second";
                    break;

                    case 4:

                    unit1 = "Kilometers per hour";
                    number = number / 3.6;
                    break;

                }
                while(select2 == -1 || select2 < -1){
                    System.out.println("Please enter a number to select the Second unit type");
                    System.out.println("[0]: Back");
                    System.out.println("[1]: Miles per hour");
                    System.out.println("[2]: Feet per second");
                    System.out.println("[3]: Meters per second");
                    System.out.println("[4]: Kilometers per hour");
                    
                    select2 = selection.nextInt();
                }
                while(select2 >4){
                    System.out.println("Please enter a valid unit type");
                    select2 = selection.nextInt();
                }
                if(select2 == 0){
                    select1 = -1;
                    select2 = -1;
                    mode    = '!';
                    selection.nextLine(); //gets rid of newline character after inputting the back key so that the program does not crash
                    continue;
                }

                switch(select2){

                    case 1:

                    unit2 = "Miles per hour";
                    number = number * 2.237;
                    break;

                    case 2:

                    unit2 = "Feet per second";
                    number = number * 3.281;
                    break;

                    case 3:

                    unit2 = "Meters per second";
                    break;

                    case 4:

                    unit2 = "Kilometers per hour";
                    number = number * 3.6;
                    break;

                }
                
                System.out.println("Converting " + numholder + " " + unit1 + " to " + unit2 + " results in approximately " + number + " " + unit2 + ".");
                select1 = -1;
                select2 = -1;
                mode    = '!';
                selection.nextLine();
                System.out.print("Press Enter to continue");
                selection.nextLine();
                continue;

            }
        }
        System.out.println("");
        System.out.println("Thank you for using this unit converter!");
        System.out.println("");
        selection.close();
    }
}
