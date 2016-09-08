/**
 * Created by phiga on 9/5/2016.
 */
public class Test {
    public static void main(String[] args) {


        String output="";
        //output += NumberBase.convert("10101012",2,37);
        //output += NumberBase.convert("101010#",2,10);
        System.out.println(output);
        for(int i=2; i< 36;i++)
        {
            for(int i2=2;i2<36;i2++) {
                for (int num = 0; num < 244444; num++) {
                    String result1 = NumberBase.convert(Integer.toString(num,i), i, i2);
                    String result2 = Integer.toString(num, i2);
                    if(!result1.equals(result2))
                        System.out.println(i + ":" + i2 + "===" + num + " Failed!" );
                }
                System.out.println("Finished with " + i2);
            }
            System.out.println("Finished with " + i);
        }
        System.out.println("DONE!");
    }
}
