import java.util.*;
import java.text.DecimalFormat;

public class Groc {
    static class Gro {
        String name;
        double val;
        int mul;
        
        Gro(String name, double val, int mul) {
            this.name = name;
            this.val = val;
            this.mul = mul;
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       List<Gro> grocs = new ArrayList<>();
        int decimalPlaces = 2; // Set the desired number of decimal places

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(decimalPlaces);

        int i = 0;
        while (i < 3) {
            String name = sc.next();
            double val = sc.nextDouble();
            int mul = sc.nextInt();
            grocs.add(new Gro(name , val , mul));
            i++;
        }
        for (Gro gro:grocs) {
            System.out.println("Name: " + gro.name + ", val: " + df.format(gro.val) + ", mul: " + gro.mul);
        }
    }
}
