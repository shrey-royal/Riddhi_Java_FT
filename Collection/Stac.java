import java.util.Stack;

public class Stac {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);

        // System.out.println(st.peek());
        // System.out.println(st.search(40));  //returns position not index

        // st.pop();
        // System.out.println(st);
        // System.out.println(st.empty());
        // System.out.println(st.size());
    }
}

/*
Methods of Stack:

1. push() - add element to the top of the stack
2. pop() - remove element from the top of the stack
3. peek() - return the top element of the stack
4. search() - return the position of the element in the stack
5. empty() - check if the stack is empty



*/