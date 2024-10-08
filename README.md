# Minimum-Number-of-Swaps-to-Make-the-String-Balanced
**Variables:**
swap: A counter used to track unbalanced closing brackets (]) that need matching opening brackets ([).
**Loop:**

**The code iterates through each character in the string s:**
If the character is an opening bracket ([), it increments the swap counter, expecting it will be balanced by a closing bracket later.
If the character is a closing bracket (]) and swap is greater than 0 (indicating there's an unmatched opening bracket), it decrements the counter, signifying the match of an opening and closing bracket.
**Result Calculation:**
After the loop finishes, the unbalanced brackets are halved ((swap+1)/2) to determine the minimum number of swaps needed to make the string balanced.
This function works by counting unmatched brackets and then calculating how many swaps are necessary to balance the string.
