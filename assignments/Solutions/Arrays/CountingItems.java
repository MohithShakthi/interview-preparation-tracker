import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n=0;
        for(int i=0;i<items.size();i++){
            switch(ruleKey){
                case "type":
                if(items.get(i).get(0).equals(ruleValue)){n++;}
                break;
                case "color":
                if(items.get(i).get(1).equals(ruleValue)){n++;}
                break;
                case "name":
                if(items.get(i).get(2).equals(ruleValue)){n++;}
                break;
            }
        }
        return n;
    }
}