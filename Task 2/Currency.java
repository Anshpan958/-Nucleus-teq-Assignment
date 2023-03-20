import java.util.Scanner;
public class Currency{
    public static int convert(String str)
    {
        int val = 0;
//        System.out.println("String = " + str);

        // Convert the String
        try {
            val = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {

            // This is thrown when the String
            // contains characters other than digits
            System.out.println("Invalid String");
        }
        return val;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int len = input.length();
//        System.out.println(len);



        String newinput = input.substring(0, len-2);
//        System.out.println(newinput);



        float consider = convert(newinput);
        consider /= 60.0;
        System.out.print(consider);
        System.out.println(" dollar");
//        switch(input){
//            case "rs":System.out.println("$");
//        }
    }
}