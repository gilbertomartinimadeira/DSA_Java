public class DynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        super();

        this.array = new Object[this.capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[this.capacity];
    }

    public void add(Object data) {
        if(size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){
        if (size >= capacity) {
            grow();
        }
        //O(n)
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        ++size;

    }

    public void delete(Object data) {
       for (int i = 0; i < size; i++) {
         if(array[i] == data) {
            for (int j = 0; j < (size -i -1); j++) {
                array[i + j] = array[i+j+1];
            }
            array[size -1] = null;
            size--;

            if(size <= (int) (capacity/3)){
                shrink();
            }
            break;
         }
       }
    }

    public int search(Object data){
        for (int i = 0; i < size; i++) {
            if(array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public void grow(){
        int newCapacity = (int)( capacity * 2);
        var newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;

    }

    public void shrink(){
        int newCapacity = (int)( capacity / 2);
        var newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {return size == 0; }

    public String toString() { 

        String str = "";

        for (int i = 0; i < capacity; i++) {
            str += array[i] + ", ";
        }

        if(str != "") {
            str = "[" + str.substring(0, str.length() - 2) + "]";
        }
        else{
            str = "[]";
        }
        return str;
    }

}
