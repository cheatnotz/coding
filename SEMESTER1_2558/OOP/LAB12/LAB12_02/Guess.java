
public class Guess {
	private int[] doors; //one of the door has answer, otherwise=0
	
	public Guess(int max){
		//create doors with all set to 0 by default
		doors = new int[max];
	
		//set the answer value to only one random door
		int answerDoorNumber = (int) (Math.random() * max);
		doors[ answerDoorNumber ] = 999;
	}
	
	public boolean tryOpenDoor(int doorNumber){
		if(doors[doorNumber]==0){
				return false; //loss
		} else{
			return true; //win
		}
	}
}
