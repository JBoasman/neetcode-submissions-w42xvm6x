class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayDeque<Double> fleets = new ArrayDeque<>();
        Map<Integer, Double> posAndHours = new HashMap<>();
        for (int i = 0; i < position.length; i++) {
            double hours = (double) (target - position[i])/speed[i];
            posAndHours.put(position[i], hours);
        }
        Arrays.sort(position);
        for (int i = position.length - 1; i >= 0; i--) {
            Double carHours = posAndHours.get(position[i]);
            if (!fleets.isEmpty()) {
                Double currentHours = fleets.peek();
                if (carHours > currentHours) {
                    fleets.push(carHours); //start a new, slower fleet; 
                } //if faster, it is slowed down by previous, so do nothing as it will join the fleet that is already in there;.
            } else {
                fleets.push(carHours);
            }
        }
        
        return fleets.size();
    }
}
