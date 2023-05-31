/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Omkishan Pachchigar ID: 991648752.
 */


import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        // Hard-coded luckyCard
        Card luckyCard = new Card();
        luckyCard.setValue(10);  // Set the card number of your choice
        luckyCard.setSuit("Spades");  // Set the suit of your choice
        
        magicHand[6] = luckyCard;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int value = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the suit of your card (Hearts/Spades/Clubs/Diamonds): ");
        String suit = scanner.nextLine();
        
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        boolean found = false;
        for(Card card : magicHand) 
        {
            if (card.equals(userCard)) 
            {
                found = true;
                break;
            }
        }
        
        if(found) 
        {
            System.out.println("Congratulations! Your selected card is in the magic hand.");
        } 
        else 
        {
            System.out.println("Sorry! Your selected card is not in the magic hand.");
        }
    }
}
