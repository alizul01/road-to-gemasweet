package lumpat;

import java.util.Scanner;

public class Test {
    static String[] peta;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int p = sc.nextInt();
       int l = sc.nextInt();
       sc.nextLine();

    
        // int p = 10, l=8;
        peta = new String[p];
        // peta[0] = "|------|";
        // peta[1] = "|xxxx  |";
        // peta[2] = "|  D   |";
        // peta[3] = "|      |";
        // peta[4] = "|      |";
        // peta[5] = "|      |";
        // peta[6] = "|------|";
        // peta[7] = "|xx   x|";
        // peta[8] = "|   C  |";
        // peta[9] = "|------|";


        for (int i = 0; i < p; i++) {
            peta[i] = sc.nextLine();
        }

        int ci=0, di=0, wall=0;
        for (int i = 1; i < p-1; i++) {
            if(peta[i].contains("C")) ci=i;
            else if(peta[i].contains("D")) di=i;
            else if(peta[i].contains("-")) wall=i;
        }

        int hole;
        int[] sideHole = new int[2];
        int cc;

        //cek dinding atas/bawah
        if(ci < di){
            // cek lubang
            hole = hole(peta[0]);
            sideHole = sideHole(1, wall);
            cc = sideHole[0] == 0 ? 1 : l-2;
            if(sideHole != null && peta[sideHole[1]].charAt(cc) == ' ' || (hole != -1 && peta[1].charAt(hole) == ' ')){
                System.out.println("ada jalan Cepot lumpat");
            } else System.out.println("Tidak ada jalan Cepot lumpat");

            //cek jalur d ke c
            boolean can=false;
            for (int i = di-1; i != ci; i--) {
                if(peta[i].substring(1,l-1).contains(" ")) can=true;
                else{
                    can=false;
                    break;
                }
            }
            if(can) System.out.println("Dawala bertemu Cepot");
            else System.out.println("Dawala tidak bertemu Cepot");
        } 
        else { //c dibawah d
            //cek lubang
            hole=hole(peta[p-1]);
            sideHole = sideHole(wall, p-1);

            cc = sideHole[0] == 0 ? 1 : l-2;
            if(sideHole != null && peta[sideHole[1]].charAt(cc) == ' ' || (hole != -1 && peta[p-2].charAt(hole) == ' ')){
                System.out.println("ada jalan Cepot lumpat");
            } else System.out.println("Tidak ada jalan Cepot lumpat");

            //cek jalur d ke c
            boolean can=false;
            for (int i = 1; i != ci; i++) {
                if(peta[i].substring(1,l-1).contains(" ")) can=true;
                else{
                    can=false;
                    break;
                }
            }
            if(can) System.out.println("Dawala bertemu Cepot");
            else System.out.println("Dawala tidak bertemu Cepot");
        }
    }

    static int hole(String a){
        int hole = -1;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) ==' '){
                hole = i;
                break;
            }
        }
        return hole;
    }

    static int[] sideHole(int start, int wall){
        int[] hole = new int[2];
        for (int i = start; i <= wall; i++) {
            if(peta[i].charAt(0) == ' '){
                hole[0] = 0; //kiri
                hole[1] = i;
                break;
            } else if(peta[i].charAt(peta[0].length()-1) ==' '){
                hole[0] = 1; //kanan
                hole[1] = i;
                break;
            }
        }
        return hole;
    }
}