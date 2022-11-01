package GraphPainter;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    private Painter painter;
    public Board(Painter painter) {
        this.painter = painter;
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(painter.sheetWidth+200,painter.sheetHeight+200));
        this.add("Center",painter);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public void showGUI(String title, Dimension dimension, Component parent) {
        this.setTitle(title);
        this.setPreferredSize(dimension);
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }
}
