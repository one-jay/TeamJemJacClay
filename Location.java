import java.io.Serializable;

public class Location implements Serializable{
  //attribute
  private String description;
  private String symbol;
  //constructor
  public Location(){}
  //getter
  public String getDescription(){
    return description;
  }
  //setter
  public void setDescription(String description){
    this.description = description; 
  }
