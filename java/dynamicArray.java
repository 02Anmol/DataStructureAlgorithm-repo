// Static Array :- Fixed Size & Dynammic Array :- Variable Size

public class dynamicArray {
    int size;
    int capacity = 10;
    object[] array;

    public DynamicArray(){
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity){
        this.capacity = capacity
        this.array = new Object[capacity];
    }

}
