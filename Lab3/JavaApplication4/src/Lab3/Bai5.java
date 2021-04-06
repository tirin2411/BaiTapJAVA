package Lab3;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai5 extends JFrame{
    public Bai5(String title)
    {
        setTitle(title);
        JPanel pnBorder = new JPanel();
            pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        pnNorth.setBackground(Color.red);
            pnBorder.add(pnNorth,BorderLayout.NORTH);
        JPanel pnSouth = new JPanel();
        pnSouth.setBackground(Color.red);
            pnBorder.add(pnSouth,BorderLayout.SOUTH);
        JPanel pnWest = new JPanel();
        pnWest.setBackground(Color.BLUE);
            pnBorder.add(pnWest,BorderLayout.WEST);
        JPanel pnEast = new JPanel();
        pnEast.setBackground(Color.BLUE);
            pnBorder.add(pnEast,BorderLayout.EAST);
        JPanel pnCenter = new JPanel();
        pnCenter.setBackground(Color.YELLOW);
            pnBorder.add(pnCenter,BorderLayout.CENTER);
        getContentPane().add(pnBorder);
    }
    public static void main(String[] args) {
        Bai5 myUI = new Bai5("BorderLayout");
        myUI.setSize(300,200);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        //cho phep cua so hien thi
        myUI.setVisible(true);
    }
}
