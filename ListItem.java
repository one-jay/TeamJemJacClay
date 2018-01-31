//by Clayton

import java.io.Serializable;

//if this class should be an enum,
//do we need a list of the TeamMember names and titles?
public class ListItem implements Serializable{

  private String name;
  private int number;

  public ListItem(){}
//also, if this class should be an enum,
//then there shouldn't be any setter methods
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getNumber(){
    return number;
  }
  public void setNumber(int number){
    this.number = number;
  }
}
