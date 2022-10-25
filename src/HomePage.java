import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {
    private JPanel main_panel;
    private JLabel name;
    private JTextField txtField_name;
    private JButton button_click;

    public HomePage() {
        button_click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(button_click,"Hello "+txtField_name.getText().toString());
            }
        });
    }

    public static void main(String[] args) {
        HomePage page = new HomePage();
        page.setContentPane(page.main_panel);
        page.setTitle("Home Page");
        page.setSize(300,300);
        page.setResizable(false);
        page.setVisible(true);
        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
