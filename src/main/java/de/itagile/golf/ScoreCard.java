package de.itagile.golf;

public interface ScoreCard {

	void increaseScore();

	int score();

	void completeCurrentHole();

	int currentHole();

}