//by Clayton

import java.io.Serializable;
import java.util.ArrayList;

public enum TeamMember implements Serializable{

//members
Henry("Henry Jones", "Team Lead"),
Bill("Bill Smith", "GitHub expert"),
Ann("Ann Jackson", "Chief Coder");

//attributes
  private String name;
  private String title;
//constructor
  public TeamMember(){}
//no setter methods for enum
  public String getName(){
    return name;
  }
  public String getTitle(){
    return title;
  }

}
