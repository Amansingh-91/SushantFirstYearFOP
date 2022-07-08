import java.util.ArrayList;

public class TreeDemo {
    Node root;
    class Node{
        int data ;
        ArrayList<Node> children ;
        Node(int data){
            this.data = data;
            children =  new ArrayList<>();
        }
    }
    TreeDemo(int data){
        root = new Node(data);
    }
    public static void main(String[] args) {
        TreeDemo t = new TreeDemo(1);
        t.root.children.add(t.new Node(2));
        t.root.children.get(0).children.add(t.new Node(2));
    }
}
