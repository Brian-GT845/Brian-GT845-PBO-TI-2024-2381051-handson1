public class TipeDataArray {
    public static void main(String[] args) {
    //cara1
        int[] kumpulanNumber; // deklarasi
        kumpulanNumber = new int[3]; // inisialisasi

        //cara2
        int[] kumpulanNumber2 = new int[3];

        //cara3
        int[] kumpulanNumber3 = new int[] { 1,3,4,5};

        // cara memasukkan value ke gray
        kumpulanNumber[0] = 100;
        kumpulanNumber[1] = 200;
        kumpulanNumber[2] = 300;

        System.out.println(kumpulanNumber[1]);
    }
}
