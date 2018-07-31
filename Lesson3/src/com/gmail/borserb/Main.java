package com.gmail.borserb;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		double a;
		for (;;) {
			try {
				a = Double.valueOf(JOptionPane.showInputDialog("Input doublenumber"));
				if (a < 0) {
					throw new NegativeValueException();
				}
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				JOptionPane.showInputDialog(null, "cancel");
				a = 0;
				break;
			} catch (NegativeValueException e) {
				JOptionPane.showInputDialog(null, e.getMessage());

			}
		}
		System.out.println(a);
	}

}
