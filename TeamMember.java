//by Clayton

import java.io.Serializable;

//if this class should be an enum,
//do we need a list of the TeamMember names and titles?
public class TeamMember implements Serializable{

  private String name;
  private String title;

  public TeamMember(){}
//also, if this class should be an enum,
//then there shouldn't be any setter methods
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getTitle(){
    return title;
  }
  public void setTitle(String title){
    this.title = title;
  }
}
