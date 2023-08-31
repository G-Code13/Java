public class Main {
    // static Boolean a;
    // static Boolean b;
    // static Boolean c;
    public static void main(String[] args) throws Exception {
    //     Boolean bool = (a = true) || (b = true) && (c = true);
    //     System.out.println(a + ", " + b + ", " + c);

    // String str = "7" + 5 + 10;
    // str = 7 + 5 + "10";
    // str = "7" + (5 + 10);
    // System.out.println(str);

    // int m = 50; // equals 50
    // int n = ++m; // equals 51
    // int o = m--; // equals 51
    // int p = --o + m++; //equals 100
    // int x = m<n?n<o?o<p?p:o:n:m;//Im confused with this Sh*t!! but equals 51
    // /*never mind I figured it out. this is an enhanced if statement and it reads as follows 
    // if m<n then either p or o
    // if n<o the either o or n
    // if o<p the either n or m
    // */
    // System.out.println(x);

    // int k = 4;
    // boolean flag = k++ == 5;
    // flag = !flag;
    // System.out.println(flag);

    byte b = 1; 
    //b = b<<1; fail to compile a shift can not go into a byte
    int c = b<<1;
    //byte d += b; fail to compile the variable d has no assignment
    byte e = 0;
    e += b;
    System.out.println(c + "\n" + e);
    }
}
