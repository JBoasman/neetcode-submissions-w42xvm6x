class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0) {
            return 0;
        }
        if (stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        if (stones[stones.length-1] == stones[stones.length-2]) {
            return lastStoneWeight(Arrays.copyOfRange(stones,0,stones.length-2));
        }
        if (stones[stones.length-1] != stones[stones.length-2]) {
            int newStone = Math.abs(stones[stones.length-1] - stones[stones.length-2]);
            int[] newStoneList = Arrays.copyOfRange(stones,0,stones.length-1);
            newStoneList[newStoneList.length -1] = newStone;
            return lastStoneWeight(newStoneList);
        } 
        return 0;
    }
}
