# Introduction:
Below is an example of the Elevens game play.  The code in this repository can get you started.  I'll have a video of what I did to get it working a little later.  You have to do some work on the ElevensBoard class.  
# Exploration:
The solitaire game of Elevens uses a deck of 52 cards, with ranks A (ace), 2, 3, 4, 5, 6, 7, 8, 9, 10, J (jack), 
Q (queen), and K (king), and suits ♣ (clubs), ♦ (diamonds), ♥ (hearts), and ♠ (spades). Here is how it 
is played.
1. The deck is shuffled, and nine cards are dealt “face up” from the deck to the board.
2. Then the following sequence of steps is repeated:
   
   a. The player removes each pair of cards (A, 2, … , 10) that total 11, e.g., an 8 and a 3, or a 10 
and an A. An ace is worth 1, and suits are ignored when determining cards to remove.

    b. Any triplet consisting of a J, a Q, and a K is also removed by the player. Suits are also ignored 
when determining which cards to remove.

    c. Cards are dealt from the deck if possible to replace the cards just removed.
The game is won when the deck is empty and no cards remain on the table. Here’s a sample game, in 
which underlined cards are replacements from the deck.

 # Cards on the Table with Explanation 

K♠ 10♦ J♣ 2♣ 2♥ 9♦ 3♥ 5♠ 5♦  initial deal 

K♠ 10♦ J♣ 7♦ 2♥ Q♠ 3♥ 5♠ 5♦ remove 2♣ (either 2 would work) and 9♦

A♠ 10♦ 9♣ 7♦ 2♥ 7♣ 3♥ 5♠ 5♦ remove J♣ Q♠ K♠

A♠ 10♦ 10♠ 7♦ 3♣ 7♣ 3♥ 5♠ 5♦ remove 9♣ and 2♥ (removing A♠ and 10♦ would 
have been legal here too)

2♠ 10♦ 9♠ 7♦ 3♣ 7♣ 3♥ 5♠ 5♦ remove A♠ and 10♠ (10♦ could have been removed 
instead)

A♣ 10♦ K♦ 7♦ 3♣ 7♣ 3♥ 5♠ 5♦ remove 2♠ and 9♠

6♦ K♣ K♦ 7♦ 3♣ 7♣ 3♥ 5♠ 5♦ remove A♣ and 10♦

2♦ K♣ K♦ 7♦ 3♣ 7♣ 3♥ 5♠ Q♦ remove 6♦ and one of the 5s; no further plays are 
possible; game is lost.




