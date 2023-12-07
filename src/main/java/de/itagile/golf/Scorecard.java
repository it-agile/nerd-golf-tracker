package de.itagile.golf;

public interface Scorecard {

	void increaseHitCount();

	int hitCount();

	void finishHole();

	int currentHole();

}