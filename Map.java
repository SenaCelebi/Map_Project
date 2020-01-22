import java.util.Arrays;
import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
	 Plant[] plants = {new Plant(1,"artichoke",6),new Plant(2,"Tomato",4)
				,new Plant(3,"Wheat",2),new Plant(4,"Corn",3), new Plant(5,"Potato",1)};

		int  wedght = input.nextInt();
		int legnth  = input.nextInt();

	
		int[][]TMap = new int[legnth][wedght];
		int[][]newTmap = new int[legnth][wedght];  
		
		int year = 0;
		
		while(year<2018){
			
			year = input.nextInt();
			
			int Countofplant =input.nextInt();
			
			int [] idarray = new int[Countofplant];
			
			
			for(int i=0;i<Countofplant;i++){
				
				idarray[i]= input.nextInt();
			}

			for(int i=0;i<Countofplant;i++){
				int Startx = input.nextInt(), Starty = input.nextInt(),endx = input.nextInt()
						,endy = input.nextInt();
 				for(int j=0;j<legnth;j++){
					for(int t=0;t<wedght;t++){
						if(j>=Starty&&j<=endy&&t>=Startx&&t<=endx){
							
							for(int k=0;k<plants.length;k++){
								if(plants[k].plant_id==idarray[i]){
									newTmap[j][t]+=plants[k].tiredness_level;
								}
							}

						}


					}

 				}


			}
			
			for(int j=0;j<legnth;j++){
				for(int t=0;t<wedght;t++){
					 
					if(newTmap[j][t]!=0){
						TMap[j][t]+=newTmap[j][t];
						newTmap[j][t]=0;
					}else
						
						if(TMap[j][t]!=0){
							if(TMap[j][t]==2){
								TMap[j][t]=0;
							}else
								if(TMap[j][t]==1){
									TMap[j][t]=0;
								}
								else{
							 TMap[j][t]-=3;}
								}
							 
							 
						}
				
				
				}
		}
		printArray(TMap);

	}
	
	public static void printArray(int maps[][]) {
	    for (int[] row : maps) 
	        System.out.println(Arrays.toString(row));    
	              
	}
	

}