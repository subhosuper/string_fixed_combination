# string_fixed_combination
Any combination of string, each character not getting interchanged with other character. 
Having two fixed any two characters at the first and at the last of the string. 
Return the number of such combinations. 
Example: 'a' and 'b' are fixed in this example. 
Input: "abcb"  
Output: 5  
Possible combinations: ab(0,1) 
                       ab(0,3) 
                       acb(0,2,3) 
                       abb(0,1,3) 
                       abcb(0,1,2,3)
