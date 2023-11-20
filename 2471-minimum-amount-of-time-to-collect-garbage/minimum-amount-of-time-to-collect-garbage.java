class Solution {

    public int calculateTime(int travel[], HashMap<Integer,Integer>garbage){
        if(garbage.size()==0)
            return 0;
        int i=0,ans=0;
        for(Map.Entry<Integer,Integer>x:garbage.entrySet()){
            int garbage_loc = x.getKey();
            int garbage_qty = x.getValue();
            while(garbage_loc!=0 && i<garbage_loc){
                ans+=travel[i];
                i++;
            }
            ans+=garbage_qty;
        }
        return ans;
    }
    public int garbageCollection(String[] garbage, int[] travel) {
        HashMap<Integer,Integer>metal = new HashMap<>();
        HashMap<Integer,Integer>paper = new HashMap<>();
        HashMap<Integer,Integer>glass = new HashMap<>();

        for(int i=0;i<garbage.length;i++){
            String curr_word = garbage[i];
            for(int j=0;j<curr_word.length();j++){
                char curr_char = curr_word.charAt(j);
                if(curr_char == 'M')
                    metal.put(i,metal.getOrDefault(i,0)+1);
                else if(curr_char == 'P')
                    paper.put(i,paper.getOrDefault(i,0)+1);
                else if(curr_char == 'G')
                    glass.put(i,glass.getOrDefault(i,0)+1);
            }
        }

        return calculateTime(travel,metal)+calculateTime(travel,paper)+calculateTime(travel,glass);
    }
}