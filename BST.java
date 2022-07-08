public class BST {
    Node root;
    class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
        
    }
    public void insert(int data){
            root = insertRec(root,data);
    }
    public Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
        }
        else if(root.data > data){
            root.left =  insertRec(root.left, data);
        }
        else{
            root.right =  insertRec(root.right, data);
        }
        return root;
    }
    public void inorder(Node root){
        if(root ==  null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public Node search(Node root,int key){
        if(root ==  null || root.data == key){
            return root;
        }
        else{
            if(root.data > key){
                return search(root.left, key);
            }
            else{
                return search(root.right, key);
            }
            
        }
    }
    public void deleteNode(int key){
        root =  deleteRec( root, key);
    }
    public Node deleteRec(Node root, int key){
        if(root == null){
            return root;
        }
        else if(root.data > key){
           root.left= deleteRec(root.left, key);
        }
        else if(root.data < key){
           root.right= deleteRec(root.right, key);
        }
        else{
            if(root.left ==  null){
                return root.right;
            }
            else if( root.right == null ){
                return root.left;
            }
            else{
                root.data = this.successorNode(root.right);
                root.right= deleteRec(root.right, root.data);
            }
            
        }
        return root;
    } 
    public int successorNode(Node root){
        int min =  root.data;
        Node temp = root;
        while(temp.left != null){
            min = temp.data;
            temp = temp.left;
        }
        return min;
    }
    
    public static void main(String[] args) {
        BST tree1 = new BST();
        tree1.insert(3);
        tree1.insert(2);
        tree1.insert(1);
        tree1.insert(5);
        tree1.insert(4);
        tree1.insert(6);
        tree1.deleteNode(5);

        tree1.inorder(tree1.root); 
        if(tree1.search(tree1.root, 7 ) != null){
            System.out.println("element found");

        }
        else{
            System.out.println("element not present");
        }
    }
}
