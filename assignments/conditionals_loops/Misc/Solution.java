/*
I'm given a number  as input 

I have to perform multiplication on each digit of input number 
also have to peform it's sum 

and atlast the sum and mul should be subtracted to get result 

order 

result = mul - add; 

what will I need ? 

extract individual digits 
divide by 10 which reduces the place value and extracts last digit. 

find out how many digits are their in the digits 
how ? 
divide by 10 which reduces the place value and extracts last digit. 
keep counter variable

1. perform mul on this digit and store it in mul var 
2. perform addition on digits and store it in add var 

psuedocode 

digit counting 

counter initialized to 1;
loop (num divided by 10 != 0) 
		counter increment 
		reduce the placevalue of number to get rest of the digits 

multiplication of each digit 

create copy of counter variable 
create mul var and initalize it as 1 

loop (until copy becomes 0) 
		extract the digits = taking remainder of num that of with 10
		mul = multiply digit with mul to access previous digits multiplied answers
		decrement the copy of counter. 
		number place value reduce divide by 10 
		
addition sum of all digits 

create copy of counter var 
create add var initalize it as 0 

loop (until copy of counter becomes 0) 
		digit = extract digit by taking remainder of num that of with 10 
		add = add the previous add values and current digit 
		decrement the counter. 
		number place reduce divide by 10 
		
	create var result = mul - add 
	
	return the answer 
*/
class Solution {
    public static int subtractProductAndSum(int n) {
        int counter = 1; 

        // digit counting 
        int temp1 = n; 
        
        while(temp1/10 !=0) {
            counter++; 
            temp1 = temp1/10; 
        }

        // Multiplcation on all the digits
        int c_counter1 = counter; 
        int mul = 1; 
        int temp2 = n; 

        while(c_counter1 !=0) {
            int digit = temp2 % 10; 
            mul = mul * digit; 
            temp2 = temp2 / 10;  
            c_counter1 --;
            System.out.println(mul);
        }

        // Sum of all the digits
        int c_counter2 = counter; 
        int add = 0; 
        int temp3 = n; 

        while(c_counter2 !=0) {
            int digit = temp3 % 10; 
            add = add + digit; 
            temp3 = temp3/10; 
            System.out.println(add);
            c_counter2 --; 
        }
        
        return mul - add; 
    }

    public static void main(String[] args) {
        System.out.print(subtractProductAndSum(-1));
    }
}