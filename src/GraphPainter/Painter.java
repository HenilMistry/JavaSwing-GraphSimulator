package GraphPainter;

import GraphPainter.Drawables.Nodes.CircleNode;
import Graphs.UndirectedGraph.UndirectedGraph;

import java.awt.*;

/**
 * <p>
 *     This class will help you to get your graph painted on to the screen.
 * </p>
 *
 * @since 2022-10-28
 * @author HENIL
 * @version 1.0
 * */
public class Painter extends Canvas {

    protected static int DEFAULT_WIDTH = 500;
    protected static int DEFAULT_HEIGHT = 700;
    protected int sheetWidth,sheetHeight;
    CircleNode[] nodes;

    public Painter(UndirectedGraph UDgraph, int sheetWidth, int sheetHeight) {
        this.nodes = new CircleNode[UDgraph.vertices];
        this.sheetWidth = sheetWidth;
        this.sheetHeight = sheetHeight;
    }

    public Painter(UndirectedGraph UDgraph) {
        this(UDgraph,DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }

    public void prepare() {
        this.prepareVertices();
    }

    private void prepareVertices() {
        for (int i=0; i<this.nodes.length; i++) {
            this.nodes[i] = new CircleNode((int)(Math.random()*this.sheetWidth), (int)(Math.random()*this.sheetHeight));
            System.out.println(this.nodes[i].x+" "+this.nodes[i].y);
        }
        System.out.println("---------------------------------------------------------------------");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.prepare();
        for (int i=0; i<this.nodes.length; i++) {
            nodes[i].paintNode(g);
        }
    }

}
