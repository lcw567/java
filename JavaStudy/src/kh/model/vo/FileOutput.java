package kh.model.vo;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutput {
public void output() {
    FileWriter fw = null;
    try {
        fw = new FileWriter("test.txt",true);
        fw.write(97);
        fw.write(65);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }catch (IOException e) {
        e.printStackTrace();
    
    }finally {
    	try {
    		fw.close();
    		} catch (IOException e) {
    			e.printStackTrace();
    			}
    	}
    }
}
