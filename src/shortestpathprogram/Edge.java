/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortestpathprogram;

/**
 *
 * @author Tony
 */
public class Edge {
    
  private Vertex target;
  private int weight;
  private Vertex source;
  
  public Edge(Vertex source, Vertex target, int weight) {
    this.source = source;
    this.target = target;
    this.weight = weight;
  }

    /**
     * @return the target
     */
    public Vertex getTarget() {
        return target;
    }

    /**
     * @param target the target to set
     */
    public void setTarget(Vertex target) {
        this.target = target;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the source
     */
    public Vertex getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(Vertex source) {
        this.source = source;
    }
    
    public String toString(){
        return source + " " + target;
    }
}
