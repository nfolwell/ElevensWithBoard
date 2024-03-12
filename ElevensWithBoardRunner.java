import java.util.*;

public class ElevensWithBoardRunner
{
    public static void  main(String[] args)
    {
        ElevensBoard board = new ElevensBoard();
        //board.newGame();
        System.out.println("Welcome to Elevens!");
        System.out.println(board.deckSize()+" undealt cards remaining!");
        while (!board.gameIsWon())
        {
            System.out.println("Here's your cards: ");
            System.out.println(board);
            Scanner in = new Scanner(System.in);
            int size = 0;
            String[] inAr=null;
            while ((size!=3)&&(size!=2))
            {
                System.out.print("Enter two or three cards to remove: ");
                inAr =  in.nextLine().split(" ");
                size = inAr.length;
            }
            List<Integer> indList = new ArrayList<Integer>();
            System.out.print("You chose:");
            for (String val: inAr) {
                System.out.print(" "+board.cardAt(Integer.valueOf(val)-1));
                indList.add(Integer.valueOf(val)-1);
            }
            System.out.println();
            if (board.isLegal(indList)) {
            board.replaceSelectedCards(indList);
            System.out.println(board.deckSize()+" undealt cards remaining!");
            }
            if (!board.anotherPlayIsPossible()&&!board.gameIsWon())
            {
                System.out.println("Dang!  No play is possible!  Try again!");
                break;
            }
        }
        if (board.gameIsWon())
           System.out.println("You won!");
        

    }
}
