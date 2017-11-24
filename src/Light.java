
import org.apache.commons.codec.language.*;public class Light
{
	// id, status;
	private String lightColor; //Color of the light;
	private int ID; //Light ID;
	private boolean stateOfLight = false; //State of light;
	
	public void changeStateOfLight()
	{
			//Method to change light  status from On to Off and vice.
		if(stateOfLight == false)
		{
			stateOfLight = true;
		}else stateOfLight = false;
	}
	
	public boolean getStateOfLight(){
		//return status of light on or off;
		return stateOfLight;
	}
	
	public String getLightColor(){
		return lightColor;
	}
	
	public int getID(){
		return ID;
	}
	
	public Light(String lightColor, int ID){
		this.lightColor = lightColor;
		this.ID = ID;
	}
	
	
	
}
