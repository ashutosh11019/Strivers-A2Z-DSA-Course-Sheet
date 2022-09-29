class StockSpanner {
    Stack<int []> stack;

    public StockSpanner() {
        stack=new Stack<>();
    }
    
    public int next(int price) {
        int i=1;
        while(!stack.isEmpty()&&stack.peek()[0]<=price)
        {
            i+=stack.pop()[1];
        }
        stack.push(new int[]{price,i});
        return i;
    }
}