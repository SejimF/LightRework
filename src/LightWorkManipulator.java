
import java.sql.*;
import java.util.Date;
import java.text.*;
public class LightWorkManipulator
{
	SimpleDateFormat simplDateFormat = new SimpleDateFormat("HH:mm:ss");
	
	private Light [] lightsArray; // null array of lights
	private String [] lightColor; //null array of colors
	private int ID = 1;
	
	
	
	LightWorkManipulator(int numberOfLights, String [] colors)
	{
		this.lightsArray = new Light [numberOfLights]; //saving lighy to the arrau
		this.lightColor = colors; //saving colors to the array

		int colorRoll = 0; //int to roll througth the colors
		
		for(int i = 0; i < numberOfLights; i++)
		{
				lightsArray[i] = new Light(lightColor[colorRoll], ID);
				colorRoll++;
				ID++;
				if(colorRoll == lightColor.length){colorRoll = 0;} //if colorRoll.is equal to how many colors are in the arrau start from start
				}
	}
	
	public void run()
	{
		
			for(int b = 0; b <= lightsArray.length; b++)
			{
				try{
				Date dateNow = new Date(); //taking the time first time
				lightsArray[b].changeStateOfLight(); // changing light status
				System.out.println(simplDateFormat.format(dateNow) + " " +lightsArray[b].getID() + " " + lightsArray[b].getLightColor() + " Light" + onOFF(lightsArray[b].getStateOfLight()));
				Thread.sleep(1000); //wait one swcond
				lightsArray[b].changeStateOfLight();
				Date secondDate = new Date();
				System.out.println(simplDateFormat.format(secondDate) + " " +lightsArray[b].getID() + " " + lightsArray[b].getLightColor() + " Light" + onOFF(lightsArray[b].getStateOfLight()));
				}catch(Exception e){
					//System.out.println("Something gone really bad");
				}
			}
	
		
	}
	
	public String onOFF(boolean check){
		//METHOD FOR OUTPUT TEXT IF LIGHT IS ON OR OFF
		if(check == false){return " Off"; 
		}else return " On";
	}
	
}
