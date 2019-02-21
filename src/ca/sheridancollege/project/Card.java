/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public abstract class Card 
{
      public enum UnoCardColors {RED, YELLOW,GREEN,BLUE};
       public enum UnoCardNumber{ZERO,ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP,REVERSE,DRAW_TWO,DRAW_FOUR,WILDCARD};
       
       //declaring field variables
        private final UnoCardColors card_colors ;
        //declaring field variables
        private final UnoCardNumber card_number;
    
//default modifier for child classes
    
 
        
        
        
        //arugument - contructor
        public Card(UnoCardColors color, UnoCardNumber number){
            
           card_colors=color;
           card_number = number;
        }
    
        
        
        
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
        //accessor method
        public UnoCardColors getUnoCardColors() {
        return card_colors;
    }

    /**
     * @return the card_number
     */
        //accessor method
    public UnoCardNumber getUnoCardNumber() {
        return card_number;
    }
        
    
    
   
    
    @Override
    public abstract String toString();

    /**
     * @return the card_colors
     */
      
    
        
    
}
