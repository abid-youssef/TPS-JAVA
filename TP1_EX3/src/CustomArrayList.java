public class CustomArrayList {
    private int[] array;
    private int size;

    public CustomArrayList() {
        this.array = new int[10];
        this.size = 0;
    }

    public CustomArrayList(int initialSize) {
        this.array = new int[initialSize];
        this.size = 0;
    }

    public void DoubleArray() {
        int[] newArray = new int[this.array.length * 2];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }
    public void HalfArray() {
        int[] newArray = new int[this.array.length / 2];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }
    public void add(int obj) {
        if (this.size == this.array.length) {
                DoubleArray();
            }
        this.array[this.size] = obj;
        this.size++;
    }

    public void add(int index, int x) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException();
        }
        if (this.size == this.array.length) {
            DoubleArray();
        }
        for (int i = this.size; i > index; i--) {
            this.array[i] = this.array[i - 1];
        }
        this.array[index] = x;
        this.size++;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return this.array[index];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isIn(int x) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i]==x) {
                return true;
            }
        }
        return false;
    }
    public int find(int x) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i]==x) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int x) {
        int index = this.find(x);
        if (index == -1) {
            return;
        }

        for (int i = index; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.size--;
        if(this.size == (this.array.length/2))
        {
            HalfArray();
        }
    }
}
