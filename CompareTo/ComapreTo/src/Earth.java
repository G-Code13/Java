public class Earth implements Comparable<Earth>{

    private String s1 = "Hell";
    // private String s2 = "Hell";
    private String s2 = "On";
    private String s3 = "Earth";

    public Earth(){

    }

    void setS1(String s1){
        this.s1 = s1;
    }

    public String getS1(){
        return s1;
    }

    void setS2(String s2){
        this.s2 = s2;
    }

    public String getS2(){
        return s2;
    }

    void setS3(String s3){
        this.s3 = s3;
    }
    
    public String getS3(){
        return s3;
    }

    @Override
    public int compareTo(Earth o) {
        if(this.s1.compareToIgnoreCase(o.s2) == 0){
            return 0;
        }
        else if(this.s1.compareToIgnoreCase(o.s2) < 0){
            return -1;
        }
        else{
            return 1;
        }
    }
}
