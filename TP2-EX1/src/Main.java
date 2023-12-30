public class Main {
    public static void main(String[] args) {
        // Test CustomStack
        CustomStack customStack = new CustomStack();

        customStack.addElement(1);
        customStack.addElement(2);
        customStack.addElement(3);

        System.out.println("Last element in the stack: " + customStack.LastInStack());

        customStack.removeElement();

        System.out.println("Last element after removal: " + customStack.LastInStack());

        System.out.println("Is the stack empty? " + customStack.StackIsEmpty());

        customStack.addElement(4);
        customStack.addElement(5);
        customStack.addElement(6);

        System.out.println("Is the stack full? " + customStack.StackIsFull());
    }
}
