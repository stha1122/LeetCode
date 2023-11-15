class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2 != 0)
            return new int[]{};
        Arrays.sort(changed);
        Queue<Integer> queue = new LinkedList<>();
        int[] res = new int[changed.length/2];
        int i = 0;
        for(int ele : changed){
            if(!queue.isEmpty() && queue.peek() == ele){
                res[i++] = queue.poll()/2;
            }else{
                queue.add(ele*2);
            }
        }
        return (queue.size() == 0)?res: new int[]{};
    }
}