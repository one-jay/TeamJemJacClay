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
  
  TeamMember(String name, String title) {
  this.name = name;
  this.title = title;
  }

}
