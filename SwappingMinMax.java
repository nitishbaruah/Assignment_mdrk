import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SwappingMinMax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the list: ");
        int num=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();

        for(int i=0;i<num;i++) {
            a.add(sc.nextInt());
        }
        for(int i=0;i<num;i++) {
            b.add(sc.nextInt());
        }
        System.out.print(MinMax(a,b,num));

    }
    public static int MinMax(ArrayList<Integer> a,ArrayList<Integer> b, int num){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<num;i++){
            if(map.containsKey(b.get(i))){
                map.get(b.get(i)).add(i);
            }
            else {
                List<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(b.get(i),list);
            }
            if(b.get(i)>largest){
                secondLargest=largest;
                largest=b.get(i);
            } else if (b.get(i)>secondLargest && b.get(i)!=largest) {
                secondLargest=b.get(i);
            }
        }
        for(Integer i:map.get(largest)){
            swap(a,b,i);
        }
        for(Integer i:map.get(secondLargest)){
            swap(a,b,i);
        }
        int largestInA=Integer.MIN_VALUE;
        int largestInB=Integer.MIN_VALUE;
        for(int i=0;i<num;i++){
            if(a.get(i)>largestInA){
                largestInA=a.get(i);
            }
            if(b.get(i)>largestInB){
                largestInB=b.get(i);
            }
        }
        return largestInA*largestInB;

    }
    public static void swap(ArrayList<Integer> a,ArrayList<Integer> b, int n){
        int temp=a.get(n);
        a.set(n,b.get(n));
        b.set(n,temp);
    }

}
