public class DisjointSet {
    static int n = 7;
    static int parent[] = new int[n];
    static int rank[] = new int[n];

    //intialization function
    public static void init(){
        for(int i = 0; i < n; i++){
            parent[i] = i;
        }
    }

    public static int find(int x){
        if(x == parent[x]){
            return x;
        }

        // return find(parent[x]);
            //or
        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b){
        int parentA = find(a);
        int parentB = find(b);

        if(rank[parentA] == rank[parentB]){
            parent[parentB] = parentA;
            rank[parentA]++;
        }
        else if(rank[parentA] < rank[parentB]){
            parent[parentA] = parentB;
        }
        else{
            parent[parentB] = parentA;
        }
    }
    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(2));
        union(1, 2);
        System.out.println(find(2));
        System.out.println(find(3));
    }
}
