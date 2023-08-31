public class Main {
    public static void main(String[] args) throws Exception {
        //converting a string to an int
        String str = "15";
        int x = Integer.parseInt(str);
            System.out.println(x + "\n");

        //converting an int to a String
        int i = 200;
        String str2 = Integer.toString(i);
            System.out.println(i + 100);
            System.out.println(str2 + 100 + "\n");

        //Formatting doubles and int to Strings
        double y = 200;
        int j = 300;
        String str3 = String.format("%.5f\n",y);
        String str4 = String.format("%d",j);
            System.out.println(str3 + str4);
    }
}
