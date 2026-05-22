import java.util.Scanner;
public class Vote
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter age");
int age = sc.nextInt();

if(age >= 18){
    System.out.println("eligble for vote");
}
else{
    System.out.println("not eligible");
}
}
}