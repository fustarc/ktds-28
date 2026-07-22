package com.ktdsuniversity.edu.oop.exam.encapsulationexam;

public class Dish {
	private String name;
	private int fullnessIncrease;
	private int drunkennessDecrease;
	
	/**
	 * 음식 이름 및 포만감, 숙취해소기능 관련 생성자
	 * @param name 음식 이름
	 * @param fullnessIncrease 포만감
	 * @param drunkennessDecrease 취기 해소
	 */
	public Dish(String name, int fullnessIncrease, int drunkennessDecrease) {
		this.name = name;
		this.fullnessIncrease = fullnessIncrease;
		this.drunkennessDecrease = drunkennessDecrease;
		
	}
	
	public String getName() {
        return name;
    }

    public int getFullnessIncrease() {
        return fullnessIncrease;
    }

    public int getDrunkennessDecrease() {
        return drunkennessDecrease;
    }

}
