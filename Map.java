import java.io.Serializable;

public class Map implements Serializable{
  //attributes
  private int rowCount;
  private int colCount;
  //private locations[][]Location //need help here

  //constructor
  public Map(){}

  //getters and setters
  public int getRowCount(){
    return rowCount;
  }
  public void setRowCount(int rowCount){
    this.rowCount = rowCount;
  }

  public int getColCount(){
    return colCount;
  }
  public void setColCount(int colCount){
    this.colCount = colCount;
  }

  //how to do methods for double array?
}
