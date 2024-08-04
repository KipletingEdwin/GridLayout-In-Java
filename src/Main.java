import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Layout Manager = Defines the natural layout for components withi a container
        //GridLayout = places components in a grid of cells
        //             Each component takes all the available space within its cell,
        //            and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JButton button1 = new JButton("1");
        frame.add(button1);



        frame.setVisible(true);

    }
}