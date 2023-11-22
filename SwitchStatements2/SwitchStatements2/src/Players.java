public class Players {
    
    private int jerseyNumber;
    private String playerName;
    private double playerHeight;

    Players(){

    }

    Players(int jerseyNumber, String playerName, double playerHeight){
        this.jerseyNumber = jerseyNumber;
        this.playerName = playerName;
        this.playerHeight = playerHeight;
    }

    void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }

    void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    void setPlayerHeight(double playerHeight){
        this.playerHeight = playerHeight;
    }

    int getJerseyNumber(){
        return jerseyNumber;
    }

    String getPlayerName(){
        return playerName;
    }

    double getPlayerHeight(){
        return playerHeight;
    }

    

    public String toString(){
        return "Name: " +  getPlayerName() + " Jersey Number: " + getJerseyNumber() + " Players Height: " + getPlayerHeight();
    }
}
