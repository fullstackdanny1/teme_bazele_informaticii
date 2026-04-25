package lectia4;
import java.io.*;

public class problema4 {
    
    public static void main(String[] args){

        int N = 0, M = 0, P = 0;
        double[][] A = null, B = null, C = null;
        BufferedReader br = null;
        BufferedWriter fw = null; 

        try {

            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduceti N: ");
            N = Integer.parseInt(br.readLine());
            System.out.println("Introduceti M: ");
            M = Integer.parseInt(br.readLine());
            System.out.println("Introduceti P: ");
            P = Integer.parseInt(br.readLine());

            A = new double[N][M];
            B = new double[M][P];
            C = new double[N][P];

            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++)
                {
                    System.out.println("A[" + i + "][" + j + "] = ");
                    A[i][j] = Double.parseDouble(br.readLine());
                }
              
            }

            for(int i = 0; i < M; i++){
                for(int j = 0; j < P; j++)
                {
                    System.out.println("B[" + i + "][" + j + "] = ");
                    B[i][j] = Integer.parseInt(br.readLine());
                }
            }

            for(int i = 0; i < N; i++){
                for(int j = 0; j < P; j++){
                    for(int k = 0; k < M; k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            fw = new BufferedWriter(new FileWriter("output.txt"));

            for(int i = 0; i < N; i++){
                for(int j = 0; j < P; j++){
                    fw.write(C[i][j] + " ");
                    System.out.print(C[i][j] + " ");
                }
                fw.newLine();
                System.out.println();
            }
            br.close();
            fw.close();
        }
        catch(Exception e){
           System.out.println(e);
        }
    }

}
