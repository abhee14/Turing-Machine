import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Project2{
	
	private List<String> list;
	private List<String> splitList;
	int counter;
	int stateChecker;
		public Project2(){
			counter=0;
			stateChecker=0;
		}
			
		public void getInfo(){

		BufferedReader br= null;

		try{
			String currentLine;
			br=new BufferedReader(new InputStreamReader(System.in));

				currentLine=br.readLine();
				list=new ArrayList<String>(Arrays.asList(currentLine.split("#")));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				if(br!=null)br.close();
			} catch (IOException ex){
				ex.printStackTrace();
			}
		}
		lineOne(list);
		lineTwo(list);
		lineThree(list);
		lineFour(list);
		lineFive(list);
		}
		
		
		
		public void lineOne(List<String> list){
			for(int j=0; j<list.size(); j++){
				if(list.get(j).equals("")){
					list.remove(j);
				 }
			}
			System.out.println(" ");
			for(int i=0; i<list.size()-1; i++){
				if(i==list.size()-2){
				System.out.print("#"+list.get(i)+"#");
				}
				else{
				 System.out.print("#"+list.get(i));
				}
			}
			System.out.println(" ");
		}
		
		public void lineTwo(List<String> list){
			System.out.println(list.get(list.size()-1));		
		}
		
		public void lineThree(List<String> list){
			System.out.println(list.size()-1);
		}
		
		public void lineFour(List<String> list){
			List<Character> checkList=new ArrayList<Character>();
			for(int i=0; i<=list.size()-2; i++){	
					if(!checkList.contains((list.get(i)).charAt(1))){
						checkList.add((list.get(i)).charAt(1));
					}			
					if(!checkList.contains((list.get(i)).charAt(7))){
						checkList.add((list.get(i)).charAt(7));
					}		
			}
			System.out.println(checkList.size());
		}
		
		public void lineFive(List<String> list){
		int innerCounter=0;
		int innerCounter2=0;
		int inputStringCounter=0;
		int inputStringCounter2=0;
		String currentState1="q0";
		String currentState2="q0";
		String nextStateNeeded="";
		String inputString=list.get(list.size()-1);
			while(inputStringCounter2<inputString.length()){
				innerCounter2=0;
				while(innerCounter2<list.size()-1){
					splitList=new ArrayList<String>(Arrays.asList((list.get(innerCounter2)).split(",")));
					innerCounter2++;
					//	System.out.println(inputString.charAt(inputStringCounter2));
						if(splitList.get(0).equals(currentState2)&&inputString.charAt(inputStringCounter2)==((splitList.get(1)).charAt(0))){
							nextStateNeeded=((splitList.get(1)).substring(3));
							if(nextStateNeeded.equals("qa")){
									stateChecker=1;
							}	
						}
						if(splitList.get(0).equals(currentState2)&&(inputString.charAt(inputStringCounter2)==('e')&&splitList.get(1).charAt(0)==('_'))){
								nextStateNeeded=((splitList.get(1)).substring(3));
								if(nextStateNeeded.equals("qa")){
									stateChecker=1;
							}	
						}
						
				}
				inputStringCounter2++;
				currentState2=nextStateNeeded;
				
			}
				while(inputStringCounter<inputString.length()){
				innerCounter=0;
				while(innerCounter<list.size()-1){
					splitList=new ArrayList<String>(Arrays.asList((list.get(innerCounter)).split(",")));
					innerCounter++;
					if(splitList.get(0).equals(currentState1)&&inputString.charAt(inputStringCounter)==((splitList.get(1)).charAt(0))){
						if(!splitList.get(1).substring(3).equals("qr")){
							nextStateNeeded=((splitList.get(1)).substring(3));
								if(nextStateNeeded.equals("qa")){
									stateChecker=1;
								}	
						}
					}
					if(splitList.get(0).equals(currentState1)&&(inputString.charAt(inputStringCounter)==('e')&&splitList.get(1).charAt(0)==('_'))){
								nextStateNeeded=((splitList.get(1)).substring(3));
								if(nextStateNeeded.equals("qa")){
									stateChecker=1;
							}	
						}
				}	
				inputStringCounter++;
				currentState1=nextStateNeeded;
			}
	
			if(nextStateNeeded.equals("qr")){
					stateChecker=3;
			}
		finalPrint(counter, stateChecker);
	}
	public void finalPrint(int counter, int stateChecker){
		if(stateChecker==1){
			System.out.println("M stops and accepts w");
		}
		else if(stateChecker==3){
			System.out.println("M stops and rejects w");
		}
		else if(stateChecker==0){
			System.out.println("M is still running");
		}	
	}
	public static void main(String[] args){
		Project2 run=new Project2();
		run.getInfo();
	}	
}