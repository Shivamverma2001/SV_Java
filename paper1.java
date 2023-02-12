import java.util.*;

class paper1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nU = sc.nextInt();
        int cP = sc.nextInt();
        while (nU > 0) {
            ArrayList<String> a = new ArrayList<>();
            for (int i = 0; i < cP; i++) {
                int random = (int) (Math.floor(Math.random() * (52)) + 1);
                String s = "";
                if (random >= 1 && random <= 13) {
                    if (random == 1)
                        s += "Ace of Spades";
                    else if (random == 11)
                        s += "Jack of Spades";
                    else if (random == 12)
                        s += "Queen of Spades";
                    else if (random == 13)
                        s += "King of Spades";
                    else
                        s += random + " of Spade";
                } else if ((random - 13) >= 1 && (random - 13) <= 13) {
                    if (random == 1)
                        s += "Ace of Hearts";
                    else if (random == 11)
                        s += "Jack of Hearts";
                    else if (random == 12)
                        s += "Queen of Hearts";
                    else if (random == 13)
                        s += "King of Hearts";
                    else {
                        random = random - 13;
                        s += random + " of Hearts";
                    }
                } else if ((random - 26) >= 1 && (random - 26) <= 13) {
                    if (random == 1)
                        s += "Ace of Diamonds";
                    else if (random == 11)
                        s += "Jack of Diamonds";
                    else if (random == 12)
                        s += "Queen of Diamonds";
                    else if (random == 13)
                        s += "King of Diamonds";
                    else {
                        random = random - 26;
                        s += random + " of Diamonds";
                    }
                } else if ((random - 39) >= 1 && (random - 39) <= 13) {
                    if (random == 1)
                        s += "Ace of Clubs";
                    else if (random == 11)
                        s += "Jack of Clubs";
                    else if (random == 12)
                        s += "Queen of Clubs";
                    else if (random == 13)
                        s += "King of Clubs";
                    else {
                        random = random - 39;
                        s += random + " of Clubs";
                    }
                }
                a.add(s);
            }
            System.out.println(a);
            nU--;
        }
    }
}
// 1 to 13 spade
// 14-26 hearts
// 27-39 diamond
// 40-52 clubs