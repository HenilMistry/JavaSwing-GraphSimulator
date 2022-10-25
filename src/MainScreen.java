import javax.swing.*;

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
      "DIRECTED GRAPH", "UNDIRECTED GRAPH"
    };

    private String[] edge_type = {
      "WEIGHTED EDGE","NORMAL EDGE"
    };

    public MainScreen() {
        graph_dropdown = new JComboBox(graph_type);
        edge_dropdown = new JComboBox(edge_type);
        this.add(graph_dropdown);
        this.add(edge_dropdown);
        this.setContentPane(main_panel);
        this.setTitle("Graph Simulator");
        this.setSize(700,700);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MainScreen screen = new MainScreen();
    }
}
