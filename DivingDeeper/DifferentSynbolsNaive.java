class Solution {
    int solution(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    
    }
}



//In this code, we create a new HashSet of characters called set. 
//We then iterate over each character in the input string s, and add it to the set using the add() method. 
//Since sets only keep unique elements, this will automatically remove any duplicate characters. 
//Finally, we return the size of the set, which gives us the number of unique characters in the string.