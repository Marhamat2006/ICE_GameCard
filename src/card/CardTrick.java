/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @Marhamat Abed - #991785934
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Card[] magicHand = new Card[7];
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1); //random 1 to 13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); //0-3=random suit
            magicHand[i] = c;  // store card c inside the magicHand array
            System.out.println(c.getSuit()+ " " + c.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Enter a card value (1-13): ");
        int valueInput = input.nextInt(); //user value get stored in valueInput
        
        System.out.print("Enter a suit (0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades):");
        int indexSuit = input.nextInt(); //user value gets stored in variable indexSuit
        String userSuit = Card.SUITS[indexSuit];

        
        boolean cardInHand = false;
        for (int i=0; i<magicHand.length; i++){
            if (magicHand[i].getValue() == valueInput && 
                magicHand[i].getSuit().equals(userSuit)){
                cardInHand = true;
                break;
            }
        }
        
        //Then report the result here
        if (cardInHand){
            System.out.println("Congrats! Your card is in magic hand YAY!");
        } else { 
            System.out.println("Sorry, you card is not in the magic hand.");
        }
        
        // add one luckcard hard code 2,clubs
         if (valueInput == 2 && userSuit.equals("Diamonds")){
             System.out.println("You have found the lucky cards (2 of Diamonds) ");
  
    }  

    }
    
}
