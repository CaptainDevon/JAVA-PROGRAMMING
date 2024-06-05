public class tree_recursion {

    static void tree(int num)
    {
        if(num<1)return;
        System.out.println(num+"pre call");
        tree(num-1);
        System.out.println(num+"mid call");
        tree(num-2);
        System.out.println(num+"post call");
    }
    public static void main(String[] args) {
        tree(3);
    }
    
}
