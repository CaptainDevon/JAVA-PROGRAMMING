public class PlacingTiles {
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(placeTiles(n, m));
    }   

    public static int placeTiles(int n,int m)
    {
        if(n==m)return 2;
        if(n<m)return 1;
        int verticalPlacement=placeTiles(n-m, m);
        int horizontalPlacement=placeTiles(n-1, m);
        return verticalPlacement+horizontalPlacement;
    }
}
