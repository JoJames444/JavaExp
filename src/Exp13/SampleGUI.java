/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shail
 */
public class SampleGUI extends JFrame{
    
    JPanel myPanel;
    JButton myButton;
    public SampleGUI() {
        
        this.setTitle("Welcome");
        this.setSize(300, 300);
        this.setLocation(900, 500);
        //this.setBounds( 300, 300,900, 500);
        
        myButton =  new JButton("Click Me");
        myButton.setBounds(120, 90, 100, 30);
    
        myPanel = new JPanel();
        myPanel.setLayout(null);
        myPanel.add(myButton);
        this.add(myPanel);
        this.setVisible(true);
        
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Your Clicked", "Response", 1);
            }
        });
        
        
    }
    public static void main(String[] args) {
        new SampleGUI();
    }

  
    
}
