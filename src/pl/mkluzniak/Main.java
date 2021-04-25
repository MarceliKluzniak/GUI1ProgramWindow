package pl.mkluzniak;

import javax.swing.JOptionPane;  //package for JOPanel to be add



public class Main {

    public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Enter your name"); //first window asking to input your name
	JOptionPane.showMessageDialog(null, "Hello " + name); //program print on window inputed name and printing hello

	int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); //inputing age, for this option you gave to declate int and add "Integer.parseInt" than you can use JOPanel
	JOptionPane.showMessageDialog(null, "You are " + age + " years old"); //program is printing your age

	double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height")); //for height is used double function, and the same as line up you have to declare double and add "Double.parseDouble" to use JOPanel
	JOptionPane.showMessageDialog(null, "You are " + height + "  cm height"); //program is printing how height you are

        JOptionPane.showMessageDialog(null, "Bye!"); //at the end there is Bye info

    }
}
