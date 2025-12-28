// 299. Bulls and Cows


class BullsAndCows {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap<>();
        int bulls = 0, cows = 0;

        // count bulls and put at map
        for(int i=0; i<secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i); 

            if(c1 == c2) bulls++;
            else map.put(c1, map.getOrDefault(c1, 0) + 1);
        }

        // count cows
        for(int i=0; i<guess.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);
            
            if(c1 != c2 && map.containsKey(c2)) {
                cows++;
                if(map.get(c2) > 1) map.put(c2, map.get(c2) - 1);
                else map.remove(c2);
            }
        }
        String result = bulls + "A" + cows + "B";
        return result;
    }
}