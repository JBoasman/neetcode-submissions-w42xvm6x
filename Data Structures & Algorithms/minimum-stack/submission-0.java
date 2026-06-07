class MinStack {

    private ArrayDeque<Integer> mainStack;
    private ArrayDeque<Integer> minTracker;

    public MinStack() {
        mainStack = new ArrayDeque();
        minTracker = new ArrayDeque();
    }
    
    public void push(int val) {
        mainStack.push(val);
        if (minTracker.isEmpty()) {
            minTracker.push(val);
        } else if (val < minTracker.peek()) {
            minTracker.push(val);
        } else {
            minTracker.push(minTracker.peek());
        }
    }
    
    public void pop() {
        mainStack.pop();
        minTracker.pop();
        
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minTracker.peek();
    }
}
