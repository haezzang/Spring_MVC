package kr.hs.study.dto;

public class DataBean {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private int avg;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		sum=kor+math+eng;
		return sum;
	}
	public void setSum(int sum) {
		this.sum =sum;
	}
	public int getAvg() {
		avg=sum/3;
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}

}
