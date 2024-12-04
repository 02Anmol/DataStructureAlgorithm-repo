import java.util.Stack;
public class stack {
    public static void main(String[] args) {

        // Stack: LIFO data structure. Last-In-First_Out stores objects into sort of vertical tower 
        // push() to add to the top
        // pop() to remove from the top

        Stack<String> stack = new Stack<String>();
        

        stack.push("Minecraft");
        stack.push("Fortnite");
        stack.push("League of Legends");
        stack.push("Apex Legends");
        // System.out.println(stack.empty());

        System.out.println(stack);

        stack.pop();
        System.out.println(stack.peek());

        System.out.println(stack.search("Fortnite"));

        // use stacks?
        // -> undo/redo features in text editors
        // -> moving back/forword through browser history
        // -> backtracking Algorithm (maze, file directories)
        // -> calling functions (calll stack)
    }
    
}
