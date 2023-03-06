import java.util.Scanner;
import java.lang.Math;

public class ShortestDistanceManhattanPath {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] startPoints=new int[2];
        System.out.println("Enter x axis and y axis:");
        startPoints[0]= sc.nextInt();
        startPoints[1]= sc.nextInt();
        String direction= sc.next();
        System.out.println(manhattanDistance(startPoints,direction));
        //System.out.println((startPoints[0]));
    }
    public static String manhattanDistance(int[] start, String direction){
        int[] end=new int[2];
        end[1]=start[1];
        end[0]=start[0];
        for(int i=0;i<direction.length();i++){
            char c=direction.charAt(i);
            if(c=='N' && end[1]<10){
                end[1]++;
            }else if(c=='S' && end[1]>0){
                end[1]--;
            }else if(c=='E' && end[0]<10){
                end[0]++;
            }else if(c=='W' && end[0]>0){
                end[0]--;
            }
        }

        double distance=Math.sqrt(Math.pow(end[0]-start[0],2)+Math.pow(end[1]-start[1],2));
        return String.format("%.1f", distance);

    }
}
