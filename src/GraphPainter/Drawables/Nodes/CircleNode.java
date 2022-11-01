package GraphPainter.Drawables.Nodes;

import java.awt.*;

public class CircleNode<Type> {

    protected static int DEFAULT_RADIUS = 20;
    protected static Color DEFAULT_COLOR = Color.ORANGE;
    public int x,y,radius;
    public Type identifier;
    public Color color;

    public CircleNode(int x, int y, int radius, Type identifier, Color c) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.identifier = identifier;
    }

    public CircleNode(int x, int y, int radius, Type identifier) {
        this(x,y,radius, (Type) " ", DEFAULT_COLOR);
    }

    public CircleNode(int x, int y, int radius) {
        this(x,y,radius,(Type) " ");
    }

    public CircleNode(int x, int y) {
        this(x,y,DEFAULT_RADIUS);
    }

    public void paintNode(Graphics g, Color color) {
        g.setColor(color);
        g.fillOval(this.x, this.y, this.radius, this.radius);
        g.drawString(this.identifier.toString(),this.x,this.y);
    }

    public void paintNode(Graphics g) {
        this.paintNode(g,this.color);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Type getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Type identifier) {
        this.identifier = identifier;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
