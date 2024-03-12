package surpriseAssignment;

import java.io.*;

public class Pager {
    long totalCount;
    public Pager(long totalCount) {
        this.totalCount = totalCount;
    }
    public String html(long pageIndex) throws IOException{
        StringBuilder sb = new StringBuilder();
        int page = (int) (totalCount / 10) + 1;
        sb.append("<a href='#'>[처음]</a>\n");
        sb.append("<a href='#'>[이전]</a>\n\n");
        int start = pageIndex <= 10 ? 1 : (int) (pageIndex / 10) * 10 + 1;
        int end = start > ((totalCount / 10) + 1) - 9 ? (int) ((totalCount / 10) + 1) : start + 9;
        if (totalCount % 10 == 0) end--;
        for (int i = start ; i <= end; i++) {
            if(i==pageIndex){
                sb.append("<a href='#' class='on' >"+i+"</a>\n");
            } else{
                sb.append("<a href='#'>"+i+"</a>\n");
            }
        }
        sb.append("\n<a href='#'>[다음]</a>\n");
        sb.append("<a href='#'>[마지막]</a>\n");
        return sb.toString();
    }
}
