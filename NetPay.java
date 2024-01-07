import java.util.*;

public class NetPay {
    public static void main(String[] args) {

        String employeeName;
        double grossPay;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter employee name:\t");
        employeeName = in.nextLine();

        System.out.print("Enter gross pay:\t");
        grossPay = in.nextFloat();
        
        double tax = grossPay*15/100;
        double sss = grossPay*3.63/100;
        double medicare = grossPay*1.25/100;
        double pagibig = 100.0;
        double netPay = grossPay-(tax+sss+medicare+pagibig);
        
        System.out.println("\n");
        System.out.println("Employee Name:         " + employeeName);
        System.out.println("Gross Pay:             " + grossPay);
        System.out.println("----------------------------------");
        System.out.println("Deductions             Amount");
        System.out.println("Witholding Tax:        " + tax);
        System.out.println("SSS Contribution:      " + sss);
        System.out.println("Medicare:              " + medicare);
        System.out.println("Pagibig Contribution:  " + pagibig);
        System.out.println("----------------------------------");
        System.out.println("Net Pay:               " + netPay);
    }
}
