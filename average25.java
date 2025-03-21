import java.util.Scanner;

public class average25 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int sum=0;
        
        for(int i=1;i<=25;i++){
            System.out.print("Enter mark "+i+": ");
            int mark =sc.nextInt();
            sum+=mark;
        }
        System.out.println("Total sum of marks: "+sum);
        sc.close();
    }    
}
