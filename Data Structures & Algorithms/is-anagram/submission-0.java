class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> h=new HashMap<>();
HashMap<Character,Integer> l=new HashMap<>();
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
            l.put(t.charAt(i),l.getOrDefault(t.charAt(i),0)+1);
        }
        return h.equals(l);

    }
}
