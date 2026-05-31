//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Pascal_Triangle {

    public static int[][] generateBruteForce(int n) {
        int arr[][] = new int[n][n];

        for(int i = 0;i< n;i++)
        {
            for(int j = 0;j<=i;j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        return arr;
    }

    // To find the nth element of the particular row r = N = 5, r = 5, c = 3
    //Output: Element at position (r, c): 6
    // TC : O(r)    SC: O(1)
    public static int generateElement(int n, int r)
    {
        int res =1 ;
        for(int i = 0;i< r;i++)
        {
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }

    // Find the entire rth row of the triangle
    // TC : O(n)    SC: O(1)
    public static void generateRow(int n)
    {
        int res =1 ;
        System.out.print(res);
        for(int i = 1;i< n;i++)
        {
            res = res * (n-i);
            res = res / i;

            System.out.print(res + " ");
        }
    }

    public List<Integer> generateRows(int n){
        List<Integer> row = new ArrayList<>();
        row.add(1);
        int res = 1 ;
        for(int i = 1; i < n; i++)
        {
            res = res * (n-i);
            res = res / i;
            row.add(res);
        }
        return row;
    }

    // Generate the entire Triangle
    // TC : O(n^2)    SC:
    public List<List<Integer>> generateTriangle(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i <= numRows; i++)
        {
            list.add(generateRows(i));
        }
        return list;
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the number n :");
           int n = sc.nextInt();
        }
    }
