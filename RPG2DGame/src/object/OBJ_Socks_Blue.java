package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Socks_Blue extends SuperObject{
	
	public OBJ_Socks_Blue() {
		
		name = "Socks_Blue";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/socks_blue.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
				
	}
	
}
