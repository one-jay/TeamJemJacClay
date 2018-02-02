//by Clayton

import java.io.Serializable;
import java.util.ArrayList;

public enum TeamMember implements Serializable{

//members
Clayton("Clayton Thomas", "Master of Duct Tape"),
Jemifer("Jemifer Judilla", "International Superstar"),
Jacalyn("Jacalyn Boggs", "Bringer of Chocolate");

//attributes
  private String name;
  private String title;

  TeamMember(String name, String title) {
  this.name = name;
  this.title = title;
  }

}
