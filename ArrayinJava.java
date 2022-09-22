package hamropatro.datastructure;

public class ArrayinJava {
    public static void main(String[] args) {
        String fruits[] = {"Apple","Banana","Mango","TOmato"};
        for(int i = 0 ;i < fruits.length;i++) {
            System.out.println(fruits[i]);
        }
        int num[][] = {{1,2,3,4},{5,6,7,8},{9}};
        // first[] for array and second[] for array index.
        int x = num[0][2];//returns 3
        int y = num[2][0];
        System.out.println(x);
        System.out.println(y);
        System.out.println("hello array");
    }
    
}
