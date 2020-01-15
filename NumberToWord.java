import com.ns.*;
public class NumberToWord {
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public static void inIndianSystem(String strNum) {
        IndianSystem is = new IndianSystem();
        if(isNumeric(strNum)) {
            if(strNum.length() < 10) {
                int num = Integer.parseInt(strNum);
                System.out.println(strNum + " -> " + is.convert(num).trim());
            } else {
                System.out.println("Error: Provided number '" + strNum + "' is over maximum limit.");
            }
        } else {
            System.out.println("Error: Provided argument '" + strNum + "' is not a number.");
        }
    }
    public static void inWesternSystem(String strNum) {
        WesternSystem ws = new WesternSystem();
        if(isNumeric(strNum)) {
            if(strNum.length() < 10) {
                int num = Integer.parseInt(strNum);
                System.out.println(strNum + " -> " + ws.convert(num).trim());
            } else {
                System.out.println("Error: Provided number '" + strNum + "' is over maximum limit.");
            }
        } else {
            System.out.println("Error: Provided argument '" + strNum + "' is not a number.");
        }
    }
    public static void main(String[] args) {
        if(args.length > 1) {
            switch(args[0]) {
                case "-w":
                case "--western":
                    inWesternSystem(args[1]);
                    break;
                case "-i":
                case "--indian":
                    inIndianSystem(args[1]);
                    break;
                default:
                    System.out.println("Error: Provided option '" + args[0] + "' is not available.");
            }
        } else {
            inIndianSystem(args[0]);
        }
    }
}