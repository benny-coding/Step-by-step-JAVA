package Chapter01_Variable;

public class OverflowEx {
    public static void main(String[] args){
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println("sMin = " + sMin );
        System.out.println("sMin-1 = " + (short)(sMin-1)); // short형 -32768에서 -1할시에 오버플로우 발생
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1= " + (short)(sMax+1)); // # short형 32767에서 +1할 시에 오버플로우 발생
        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin-1 = " + (int)--cMin);    // # char형은 부호가 없으므로 양수로만 취급 0에서 -1 시에 오버플로우 발생
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax+1 = " + (int)++cMax);    // # 65535에서 +1시 오버플로우 발생
    }
}
