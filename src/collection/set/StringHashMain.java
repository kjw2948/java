package collection.set;

public class StringHashMain {

    public static void main(String[] args) {

        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

        int hashA = hashCode("A");
        int hashB = hashCode("B");
        int hashAB = hashCode("AB");

        //hashCode()
        System.out.println("hashA = " + hashA);
        System.out.println("hashB = " + hashB);
        System.out.println("hashAB = " + hashAB);

        //hashIndex
        System.out.println(hashIndex(hashA));
        System.out.println(hashIndex(hashB));
        System.out.println(hashIndex(hashAB));



    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }

    static int hashIndex(int num) {
        return  num % 10;
    }

}
