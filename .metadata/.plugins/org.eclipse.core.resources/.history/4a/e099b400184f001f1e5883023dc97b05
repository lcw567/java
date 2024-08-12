package test240731.object1;

import java.util.ArrayList;
import java.util.HashMap;

//Controller : 사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역할
public class FarmController {
	HashMap<Farm, Integer> hMap;
	ArrayList<Farm> list;
	
	public FarmController() {
		super();
		this.hMap = new HashMap<>();
		this.list = new ArrayList<>();
	}
	
	public boolean addNewKind(Farm f, int amount) {
		if(hMap.containsKey(f)) { // f라는 키로 데이터가 존재한다면 -> 추가불가
			return false;
		} else { // 추가가능
			hMap.put(f, amount);
			return true;
		}
	}
	
	public boolean removeKind(Farm f) { //f라는 키로 데이터가 존재한다면 -> 삭제가능
		if(hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		}
		
		return false;
	}
	
	public boolean changeAmount(Farm f, int amount) {
		if(hMap.containsKey(f)) {
			hMap.replace(f, amount);
			return true;
		} 
		
		return false;
	}
	
	public HashMap<Farm, Integer> printFarm(){
		return this.hMap;
	}
	
	public boolean buyFarm(Farm f){
		return false;
	}
	
	public boolean removeFarm(Farm f) {
		return false;
	}
	
	public ArrayList<Farm> printBuyFarm(){
		return null;
	}
}
