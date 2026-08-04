package com.ktdsuniversity.edu.oop.exam.statics;

/**
 * 사칙 연산기
 */
public class MathCalculator {

	
	/** 계산 하려는 첫번째 정수 */
	private int firstNumber;
	
	/** 계산 하려는 두번째 정수 */
	private int secondNumber;
	
	
	public MathCalculator(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		
	}
	
	/**
	 * 숫자 두개를 연산하여 반환한다
	 * @param operator 연산 종류
	 * @see com.ktdsuniversity.edu.oop.exam.statics.Operators 연산자 종류
	 * @return operator 의 값에 따른 결과를 반환
	 */
	public int getComputeResult(int operator) {
		
		if(operator == Operators.ADD) {
			return this.firstNumber + this.secondNumber;
		} else if (operator == Operators.SUB) {
			return this.firstNumber - this.secondNumber;
		} else if (operator == Operators.MUL) {
			return this.firstNumber * this.secondNumber;
		} else if (operator == Operators.DIV) {
			return this.firstNumber / this.secondNumber;
		} else if (operator == Operators.MOD) {
			return this.firstNumber % this.secondNumber;
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		MathCalculator math = new MathCalculator(10,2);
		System.out.println(math.getComputeResult(Operators.ADD)); // 더하기
		System.out.println(math.getComputeResult(Operators.SUB)); // 빼기
		System.out.println(math.getComputeResult(Operators.MUL)); // 곱하기
		System.out.println(math.getComputeResult(Operators.DIV)); // 나누기 몫
		System.out.println(math.getComputeResult(Operators.MOD)); // 나누기 나머지
	}
}
