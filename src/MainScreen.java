import GraphPainter.Board;
import GraphPainter.Painter;
import Graphs.Exceptions.InvalidEdgeException;
import Graphs.UndirectedGraph.UndirectedGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

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
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        build_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type_graph = graph_dropdown.getSelectedItem().toString();
                String type_edge = edge_dropdown.getSelectedItem().toString();
                int graph = graph_dropdown.getSelectedIndex();
                int edge = edge_dropdown.getSelectedIndex();

                String input = graph_input.getText().toString();
                Scanner scanner = new Scanner(input);
                int vertices = scanner.nextInt();
                int edges = scanner.nextInt();

                if (graph == 0) {
                    // undirected graph...
                    if (edge == 0) {
                        // non weighted edge...
                        UndirectedGraph g;

                        try {
                            g = new UndirectedGraph(vertices);
                            for (int i=0; i<edges; i++) {
                                g.addEdge(scanner.nextInt(), scanner.nextInt());
                            }
                        } catch (InvalidEdgeException ex) {
                            throw new RuntimeException(ex);
                        }

                        ArrayList<ArrayList<Integer>> list = g.getAdjList();
                        for (int i=0; i<list.size(); i++) {
                            for (int j=0; j<list.get(i).size(); j++) {
                                System.out.printf("(%d, %d)\n",i,list.get(i).get(j));
                            }
                        }

                        Painter p = new Painter(g,500,500);
                        Board b = new Board(p);
                        b.showGUI("Graph",new Dimension(p.getWidth()+200,p.getHeight()+200), null);

                    } else  {
                        // weighted edge...
                    }

                } else {
                    // directed graph...
                }
            }
        });
    }

    public static void main(String[] args) {
        MainScreen screen = new MainScreen();
    }
}
