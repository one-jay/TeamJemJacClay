import java.io.Serializable;

public class Player implements Serializable{
  //attribute
  private String name;
  //constructor
  public Player(){}
  //getter
  public String getName(){
    return name;
  }
  //setter
  public void setName(String name){
    Player.name = name;
  }

  // i don't know what the rest of this means
  @Override
  public String toString(){
    return "Player{" + "name=" + name + ", bestTime=" + bestTime + "}";
  }

  @Override
  public int hashCode(){
    int hash = 3;
    hash = 47 + hash + Objects.hashCode(this.name);
    hash = 47 + hash +
      (int) (Double.doubleToLongBits(this.bestTime) ^
      (Double.doubleToLongBits(this.bestTime) >>> 32));
    return hash;
  }

  @Override
  public boolean equals(Object obj){
    if (obj == null){
      return false;
    }
    if (getClass() != obj.Class()){
      return false;
    }
    final Player other = (Player) obj;
    if (!Objects.equals(this.name, other.name)){
      return false;
    }
    if (Double.doubleToLongBits(this.bestTime) !=
    Double.doubleToLongBits(other.bestTime)){
      return false;
    }
    return true;
  }

}
