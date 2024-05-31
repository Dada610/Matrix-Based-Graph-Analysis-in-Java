import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random r=new Random();

        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of vertex");
        int n= s.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("enter index no. "+(i+1)+" "+(j+1));
                a[i][j]=s.nextInt();
            }
        }
        symmetric(a);
        reflex(a);
        transitive(a);
        acyclic(a);
        connect(a);
        eulerian(a);
    }
    static void reflex(int [][]a){
        boolean cont =true;
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] == 0) {
                cont = false;
                break;
            }
        }
        if (cont) System.out.println("matrix is reflexive");
        else System.out.println("matrix is not reflexive");
    }
    static void symmetric(int [][]a){
        boolean cont =true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != a[j][i]) {
                    cont = false;
                    break;
                }
            }
        }
        if (cont) System.out.println("matrix is symmetric");
        else System.out.println("matrix is not symmetric");
    }
    static void transitive(int[][] a) {
        boolean cont=true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {
                    for (int k = 0; k < a.length; k++) {
                        if (a[j][k] == 1 && a[i][k] == 0) {
                            cont = false;
                            break;
                        }
                    }
                }
            }
        }
        if (cont) System.out.println("matrix is transitive");
        else System.out.println("matrix is not transitive");
    }
    static void acyclic(int[][]a){
        boolean cont =true;
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] != 0) {
                cont = false;
                break;
            }
        }
        if (cont) {
            cont=false;
            int n=0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[i][j] == 1) {
                        for (int k = 0; k < a.length; k++) {
                            if (a[j][k] == 1 && a[i][k] == 0) {
                                cont = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!cont) System.out.println("matrix is acyclic");
        else System.out.println("matrix is not acyclic");
    }
 static void connect(int [][]a){

        boolean cont=true;
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            if (i==j)j++;
            int sum=0;
            if (a[i][j]==1){
                sum++;
            }
            if (sum==0){
                for (int k = 0; k < a.length ; k++) {
                    if (k==j) k++;
                    if (a[k][j]==1)sum++;
                }
            }
            if (sum==0)cont=false;break;
        }
    }
    if (cont) System.out.println("matrix is connected");
    else System.out.println("matrix is not connected");
    }
    static void eulerian(int[][]a){
        int[] degrees = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {
                    degrees[i]++;
                }
            }
        }
        int odd=0;

        for (int i = 0; i < degrees.length; i++) {
            if (degrees[i]%2!=0) odd++;

        }
        boolean cont=(odd==0||odd==2);
        if (cont) System.out.println("matrix have eulerian path");
        else System.out.println("matrix don`t have eulerian path");
    }
}