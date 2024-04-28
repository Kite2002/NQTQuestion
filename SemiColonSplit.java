import java.util.*;
import java.text.DecimalFormat;

public class SemiColonSplit {
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
        int decimalPlaces = 2; 

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(decimalPlaces);
        
        System.out.println("Enter groceries (name, value, multiplier) separated by semicolon (;):");
        String input = sc.nextLine();
        String[] inputArr = input.split(";");
        for(String in : inputArr){
            String[] single = in.split(",");
            String name = single[0];
            double val = Double.parseDouble(single[1]);
            int mul = Integer.parseInt(single[2]);
            grocs.add(new Gro(name , val , mul));
        }
        for (Gro gro:grocs) {
            System.out.println("Name: " + gro.name + ", val: " + df.format(gro.val) + ", mul: " + gro.mul);
        }
    }
}
