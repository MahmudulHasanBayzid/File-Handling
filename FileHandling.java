import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileHandling {
	public static void main(String args[]) {
		try {
			FileReader file = new FileReader("E:\\Users\\Doc\\Text.txt");
			String fileData="",replaceFileData="";
			int i;
			//read file
			while((i = file.read())!=-1) {
				fileData += (char)i;
			}
			
			//replace string
			replaceFileData = fileData.replaceAll("Friday", "Sunday");
			FileWriter writeFile = new FileWriter("E:\\Users\\Doc\\WriteText.txt");
			//write file
			writeFile.write(replaceFileData);
			file.close();
			writeFile.close();
			
			
			 File createFile = new File("E:\\Users\\Doc\\CreateText.txt");
			  
			 //create file 
			 if(createFile.createNewFile()) System.out.println("file created"); 
			 else System.out.println("problem while creating file");
			  
			 //delete file 
			 File deleteFile = new File("E:\\Users\\Doc\\CreateText.txt");
			 if(deleteFile.delete()) System.out.println("file deleted"); 
			 else System.out.println("failed to delete file");
			  
			 File originalFile = new File("E:\\Users\\Doc\\WriteText.txt"); File
			 renameFile = new File("E:\\Users\\Doc\\RenameWriteText.txt");
			  
			 //rename file 
			 if(originalFile.renameTo(renameFile))System.out.println("file renamed"); 
			 else System.out.println("failed to rename file");
			  
			 File mainFile = new File("E:\\Users\\Doc\\Text.txt"); File copyFile = new
			 File("E:\\Users\\Doc\\copyFile.txt");
			  
			 //copy file 
			 Files.copy(mainFile.toPath(), copyFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
			  
			 File originFile = new File("E:\\Users\\Doc\\Text.txt"); File moveFile = new
			 File("E:\\Users\\Doc\\doc\\Text.txt"); 
			 //move file
			 Files.move(originFile.toPath(),moveFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
			 
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
