import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        JLabel label = new JLabel(); //create a label
        label.setText("Hi everyone! I am sahar zaker soltani."); //set text of label
        ImageIcon image = new ImageIcon("girl.jfif");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER , BOTTOM of imageicon
        label.setForeground(Color.RED); //set color of text
        label.setFont(new Font("MV Boli" , Font.PLAIN , 25)); //set font of text
        label.setIconTextGap(20); //set gap of text to image
        label.setBackground(Color.yellow); //set background color
        label.setOpaque(true); //display background color
        Border border = BorderFactory.createLineBorder(Color.RED, 8);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        //label.setBounds(100,100,250,250); //set x, y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setVisible(true); //make frame visible
        frame.setSize(500,500); //sets the x-dimension, and y-dimension of frame
        frame.setTitle("Diamond"); //sets title of frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(true); //prevent frame from being resized
        //frame.setLayout(null);
        frame.add(label);
        //frame.pack(); //adjust all options such as size


    }

    }
