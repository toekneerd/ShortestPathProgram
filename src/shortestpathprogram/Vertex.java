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
public class Vertex  {
    
  private String vertexName;
  private Edge[] adjacentVertices;
  private double minDistance = Double.POSITIVE_INFINITY;
  private Vertex previous;
  
  public Vertex(String vertexName) {
    this.vertexName = vertexName;
  }
  public String toString(){
      return getVertexName();
  }
  
  public int compareTo(Vertex other)
    {
        return Double.compare(getMinDistance(), other.getMinDistance());
    }

    /**
     * @return the vertexName
     */
    public String getVertexName() {
        return vertexName;
    }

    /**
     * @param vertexName the vertexName to set
     */
    public void setVertexName(String vertexName) {
        this.vertexName = vertexName;
    }

    /**
     * @return the adjacentVertices
     */
    public Edge[] getAdjacentVertices() {
        return adjacentVertices;
    }

    /**
     * @param adjacentVertices the adjacentVertices to set
     */
    public void setAdjacentVertices(Edge[] adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }

    /**
     * @return the minDistance
     */
    public double getMinDistance() {
        return minDistance;
    }

    /**
     * @param minDistance the minDistance to set
     */
    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    /**
     * @return the previous
     */
    public Vertex getPrevious() {
        return previous;
    }

    /**
     * @param previous the previous to set
     */
    public void setPrevious(Vertex previous) {
        this.previous = previous;
    }
}
