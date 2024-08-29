public class KonversiNumber {
    public static void main(String[] args) {

        byte tipedatabyte = 10;
        short tipedatashort =tipedatabyte;
        int tipedataint = tipedatashort;
        long tipedatalong = tipedataint;
        float tipedatafloat = tipedatalong;
        double tipedatadouble = tipedatafloat;

        int tipedataInt2 = 128;
        byte tipedataByte2 = (byte) tipedataInt2;
        System.out.println(tipedataByte2);

    }
}
