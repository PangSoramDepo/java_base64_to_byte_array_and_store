//Need Imports
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public void saveImage(String base64){
	String imageString =base64;
	byte[] bytes = Base64.getDecoder().decode(imageString.getBytes());
	Path path = Paths.get("C:\\Users\\pangs\\Desktop\\test\\test.jpg");
	try {
		Files.write(path,bytes);
	}catch (Exception e) {
		
	}
}