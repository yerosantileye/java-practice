

 /**
 @version 1.02 2017-12-14
 @author Cay Horstmann
 */

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;
public class Timertest{
  public static void main(String[] args){
    ActionListener listener = event -> System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
     Toolkit.getDefaultToolkit().beep();
    // construct a timer that calls the listener once every
    var timer = new Timer(1000, System.out::println);
    timer.start();

 // keep program running until the user selects "OK"
 JOptionPane.showMessageDialog(null, "Quit program?");
 System.exit(0);
 }
}

 class TimePrinter implements ActionListener
 {
 public void actionPerformed(ActionEvent event)
{
System.out.println("At the tone, the time is " +
Instant.ofEpochMilli(event.getWhen()));
 Toolkit.getDefaultToolkit().beep();
 }
 }
