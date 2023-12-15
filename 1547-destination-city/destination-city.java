class Solution {
    public String destCity(List<List<String>> paths) {
        
        HashSet<String> depart = new HashSet<>();
     

        for (List<String> path : paths) {
            depart.add (path.get(0));
        
        }

        for (List<String> path : paths) {
            if (!depart.contains(path.get(1))) return path.get(1);
        }

        return "";
    }
}