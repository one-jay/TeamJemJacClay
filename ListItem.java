//by Clayton

import java.io.Serializable;

public class ListItem implements Serializable{

  private String name;
  private int number;

  public ListItem(){}

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
  //Putting toString() here?? -- Jem
@Override
public String toString() {
    return "ListItem{" + "name=" + name + ",number=" + number + '}';
}
}
