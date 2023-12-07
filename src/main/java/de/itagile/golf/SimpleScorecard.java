package de.itagile.golf;

public class SimpleScorecard implements Scorecard {

	private int currentHole = 1;
	private int hitCount;

	public void increaseHitCount() {
		hitCount++;
	}

	public void finishHole() {
		currentHole++;
	}

	public int hitCount() {
		return hitCount;
	}

	public int currentHole() {
		return currentHole;
	}
}
