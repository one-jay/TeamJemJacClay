import java.io.Serializable;
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

public class Game implements Serializable{
  private theMap theMap;
  private thePlayer thePlayer;
  private cropData cropData;
  private team[] TeamMember;
  private ArrayList<animals> = new ArrayList<animals>();
  private ArrayList<tools> = new ArrayList<tools>;
}
