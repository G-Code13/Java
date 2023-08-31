import java.awt.*;
import javax.swing.JFrame;

public class NewShape extends JFrame{

    public NewShape(){
        setTitle("Second Shape");
        setSize(400, 300);
        setVisible (true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void paint (Graphics g){
        g.setColor(Color.red);
        g.drawRect(20, 30, 150, 250);
        g.fillRect(10, 15, 75, 125);
    }
}
