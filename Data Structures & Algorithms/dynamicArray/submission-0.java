class DynamicArray {
    int size=0;
    int[] arr;
    int capacity;

    public DynamicArray(int capacity) {
         arr= new int[capacity];
         this.capacity=capacity;

    }

    public int get(int i) {
        return arr[i];

    }

    public void set(int i, int n) {
        arr[i]=n;

    }

      public void pushback(int n) {
       if(size == capacity){
        resize();
        }

        arr[size] = n;
        size++;

    }

    public int popback() {
    if(size == 0){
        throw new RuntimeException("Array is empty");
    }

    int x = arr[size-1];
    size--;

    return x;
}
    public void resize() {
    capacity *= 2;

    int[] newArr = new int[capacity];

    for(int i = 0; i < size; i++){
        newArr[i] = arr[i];
    }

    arr = newArr;
}

    public int getSize() {
        return size;

    }

    public int getCapacity() {
        return capacity;

    }
}