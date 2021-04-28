import javax.swing.JOptionPane; 
public class LoanCalculator {
		
	public static void main(String[] args) {
		double loan = Double.parseDouble(JOptionPane.showInputDialog(null, "Input loan amount: "));
		double apr = Double.parseDouble(JOptionPane.showInputDialog(null, "Input interest rate: "));
		double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Input number of payments: ")); 
		JOptionPane.showMessageDialog(null, payment(loan,apr,num));
	}
	
	public static String payment(double loan, double apr, double num) {
		double payment= loan * (apr/1200.0) * Math.pow((1.0 + apr/1200.0), num) / (Math.pow((1.0 + apr/1200.0), num) - 1.0);
		String message = String.format("Your total is: $%,.2f", payment); 
		return message;
	}
} // LoanCalculator

