/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management;

/**
 *
 * @author Ashish Bansal
 */
public class BankManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Loading3 l2=new Loading3();
        Login l=new Login();
        l2.setVisible(true);
        l2.bar.setStringPainted(true);
        try
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(30);
                l2.bar.setValue(i);
                l2.bar.setString(Integer.toString(i)+"%");
            }
        }
        catch(InterruptedException e)
        {
        }
        l2.dispose();
        l.show();
        }
    }
    

