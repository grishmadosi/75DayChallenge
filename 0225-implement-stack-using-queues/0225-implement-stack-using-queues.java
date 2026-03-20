class MyStack {
    int size = -1;
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {     
    
    }
    
    public void push(int x) {
        q.offer(x);
        size++;
        for(int i = size; i > 0; i--){
           q.offer(q.poll());
        }
    }
    
    public int pop() {
        size--;
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return size==-1;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */