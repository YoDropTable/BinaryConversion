/**
 * Created by phiga on 9/5/2016.
 */
public class NumberBase {

    public static  String convert(String input, int base_in, int base_out){
        if(base_out == 10)
            return convertToBaseTen(input,base_in)+"";
        else
            return convertToBaseX(convertToBaseTen(input,base_in),base_out) + "";
    }

    public static int convertToBaseTen(String input, int base_in){
        input = new StringBuilder(input).reverse().toString();
        int value = 0;
        for(int i=0;i<input.length();i++)
            value += getIntFromChar(input.charAt(i),base_in) * Math.pow(base_in, i);
        return value;
    }

    public static String convertToBaseX(int input, int base_out){
        String returnString = "";
        do{
            int remainder = input % base_out;
            input /= base_out;
            returnString += getCharFromValue(remainder);
        }while(input > 0);
        return new StringBuilder(returnString).reverse().toString();
    }
    
    public static char getCharFromValue(int base_in)
    {
        if(base_in > 35)
            throw new IllegalArgumentException("Only Accepts up to Base 35");
        //if greater than 9 its 10.. -10 takes to 0.. 'a' value
        //else return 0-9 value to string ascii values start at 48
        //cool trick 0 is ascii value 48
        if(base_in > 9)
            return (char)( 'a' + (base_in - 10));
        else
            return (char) (base_in + '0');
    }

    public static int getIntFromChar(char input,int base_in){
        int rValue=-1;
        switch( Character.toLowerCase(input)) {

            case '0':
                rValue =  0;
                break;
            case '1':
                rValue =  1;
                break;
            case '2':
                rValue =  2;
                break;
            case '3':
                rValue =  3;
                break;
            case '4':
                rValue =  4;
                break;
            case '5':
                rValue =  5;
                break;
            case '6':
                rValue =  6;
                break;
            case '7':
                rValue =  7;
                break;
            case '8':
                rValue =  8;
                break;
            case '9':
                rValue =  9;
                break;
            case 'a':
                rValue =  10;
                break;
            case 'b':
                rValue =  11;
                break;
            case 'c':
                rValue =  12;
                break;
            case 'd':
                rValue =  13;
                break;
            case 'e':
                rValue =  14;
                break;
            case 'f':
                rValue =  15;
                break;
            case 'g':
                rValue =  16;
                break;
            case 'h':
                rValue =  17;
                break;
            case 'i':
                rValue =  18;
                break;
            case 'j':
                rValue =  19;
                break;
            case 'k':
                rValue =  20;
                break;
            case 'l':
                rValue =  21;
                break;
            case 'm':
                rValue =  22;
                break;
            case 'n':
                rValue =  23;
                break;
            case 'o':
                rValue =  24;
                break;
            case 'p':
                rValue =  25;
                break;
            case 'q':
                rValue =  26;
                break;
            case 'r':
                rValue =  27;
                break;
            case 's':
                rValue =  28;
                break;
            case 't':
                rValue =  29;
                break;
            case 'u':
                rValue =  30;
                break;
            case 'v':
                rValue =  31;
                break;
            case 'w':
                rValue =  32;
                break;
            case 'x':
                rValue =  33;
                break;
            case 'y':
                rValue =  34;
                break;
            case 'z':
                rValue =  35;
                break;
            default:
                throw new IllegalArgumentException("Not a Valid Character: " + input);
            }
        if(rValue >= base_in)
            throw new IllegalArgumentException("Invalid Value: " + rValue + "in base: " + input);
        else
            return rValue;
    }
}
