package methods;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadText implements ReadTextINF {
	public ReadText(){

	}

	public String read(String file){
		String string = "";
		FileInputStream fileIn = null;
		DataInputStream dataIn = null;

		try{
			fileIn = new FileInputStream(file);
			dataIn = new DataInputStream(fileIn);
			string = dataIn.readUTF();

		}catch(FileNotFoundException e){
			System.out.println("file wasn't found");

		}catch(IOException e){
			e.printStackTrace();
		}

		return string;

	}
	public void write(String string, String file) {
		// TODO Auto-generated method stub
		try{
		FileOutputStream fileOut = new FileOutputStream(file);
		DataOutputStream dataOut = new DataOutputStream(fileOut);

		dataOut.writeUTF(string);
		dataOut.flush();
		dataOut.close();

		}catch(IOException e){
			e.printStackTrace();
		}
}

	public void createFile(String name) {
		// TODO Auto-generated method stub


	}
}
