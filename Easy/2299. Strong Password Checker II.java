class Solution {
    List<Character> special = new ArrayList<>();
    public boolean strongPasswordCheckerII(String s) {
        special.add('!');
        special.add('@');
        special.add('#');
        special.add('$');
        special.add('%');
        special.add('^');
        special.add('&');
        special.add('*');
        special.add('(');
        special.add(')');
        special.add('-');
        special.add('+');
        if(isDigit(s) && isUpper(s) && isLower(s) && s.length()>=8 && isSpecial(s) && sameChar(s)){
            return true;
        }
        return false;
    }

    public boolean isUpper(String s){
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean isLower(String s){
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean isDigit(String s){
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public boolean isSpecial(String s){
        for(int i=0;i<s.length();i++){
            if(special.contains(s.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public boolean sameChar(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}
