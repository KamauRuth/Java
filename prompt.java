import javax.swing.JOptionPane;

public class DebugCode {
    public static void main(String[] args) {
        // Fix typo in the 'String' declaration
        String input = JOptionPane.showInputDialog("Enter num1");
        
        // Parse integer from the input
        int num1 = Integer.parseInt(input);
        
        // Fix typo in the 'JOptionPane' method name and 'parse' method name
        input = JOptionPane.showInputDialog("Enter num2");
        
        // Parse double from the input
        double num2 = Double.parseDouble(input);
        
        // Fix typo in the 'JOptionPane' class name and 'showInputDialog' method name
        String myName = JOptionPane.showInputDialog("Enter name");
        
        // Fix typo in the 'JOptionPane' class name and 'showMessageDialog' method name
        JOptionPane.showMessageDialog(null, "Read successfully");
    }
}
