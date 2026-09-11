public class varargs {
    public static void main(String[] args){
        int add = add(1, 2, 5, 7, 89, 4);
        System.out.println(add);

    }
static int add(int... add){
        int sum=0;
        for (int number:add){
            sum +=number;
        }
return sum; }
}
