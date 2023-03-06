import java.util.*;
import java.util.stream.Collectors;

public class combinationSort {
    private static Object Collectors;

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the list: ");
        int num=sc.nextInt();
        ArrayList<String> stringList=new ArrayList<>();

        for(int i=0;i<num;i++) {
            stringList.add(sc.next());
        }
        sortString(stringList);
        //System.out.print(stringList);

    }
    public static void sortString(List<String> list){
        TreeMap<Character,List<Integer>> charMap=new TreeMap<>();
        for(int i=0;i<list.size();i++){
            if (charMap.containsKey(list.get(i).charAt(0))) {
                charMap.get(list.get(i).charAt(0)).add(Integer.parseInt(list.get(i).substring(1)));
            } else{
                List<Integer> suffixString=new ArrayList<>();
                suffixString.add(Integer.parseInt(list.get(i).substring(1)));
                charMap.put(list.get(i).charAt(0),suffixString);
            }
        }
        List<String> L1=new ArrayList<>();
        List<String> L2=new ArrayList<>();
        for(Character c:charMap.keySet()){
            for(int i=0; i<charMap.get(c).size();i++){
                L1.add(c+String.valueOf(charMap.get(c).get(i)));
            }
            Collections.sort(charMap.get(c),Collections.reverseOrder());
            for(int i=0; i<charMap.get(c).size();i++){
                L2.add(c+String.valueOf(charMap.get(c).get(i)));
            }
        }
        System.out.println(L1);
        System.out.println(L2);
    }
}
