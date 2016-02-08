package card;

import java.util.Arrays;
import java.util.Collections;

public class Deck
{
	static Card[] cards = new Card[52];

	int padlo;

	static
	{
		int i = 0;
		for (Suit suit : Suit.values())
		{
			for (Rank rank : Rank.values())
			{
				cards[i++] = new Card(suit, rank);
			}
		}
		Collections.shuffle(Arrays.asList(cards));
	}

	public Deck(int padlo)
	{
		this.padlo = padlo;
	}

	public static void main(String[] args)
	{
		Card[] frenchCards = Deck.cards;
		for (Card card : frenchCards)
		{
			System.out.println(card);
		}
		Collections.shuffle(Arrays.asList(cards));
		Collections.shuffle(Arrays.asList(cards));
		Collections.shuffle(Arrays.asList(cards));
	}
}