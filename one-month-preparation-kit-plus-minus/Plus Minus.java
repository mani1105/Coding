import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float ncount =0;
    float pcount =0;
    float zcount =0;
    int n=arr.size();
    for(int i=0;i<n;i++){
        if(arr.get(i)>0){
            pcount=pcount+1;
        }else if(arr.get(i)<0){
            ncount=ncount+1;
        }else{
            zcount=zcount+1;
        }
    
    }
    double popv =pcount/n;
    double ponv =ncount/n;
    double pozv =zcount/n;
    System.out.println(popv);
    System.out.println(ponv);
    System.out.println(pozv);
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
