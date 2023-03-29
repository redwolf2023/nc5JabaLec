package chap13_objectarray;

import chap13_objectarray.clazz.Lectrue;

public class _01_objectArray {

	public static void main(String[] args) {

		//객체배열의 초기화
		Lectrue[] lecArr = new Lectrue[3];
		//객체배열의 초기화
		lecArr[0] = new Lectrue("자바", 30 , 50);
		lecArr[1] = new Lectrue("c언어", 29 , 45);
		lecArr[2] = new Lectrue("파이썬", 45 , 60);
		//객체배열의 사용
		for(int i = 0; i <lecArr.length; i++) {
			lecArr[i].proceedLecture();
		}
	}

}
