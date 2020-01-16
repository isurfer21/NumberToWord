import utils.Detect;
import systems.IndianSystem;
import systems.WesternSystem;
public class Main {
    public static final String APPNAME = "NumberToWord";
    public static final String APPVER = "1.0.0";
    public static void printVersion() {
        String strVer = APPNAME + " \n" +
                         "Version " + APPVER + " \n" +
                         "A command-line app to convert given number into words. \n" +
                         "Copyright (c) 2020 Abhishek Kumar under MIT license. \n";
        System.out.println(strVer);
    }
    public static void printHelp() {
        String strHelp = "Syntax: \n" +
                         " convert <option> <number>\n\n" +
                         "Options: \n" +
                         " -i   --indian     in Indian numbering system (default) \n" +
                         " -w   --western    in Western numbering system \n" +
                         " -h   --help       show available command & options \n";
        System.out.println(strHelp);
    }
    public static void inIndianSystem(String strNum) {
        IndianSystem is = new IndianSystem();
        if(Detect.isNumeric(strNum)) {
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
        if(Detect.isNumeric(strNum)) {
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
        } else if(args.length == 1) {
            switch(args[0]) {
                case "-v":
                case "--version":
                    printVersion();
                    break;
                case "-h":
                case "--help":
                    printHelp();
                    break;
                default:
                    inIndianSystem(args[0]);
            }
        } else {
            System.out.println("Error: Missing arguments.");
        }
    }
}