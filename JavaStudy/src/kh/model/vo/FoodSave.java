package kh.model.vo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FoodSave {
		Food food = new Food("사과", 20);// Food 객체 샘플 : "사과", 20


	 public void fileSave(String fileName) {
		 FileOutputStream fop = null;
	     ObjectOutputStream oos = null;
		 try {
			fop = new FileOutputStream(fileName);// 파일 객체와 연결하는 파일 출력스트림
			try {
				oos = new ObjectOutputStream(fop);//파일에 Food 객체를 기록할 수 있는 객체 출력스트림을 추가
				oos.writeObject(food);// 파일에 Food 객체 정보를 기록

			} catch (IOException e) {
				e.printStackTrace();
			}
			
		 } catch (FileNotFoundException e) {
			e.printStackTrace();
		 } finally {  //예외가 있더라도 닫기
			try {
				//3.사용이끝난 스트림 반납
				fop.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}}
	 }
	 

