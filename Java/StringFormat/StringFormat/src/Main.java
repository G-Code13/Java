public class Main {
    public static void main(String[] args) throws Exception {

        /*Common String Formats
         * d = Decimal, Integral
         * x or X = Hex will show the number in Hexadecimal form, Integral
         * f = Decimal, Floating point
         * e or E = Scientific Notation, Floating point
         * s = String
         * ******FORMAT FLAGS*******
         * # = Include radix, Shows what base the value is in
         * 0 = Zero padding
         * - = Left Justify
         * , = Grouping separator, separates long numbers with comas 
         * space = 
         * + = Always shows sign
         * ( = Enclose negative with parenthesis
         */

        int a = 100, b = -200, c = 7896, d = 3;
        String s1 = String.format("A: % d", a);//using space and %d This will line up the numbers evenly
        String s2 = String.format("B: % d", b);//using space and %d
            System.out.println("Using space to line up numbers even though you have a negative number in place");
            System.out.println(s1);
            System.out.println(s2 + "\n");
            
        s1 = String.format("A: %x", a);//converting to hex
        s2 = String.format("B: %x", b);//converting to hex
        System.out.println("Showing the numbers in Hexadecimal form");
            System.out.println(s1);
            System.out.println(s2 + "\n");

        s1 = String.format("A:% -4d  B:% -4d", a, b);//left justified four spaces 
        s2 = String.format("C:% -4d D:% -4d", c, d);
            System.out.println("Left justified");
            System.out.println(s1 + "\n" + s2 + "\n");


        //Working on String formats for objects and Arrays

        // Company employee1 = new Employee("Greg Shannon", "567", 125000);
        //     System.out.println(employee1);

        // Company[] employees = new Employee[2];
        // employees[0] = new Employee("John", "123", 110000);
        // employees[1] = new Employee("John1", "321", 180000);
        // System.out.println(employees[0] + ": " + employees[1]);

        
        
    }
}
