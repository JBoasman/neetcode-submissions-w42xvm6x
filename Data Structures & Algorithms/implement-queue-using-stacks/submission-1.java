class MyQueue {
    private Stack<Integer> normal;
    private Stack<Integer> reverse;

    public MyQueue() {
        normal = new Stack<>();
        reverse = new Stack<>();
    }
    
    public void push(int x) {
        normal.push(x);
    }
    
    public int pop() {
        if (reverse.isEmpty()) {
            while (!normal.isEmpty()) {
                reverse.push(normal.pop());
            }
        } 
        return reverse.pop();  
    }
    
    public int peek() {
        int temp = pop();
        reverse.push(temp);
        return temp;
    }
    
    public boolean empty() {
        return (normal.isEmpty() && reverse.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */