/*
	Problem:
		A binary watch has 4 LEDs on the top to represent the hours (0-11),
		and 6 LEDs on the bottom to represent the minutes (0-59). Each LED 
		represents a zero or one, with the least significant bit on the right.

		For example, the below binary watch reads "4:51".

		Given an integer turnedOn which represents the number of LEDs that are
		currently on (ignoring the PM), return all possible times the watch could
		represent. You may return the answer in any order.

		The hour must not contain a leading zero.

		For example, "01:00" is not valid. It should be "1:00".
		The minute must consist of two digits and may contain a leading zero.

		For example, "10:2" is not valid. It should be "10:02". 

		Example 1:

			Input: turnedOn = 1
			Output: ["0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"]

		Example 2:

			Input: turnedOn = 9
			Output: []
		 
		Constraints:

		0 <= turnedOn <= 10
*/

/*
	Algorithm readBinaryWatch(TurnedOn){
		results:={};
		totalLights:=0;

		for hours:=0 to 11 do{

			for minutes:=0 to 59 do{
				totalLight=numSet(hours)+numSet(minutes);

				if(totalLight==TurnedOn)
					results.append(Integer.toString(hours)+":"+Integer.toString(minutes));
			}
		}

		return results;
	}
*/

import java.util.*;

class Solution{
	public List<String> readBinaryWatch(int turnedOn){
		List<String> result = new ArrayList<>();
		int totalLights=0;

		for(int hours=0;hours<=11;hours++){

			for(int minutes=0;minutes<=59;minutes++){
				totalLights=Integer.bitCount(hours)+Integer.bitCount(minutes);

				if(totalLights==turnedOn){
					String minString = (minutes<10)?"0"+Integer.toString(minutes):Integer.toString(minutes); 
					result.add(Integer.toString(hours)+":"+minString);
				}
			}
		}

		return result;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob = new Solution();

		System.out.println(ob.readBinaryWatch(Integer.parseInt(args[0])));
	}
}
