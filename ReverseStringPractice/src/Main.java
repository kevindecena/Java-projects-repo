import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String: ");
        String name = input.nextLine();
        System.out.println(reverse(name));
}

public static String reverse(String name){
        if(name==null || name.isEmpty()){
            return name;
        }
        return name.charAt(name.length()-1) + reverse(name.substring(0, name.length() -1));
    }
}