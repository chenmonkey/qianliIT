package Liu;

import java.io.*;

public class FileUtils {

public static void listDirectory(File dir) throws IOException{
	if(!dir.exists()){
		throw new IllegalArgumentException("目录"+dir+"不存在");
	}
	if(!dir.isDirectory()){
		throw new IllegalArgumentException(dir+"不是目录");
	}
	//用字符串的形式返回目录下的java类型的所有文件
	/*
	String fileName[]=dir.list();
	for(String name:fileName){
		System.out.println(name);
	}
	*/
	//用File对象形式返回目录下的java类型的所有文件
	File file[]=dir.listFiles();
	if(file!=null&&file.length>0){
	for(File fname:file){
		if(fname.isDirectory()){//判断文件是否是一个目录
			//递归
			listDirectory(fname);
		}else{
			System.out.println(fname);
		}
	}
	}
}

}


