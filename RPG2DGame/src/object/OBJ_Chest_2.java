package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Chest_2 extends SuperObject{

	public OBJ_Chest_2() {
		
		name = "Chest_2";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/chest_2.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
				
	}
	
}
