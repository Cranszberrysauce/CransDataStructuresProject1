
package cranslinkedstack2017;

import javax.swing.JFrame;
/******************************************************
***  CransLinkedStack2017
***  Nick Crans
******************************************************
*** Creates frame
***
******************************************************
*** 09/03/2017: Wrote code to create frame.
******************************************************/
public class CransLinkedStack2017 
{
    /**
     * @param args the command line arguments
     */
    /******************************************************
    ‘***  main
    ‘***  Nick Crans
    ‘******************************************************
    ‘*** Creates frame
    ‘*** 
    ‘******************************************************
    ‘*** 09/03/2017: wrote code to create frame.
    ‘******************************************************/
    public static void main(String[] args) 
    {
        GUI newGui = new GUI();
        newGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newGui.setSize(550, 350);
        newGui.setVisible(true);
    }
}
