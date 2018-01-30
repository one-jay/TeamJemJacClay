import java.io.Serializable;

public class Player implements Serializable{

  private string name;

  public Player(){}

  public string getName(){
    return name;
  }

  public void setName(string name){
    Player.name = name;
  }

}
