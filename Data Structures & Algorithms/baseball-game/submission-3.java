class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();

        for (String s : operations) {
            if ("D".equals(s)) {
                int tempInt1 = scores.pop();
                int newInt = tempInt1*2;
                scores.push(tempInt1);
                scores.push(newInt);
            } else if ("C".equals(s)) {
                scores.pop();
            } else if ("+".equals(s)) {
                int tempInt1 = scores.pop();
                int tempInt2 = scores.pop();
                int newInt = tempInt1 + tempInt2;
                scores.push(tempInt2);
                scores.push(tempInt1);
                scores.push(newInt);
            } else {
                scores.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while (!scores.isEmpty()) {
            sum += scores.pop(); 
        }
        return sum;
    }
}