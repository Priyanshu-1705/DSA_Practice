package A2Z_Sheet.Step15.Lec1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        vis[0] = true;
        while (!queue.isEmpty()){
            Integer node = queue.poll();
            res.add(node);
            for (Integer i: adj.get(node)){
                if (vis[i] == false){
                    vis[i] = true;
                    queue.add(i);
                }
            }
        }
        return res;
    }
}
