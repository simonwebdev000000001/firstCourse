package com.midgarb.day7.gameOfTank.util;

public class Field {
	private Eagle e = new Eagle();
	private Rock r = new Rock();
	private Brick b = new Brick();
	private Water w = new Water();
	private Clean c = new Clean();
	private   Pole[][] battleField = { { b, b, b, b, b, b, b, b, b },
			{ c, c, c, c, c, c, c, c, c }, { b, c, b, c, c, c, b, c, b },
			{ c, c, b, c, b, c, b, c, c }, { c, b, w, w, w, w, w, b, c },
			{ c, b, w, b, w, b, w, b, c }, { c, b, w, w, w, w, w, b, c },
			{ c, b, c, r, r, r, c, b, c }, { c, c, c, r, e, r, c, c, c }

	};

	private int BF_WIDTH = 590;
	private int BF_HEIGHT = 576;

	public Field() {
	}

	public Field(Pole[][] battleField) {
		this.battleField = battleField;
		
	}

	public Pole scanQuadrant(int i, int b) {
		return battleField[i][b];
	}

	public void upadateQuadrant(int x, int y, Pole object) {
		battleField[x][y] = object;

	}

	public int getBF_WIDTH() {
		return BF_WIDTH;
	}

	public int getBF_HEIGHT() {
		return BF_HEIGHT;
	}

	public int getDimentionX() {
		return battleField.length;
	}

	public int getDimentionY() {
		return battleField.length;
	}
}

