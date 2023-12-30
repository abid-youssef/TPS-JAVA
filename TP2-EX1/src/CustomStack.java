public class CustomStack {
    private int[] array;
    private int size;

    public CustomStack() {
        this.array = new int[10];
        this.size = 0;
    }

    public CustomStack(int initialSize) {
        this.array = new int[initialSize];
        this.size = 0;
    }

    public void DoubleStack() {
        int[] newArray = new int[this.array.length * 2];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }
    public void HalfStack() {
        int[] newArray = new int[this.array.length / 2];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

    public void addElement(int obj) {
        if (this.size == this.array.length) {
                DoubleStack();
            }
        this.array[this.size] = obj;
        this.size++;
    }
    public void removeElement() {
        if (this.size == 0) {
            throw new IndexOutOfBoundsException();
        }
        if (this.size == this.array.length / 2) {
            HalfStack();
        }
        int[] newArray = new int[this.array.length - 1];
        for (int i = 0; i < this.array.length-1; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
        this.size--;
    }
    public int LastInStack() {
        if (this.size == 0) {
            throw new IndexOutOfBoundsException();
        }
        return this.array[this.size-1];
    }

    public boolean StackIsEmpty(){
        return this.size==0;
    }
    public boolean StackIsFull(){
        return this.size==this.array.length;
    }
}
