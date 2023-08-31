public class ByTwo implements Series{
    
    int val;

    ByTwo(){
        val = 0;
    }

    @Override
    public int getNext() {
        val += 2;
        return val;
    }
    
}
