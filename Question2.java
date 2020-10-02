import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        /* Write your code here */
     System.out.println(" hi there pal What is your name?");
     System.out.println(" how old are you?");
     String name;
     String age;
     name = scan.nextLine();
      age = scan.nextLine();
      System.out.println("Hello " + name + "is" + " " + age + "  ");
    }
}