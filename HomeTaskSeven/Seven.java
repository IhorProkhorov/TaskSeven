package com.hillel.IhorProkhorov.HomeTaskSeven;

public class Seven {

    private String[] array;
    private int size;

    public void clearArray(){
        this.array = new String[5];
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public boolean contains(String newString){
        for (int i = 0; i < this.array.length; i++){
            if ( this.array[i] == newString) return true;
        }
      return false;
    }

    public boolean equals(){
        boolean flag = false;
        for (int i = 0; i < this.array.length; i++){
           for (int j = i + 1; j < this.array.length; j++){
               if (this.array[i] == this.array[j]) flag = true;
           }
        }
        return flag;
    }

    public int find(String newString){
        for (int i = 0; i < this.array.length; i++){
            if ( this.array [i] == newString) {
                return i;
            }
        }
        return -1;
    }

    public void getElement(int index){
        if ( index >= 0 && index <= array.length - 1) {
            for (int i = 0; i < array.length; i++){
                if ( i == index) System.out.println( array[i]);
            }
        }else System.out.println("Недопустимый индекс массива");
    }

    public void addElement(String newString){
        if (this.array.length <= this.size){
            String[] newArray = new String[size + size * 2 / 3];
            for (int i = 0; i < this.array.length; i++){
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
        this.size++;
        this.array[size - 1] = newString;
    }

    public String[] deleteJelement( int j ){
        for (int i = 0; i < this.array.length - 1; i++){
            if (i >= j){
                this.array[i] = this.array[i + 1];
            }
        }
        this.array[this.array.length - 1] = null;
        this.size--;
        return this.array;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
