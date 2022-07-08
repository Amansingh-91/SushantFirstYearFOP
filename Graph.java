import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int V;
    LinkedList<Integer> adj[];
    Graph(int v){
        V = v;
       adj = new LinkedList[v];
        for(int i =0; i<v;i++){
            adj[i]= new LinkedList<>();
        }

    }
    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
    }
    public void DFS(int root){
        boolean visited[] = new boolean[V];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        
            DFSUntil(root,visited);
        
    }
    public void DFSUntil(int root, boolean visited[]){
        visited[root] = true;
        System.out.print(root+" ");
        for (Integer i : adj[root]) {
            if(!visited[i]){

                DFSUntil(i, visited);
            }
        }
    }
    public void BFS(int root){
        boolean visited[] = new boolean[V];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(root);
        while(!myQueue.isEmpty()){
            visited[myQueue.peek()]= true;
            int print= myQueue.poll();
            System.out.print(print+" ");
            for (Integer i : adj[print]) {
                if(!visited[i]){
                    myQueue.add(i);
                    visited[i] = true;
                }
            }
            
                
            
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(2, 1);
        g.addEdge(3, 1);
        g.addEdge(2, 3);
        g.addEdge(2, 0);
        g.BFS(0);
        System.out.println();
        g.DFS(3);
    }
}
