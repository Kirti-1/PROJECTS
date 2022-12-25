/*************************** WORD PATTERN *************************

https://leetcode.com/problems/word-pattern/

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
Example 4:

Input: pattern = "abba", s = "dog dog dog dog"
Output: false
 

Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lower-case English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
*/

public class WordPattern{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String pattern = br.readLine();
        Solution obj = new Solution();
        System.out.println(obj.wordPattern(pattern,str));

    }
}
class Solution{
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        string[] checkans = new string[pattern.length()];
        int i = 0;
        for(char ch:pattern){
            if(checkans[ch-97] == null){
                checkans[ch-97] = words[i];
            }else{
                if(checkans[ch-97] != words[i]){
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}