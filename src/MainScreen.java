import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {
    private JPanel main_panel;
    private JTextArea graph_input;
    private JLabel input_label;
    private JLabel graph_input_label;
    private JComboBox graph_dropdown;
    private JLabel edge_input_label;
    private JComboBox edge_dropdown;
    private JButton build_button;

    private String[] graph_type =  {
            "UNDIRECTED GRAPH","DIRECTED GRAPH"
    };

    private String[] edge_type = {
            "NORMAL EDGE","WEIGHTED EDGE"
    };

    public MainScreen() {
        this.setContentPane(main_panel);
        this.setTitle("Graph Simulator");
        this.setSize(700,700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        build_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type_graph = graph_dropdown.getSelectedItem().toString();
                String type_edge = edge_dropdown.getSelectedItem().toString();
                JOptionPane.showMessageDialog(main_panel,"Graph type "+type_graph+" Edge type "+type_edge);
            }
        });
    }

    public static void main(String[] args) {
        MainScreen screen = new MainScreen();
    }
}
