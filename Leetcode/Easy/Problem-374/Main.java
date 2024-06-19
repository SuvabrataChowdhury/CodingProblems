import java.util.*;

class GuessGame{
	int pick;
	
	GuessGame(){}

	GuessGame(int pick){
		this.pick=pick;
	}

	public int guess(int num){
		return (num>this.pick)?-1:((num==this.pick)?0:1);
	}
}

class Solution extends GuessGame{
	Solution(int pick){
		super(pick);
	}

	public int guessNumber(int n){
		long lower=1;
		long upper=n;

		while(lower<=upper){
			int middle=(int)((lower+upper)/2);

			if(super.guess(middle)==0)
				return middle;
			else if(super.guess(middle)==-1)
				upper=middle-1;
			else
				lower=middle+1;

			System.out.println(lower+" "+upper);
		}

		return -1;
	}
}

public class Main{
	public static void main(String[] args){
		//GuessGame gg=new GuessGame(Integer.parseInt(args[0]));
		//System.out.println(gg.pick);

		Solution ob=new Solution(Integer.parseInt(args[0]));

		System.out.println(ob.guessNumber(Integer.parseInt(args[1])));
	}
}
