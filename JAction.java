// exercise on pages 723 - 724

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JAction extends JFrame implements ActionListener
{
  // instance variables for this class
  JLabel label = new JLabel("This frame has many components!");
  JLabel label2 = new JLabel("Enter your name: ");
  JTextField field = new JTextField(12);
  JButton button = new JButton("Click to continue");

  // new constructor for this class
  public JAction()
  {
    // use the constructor from the JFrame parent class
    super("Frame With Components to Action");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    button.setToolTipText("Hey, click on this!");
    add(label);
    add(label2);
    add(field);
    add(button);
    button.addActionListener(this);
    field.addActionListener(this);
  }

  // event handling method
  @Override
  public void actionPerformed(ActionEvent e)
  {
    // create an Object variable to store the event data's source
    Object source = e.getSource();
    // determine if the button is the source of the event data
    if(source == button)
    {
      label2.setText("You clicked the button");
      button.setEnabled(false);
    }
    else
    {
      label2.setText("You pressed Enter!");
      button.setEnabled(true);
    }
  }

  public static void main(String[] args)
  {
    JAction aFrame = new JAction();
    aFrame.setSize(250, 150);
    aFrame.setVisible(true);
  }
}
