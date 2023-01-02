class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==0 || word.length()==1){
            return true;
        }

        //if first letter is capital
        if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
            if(word.charAt(1)>='A' && word.charAt(1)<='Z'){
                for(int i=1;i<word.length();i++){
                    if(word.charAt(i)>='a' && word.charAt(i)<='z'){
                        return false;
                    }
                }
            }
            else{
                for(int i=1;i<word.length();i++){
                    if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                        return false;
                    }
                }
            }
        }
        //if first letter is small
        if(word.charAt(0)>='a' && word.charAt(0)<='z'){
            for(int i=1;i<word.length();i++){
                if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                    return false;
                }
            }
        }
        return true;
    }
}
