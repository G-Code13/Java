public class Main {
  public static void main(String[] args) {
    
    Headphones h = new Headphones();

      System.out.println(h.color);
        h.volumeUp();
        h.volumeUp();
      System.out.println(h.volume);
        h.powerOff();
      System.out.println(h.power);
        h.powerOn();
      System.out.println(h.power);

    System.out.println("");
    Pen p = new Pen();

      System.out.println(p.color1);
        p.clickOff();
      System.out.println(p.click);
        p.click();
      System.out.println(p.click);


  }
}
