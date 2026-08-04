package com.ktdsuniversity.edu.oop.exam;

public class Student {
	
	private int java;
	private int python;
	private int cpp;
	private int csharp;
	
	/**
	 * 각 성적의 파라미터 할당
	 * @param java 자바 성적 파라미터
	 * @param python 파이썬 성적 파라미터
	 * @param cpp C++ 성적 파라미터
	 * @param csharp C# 성적 파라미터
	 */
	
	public Student(int java, int python, int cpp, int csharp) {
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.csharp = csharp;
	}
	
	public Student() {
		/*
		this.java = 100;
		this.python = 100;
		this.cpp = 100;
		this.csharp = 100;
		*/
		//생성자 내부에선 다른 생성자의 호출이 가능하다.
		//호출방법: this();
		
		this(100, 100, 100, 100);
	}
	
	private int getSumAllScores() {
		return java + python + cpp + csharp;
	}
	
	public double getAverage(int sum) {
		return sum /4.0;
	}
	
	public double getCourseCredit(double credit) {
		if (credit < 55) {
			return 0.1;
		}
		return (credit - 55)/10.0;
	}
	
	public String getABCDF(double score) {
		if (score >= 4.1) {
			return "A+";
		}
		else if (score >= 3.6) {
			return "A";
		}
		else if (score >= 3.1) {
			return "B+";
		}
		else if (score >= 2.6) {
			return "B";
		}
		else if (score >= 1.6) {
			return "C";
		}
		else if (score >= 0.6) {
			return "D";
		}
		else {
			return "F";
		}
	}
	
	public static void main(String[] args) {
		Student kim = new Student(100, 90, 80, 70);
		Student student = new Student();
		
		/*
		student.java = 100;
		student.python = 90;
		student.cpp = 57;
		student.csharp = 77;
		*/
		
		int sum = student.getSumAllScores();
		double average = student.getAverage(sum);
		double credit = student.getCourseCredit(average);
		String abcdf = student.getABCDF(credit);
		
		System.out.println("합계 점수: " + sum);
		System.out.println("평균 점수: " + average);
		System.out.println("평균 학점: " + credit);
		System.out.println("총학점: " + abcdf);
		
		
	}
}
