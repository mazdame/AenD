package com.company;

class stack<T extends Object> {

    private int stackSize;
    private T[] stackArr;
    private int top;

    @SuppressWarnings("unchecked")
    public stack(int size) {
        this.stackSize = size;
        this.stackArr = (T[]) new Object[stackSize];
        this.top = -1;
    }

    public void push(T entry){
        if(this.isStackFull()){
            System.out.println(("Stack is vol, capaciteit wordt verhoogd"));
            this.increaseStackCapacity();
        }
        System.out.println("toegevoegd: "+entry);
        this.stackArr[++top] = entry;
    }

    public T pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("stack is leeg, element kan worden verwijderd");
        }
        T entry = this.stackArr[top--];
        System.out.println("verwijderde entry: "+entry);
        return entry;
    }

    public T peek() {
        return stackArr[top];
    }

    private void increaseStackCapacity(){

        @SuppressWarnings("unchecked")
        T[] newStack = (T[]) new Object[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize*2;
    }


    public boolean isStackEmpty() {
        return (top == -1);
    }

    public boolean isStackFull() {
        return (top == stackSize - 1);
    }

    public static void main(String a[]){
        stack<String> stringStack = new stack<String>(2);
        stringStack.push("hallo");
        stack<Integer> integerStack = new stack<Integer>(2);
        integerStack.push(23);
    }
}