package surpriseAssignment;
import java.io.*;

public class Mission1_3 {
    public static void main(String[] args) throws IOException {
        long totalCount = 127;
        long pageIndex = 11;

        Pager pager = new Pager(totalCount);
        System.out.println(pager.html(pageIndex));
    }
}