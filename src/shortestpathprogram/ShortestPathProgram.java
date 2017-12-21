/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortestpathprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.lang.Object;

/**
 *
 * @author Tony
 */
//==============================================================
	// Shortest Path Program
	//==============================================================
	// Anthony DeCarlo
	// COSC 336.001
	// 05/04/2016
	//--------------------------------------------------------------

public class ShortestPathProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vertex v1 = new Vertex("1") {};
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");
        Vertex v7 = new Vertex("7");
        
        
        v1.setAdjacentVertices(new Edge[]{new Edge(v1,v2, 5), new Edge(v1,v3, 8), new Edge(v1,v5, 7), new Edge(v1,v6, 10)});
        v2.setAdjacentVertices(new Edge[]{new Edge(v2,v3, 1), new Edge(v2,v5, 3)});
        v3.setAdjacentVertices(new Edge[]{new Edge(v3,v4, 6)});
        v4.setAdjacentVertices(new Edge[]{});
        v5.setAdjacentVertices(new Edge[]{new Edge(v5,v4, 4), new Edge(v5,v6, 2), new Edge(v5,v7, 7)});
        v6.setAdjacentVertices(new Edge[]{new Edge(v6,v7, 3)});
        v7.setAdjacentVertices(new Edge[]{new Edge(v7,v3, 4), new Edge(v7,v4, 5)});
        
        Vertex[] graph = {v1, v2, v3, v4, v5, v6, v7};
        for(int i=0;i<graph.length; i++){
            for(int j=0; j<graph[i].getAdjacentVertices().length;j++)
                System.out.println(graph[i].getVertexName()+"->"+graph[i].getAdjacentVertices()[j].getTarget().getVertexName()+" distance = "+graph[i].getAdjacentVertices()[j].getWeight());
             }
        System.out.println("");
        System.out.println("Dijkstra's Algorithm");
        int[][] DijkstraMatrix = new int[][]{{0, 5, 8, 0, 7,10, 0},
                                             {0, 0, 1, 0, 3, 0, 0},
                                             {0, 0, 0, 6, 0, 0, 0},
                                             {0, 0, 0, 0, 0, 0, 0},
                                             {0, 0, 0, 4, 0, 2, 7},
                                             {0, 0, 0, 0, 0, 0, 3},
                                             {0, 0, 4, 5, 0, 0, 0}};
        Dijkstra d = new Dijkstra();
        d.dijkstra(DijkstraMatrix, 0);

                
        int V = 7, E = 14, source = 0;
        Graph g = new Graph(V,E);
        g.edge[0].src=0;g.edge[0].dest=1;g.edge[0].weight=5;
        g.edge[1].src=1;g.edge[1].dest=2;g.edge[1].weight=-2;
        g.edge[2].src=2;g.edge[2].dest=3;g.edge[2].weight=6;
        g.edge[4].src=0;g.edge[4].dest=4;g.edge[4].weight=7;
        g.edge[5].src=0;g.edge[5].dest=2;g.edge[5].weight=8;
        g.edge[6].src=0;g.edge[6].dest=5;g.edge[6].weight=10;
        g.edge[7].src=1;g.edge[7].dest=4;g.edge[7].weight=-2;
        g.edge[8].src=4;g.edge[8].dest=5;g.edge[8].weight=2;
        g.edge[9].src=4;g.edge[9].dest=3;g.edge[9].weight=4;
        g.edge[10].src=4;g.edge[10].dest=6;g.edge[10].weight=7;
        g.edge[11].src=5;g.edge[11].dest=6;g.edge[11].weight=-2;
        g.edge[12].src=6;g.edge[12].dest=3;g.edge[12].weight=5;
        g.edge[13].src=6;g.edge[13].dest=2;g.edge[13].weight=4;
        System.out.println("");
        System.out.println("Bellman Ford Algorithm");
        g.BellmanFord(g, source);
                
        
    }
    
      
        
}
