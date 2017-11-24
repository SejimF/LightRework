import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		 
		
		//Take arguments int from cmd and give  to method  
		// else no argument method 20 lights
		int lightNumbers = 0;
		int deffaultNumber = 20;
	
			if(args.length > 0) {
				try{
			 		lightNumbers = Integer.parseInt(args[0]);
				}catch(NumberFormatException e){
					//System.out.println("using Deffault numbers of light 20");
				}
			}else lightNumbers = deffaultNumber;
			
		
		String [] LightsColors = {"Red", "Green", "Blue"};
		
		LightWorkManipulator lwm = new LightWorkManipulator(lightNumbers, LightsColors);
		lwm.run();
	}
}
