/*

Perfect number are those type of numbers whose sum of their factors == to the number itself
basically armstrong but  here the criteria is : 

1. Number  should exclude the number  itself  as divisor 
2. Divisiors sum is taken instead of raising the individual facevalues to power of number of digits 

Basically hcf factors sum == og num 

Pseudocode

input the number 
create sum intialize it with 0 

loop (1->numberitself excluding till loop) 
	if(number is divided by loops index) 
		sum = sum + loop index value 

check if (sum == num) 
	if yes 
			yes  
	if no 
			false
            
*/
class Solution {
    public boolean checkPerfectNumber(long num) {
        
        long sum = 0; 

        for(long le = 1; le < num; le++) {
            if(num % le == 0) {
                sum = sum + le; 
            }
            if(sum > num) {
                return false; 
            }
        }

        if(sum == num) return true;

        return false; 
    }
}