package com.app.pet;

public enum CategoryEnum {

	CAT(100), DOG(200), RABBIT(300), FISH(400);
	
	int pId;
	private CategoryEnum(int num) {
		this.pId = num;
	}
	
	public int getpetId() {
		return this.pId;
	}
}
