package com.ktdsuniversity.edu.oop.exam.encapsulationexam;

public class Alcohol {
	private String name;
	private int fullnessDecrease;
	private int drunkennessIncrease;
	
	/**
	 * 주류 생성자
	 * @param name 주류명
	 * @param fullnessDecrease 포만감 해소
	 * @param drunkennessIncrease 숙취 증가
	 */
	public Alcohol(String name, int fullnessDecrease, int drunkennessIncrease) {
		this.name = name;
		this.fullnessDecrease = fullnessDecrease;
		this.drunkennessIncrease = drunkennessIncrease;
	}
	
	public String getName() {
        return name;
    }
	
	public int getFullnessDecrease() {
		return fullnessDecrease;
	}

    public int getDrunkennessIncrease() {
        return drunkennessIncrease;
    }

	
}
