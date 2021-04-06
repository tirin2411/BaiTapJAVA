package Lab3;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bai3 extends JFrame{
    private static final long serialVersionUID = 1L;
    public Bai3(String title)
    {
        setTitle(title);
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.PINK);
        JButton btn1 = new JButton("FlowLayout");
        JButton btn2 = new JButton("Add cac control");
        JButton btn3 = new JButton("Tren 1 dong");
        JButton btn4 = new JButton("Het cho chua");
        JButton btn5 = new JButton("Thi xuong dong");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con = getContentPane();
        con.add(pnFlow);
    }
    public static void main(String[] args) {
        Bai3 myUI = new Bai3("Demo FlowLayout");
        myUI.setSize(600,100);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }
}
