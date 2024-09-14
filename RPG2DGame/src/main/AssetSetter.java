package main;

import object.OBJ_Chest_2;
import object.OBJ_Door;
import object.OBJ_Key;
import object.OBJ_Socks_Blue;

public class AssetSetter {

	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		gp.obj[0] = new OBJ_Key();
		gp.obj[0].worldX = 34 * gp.tileSize;
		gp.obj[0].worldY = 28 * gp.tileSize;
		
		gp.obj[1] = new OBJ_Key();
		gp.obj[1].worldX = 37 * gp.tileSize;
		gp.obj[1].worldY = 12 * gp.tileSize;
		
		gp.obj[2] = new OBJ_Key();
		gp.obj[2].worldX = 25 * gp.tileSize;
		gp.obj[2].worldY = 9 * gp.tileSize;
		
		gp.obj[3] = new OBJ_Door();
		gp.obj[3].worldX = 39 * gp.tileSize;
		gp.obj[3].worldY = 15 * gp.tileSize;
		
		gp.obj[4] = new OBJ_Door();
		gp.obj[4].worldX = 4 * gp.tileSize;
		gp.obj[4].worldY = 3 * gp.tileSize;
		
		gp.obj[5] = new OBJ_Chest_2();		
		gp.obj[5].worldX = 4 * gp.tileSize;
		gp.obj[5].worldY = 0 * gp.tileSize;
		
		gp.obj[6] = new OBJ_Socks_Blue();
		gp.obj[6].worldX = 47 * gp.tileSize;
		gp.obj[6].worldY = 40 * gp.tileSize;

	}
}
