
import java.util.Scanner; 
class Solution {
    public void studentGrade(int marks) {
        if (marks >= 90) {
            System.out.print("Grade A");
        } else if (marks >= 70) {
            System.out.print("Grade B");
        } else if (marks >= 50) {
            System.out.print("Grade C");
        } else if (marks >= 35) {
            System.out.print("Grade D");
        } else {
            System.out.print("Fail");
        }
    }
}

class grade {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int marks;

        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter your marks: ");
        marks = sc.nextInt();

        sol.studentGrade(marks);
    }
}