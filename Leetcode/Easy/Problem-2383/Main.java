import java.util.*;

class Solution{
	public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience){
		int time=0;

		for(int i=0;i<energy.length;i++){
			if(initialEnergy<=energy[i]){
				time=time+energy[i]-initialEnergy+1;
				initialEnergy=energy[i]+1;
			}

			if(initialExperience<=experience[i]){
				time=time+experience[i]-initialExperience+1;
				initialExperience=experience[i]+1;
			}

			initialEnergy-=energy[i];
			initialExperience+=experience[i];
		}

		return time;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] energy={1,4,3,2};
		int[] experience={1,2,1,7};

		System.out.println(ob.minNumberOfHours(5,3,energy,experience));
	}
}
