public class Headphones {
//Headphone Section

  String charge = "USB";
  String[] controls = {"power", "volume", "skip", "play/pause"};
  String color = "black";

  boolean power = false;
   int volume = 0;

  public void powerOn(){
    power = true;
  }
  public void powerOff(){
    power = false;
  }
  public void volumeUp(){
    volume++;
  }
  public void volumeDown(){
    volume--;
  }
}
