package Code300;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // ab, ba
        StringBuilder sb = new StringBuilder();

         for(Character c : s.toLowerCase().toCharArray()){
             if(Character.isLetterOrDigit(c)){
                 sb.append(c);
             }
         }

         int left = 0, right = sb.length() - 1;
         while(left < right){
             if(sb.charAt(left) != sb.charAt(right)){
                 return false;
             }

             left++;
             right--;
         }

        return true;
    }
}
