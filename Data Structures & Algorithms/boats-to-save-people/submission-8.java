class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int light = 0;
        int heavy = people.length - 1;
        int boats = 0;
        Arrays.sort(people);
        while (light < heavy) {
            if (people[heavy] + people[light] > limit) {
                boats++;
                heavy--;
            } else {
                heavy--;
                light++;
                boats++;
            } 
        }
        if (light == heavy) {
            boats++;
        }
        return boats;
    }
}