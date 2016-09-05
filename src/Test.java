/**
 * Created by phiga on 9/5/2016.
 */
public class Test {
    public static void main(String[] args) {

        for(int i=0;i<36;i++) {

            System.out.print("The number " + i + " is ");
            System.out.print(NumberBase.getIntFromChar(NumberBase.getCharFromValue(i),35) + " and is ");
            System.out.println(NumberBase.getCharFromValue(i));
        }

        String output="";
        output += NumberBase.convert("214748344",10,10);
        System.out.println(output);

    }
}
