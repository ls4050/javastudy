package prob5;

public class MyStack {
	String[] stack = null;
	Integer top=0;
	
	MyStack(int size){
		stack = new String[5];
	}
	
	public void push(String str) {
		stack[top++] = str;
	}
	
	public String pop() throws MyStackException {
		if(top<=0) 
			throw new MyStackException("stack is empty");
		else
			return stack[--top];
	}
	
	public boolean isEmpty() {
		boolean result = false;
		if(top==0) result=true;
		return result;
	}
}