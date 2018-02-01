
/* This bean will be for "Game" in the City of Aaron
/* Needs to have (from Model Layer PDF):
 * - theMap: theMap
 * - thePlayer: thePlayer
 * - cropData: cropData
 * - team[]: TeamMember
 * - animals: ArrayList<ListItem>
 * - tools: ArrayList<ListItem>
 * - provisions: ListItem
 * + Getters and Setters

 * IDK what to do about the Array List for animals and tools.  This looks
 * like they should go in to the same Array but how are they separated? I
 * tried to set up two different Array Lists, but even on the PDF it looks
 * like it's only one thing.  I would think then provisions is both animals
 * and tools. Perhaps not?

 * --Jacalyn Boggs */

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable{
//attributes
  private Map theMap;
  private Player thePlayer;
  private CropData cropData;
  private TeamMember[] team;
  //private ArrayList<animals> = new ArrayList<animals>();
  //private ArrayList<tools> = new ArrayList<tools>;
  private ArrayList<ListItem> animals;
  private ArrayList<ListItem> tools;
  private ArrayList<ListItem> provisions;
//constructor
  public Game(){}
//getters and setters
  public Map getTheMap(){
    return theMap;
  }
  public void setTheMap(Map theMap){
    this.theMap = theMap;
  }

  public Player getThePlayer(){
    return thePlayer;
  }
  public void setThePlayer(Player thePlayer){
    this.thePlayer = thePlayer;
  }

  public CropData getCropData(){
    return cropData;
  }
  public void setCropData(CropData cropData){
    this.cropData = cropData;
  }
//get set TeamMember here
  public ArrayList<ListItem> getAnimals(){
    return animals;
  }
  public void setAnimals(ArrayList<ListItem> animals){
    this.animals = animals;
  }

  public ArrayList<ListItem> getTools(){
    return tools;
  }
  public void setTools(ArrayList<ListItem> tools){
    this.tools = tools;
  }
  public ArrayList<ListItem> getProvisions(){
    return provisions;
  }
  public void setProvisions(ArrayList<ListItem> provisions){
    this.provisions = provisions;
  }
}
