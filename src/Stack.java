public class Stack {

    private final int[] value;
    private int position;

    Stack(int numOfArr, int position){
        this.value = new int[numOfArr];
        this.position = position;
    }

    public void push(int input){
        if (position < value.length){
            value[position++] = input;
            System.out.println("PUSH" + "  " + input);
        }else{
            System.out.println("FULL");
        }
    }

    public void pop(){
        if (position-- >= 1){
            System.out.println("POP" + "  " + value[position]);
        }else{
            System.out.println("EMPTY");
        }
    }
}
