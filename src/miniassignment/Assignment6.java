package miniassignment;
import java.util.*;
import java.util.stream.Collectors;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random  rd = new Random();
        System.out.print("총 진행할 투표수를 입력해 주세요.");
        int vote = sc.nextInt(); // 총 투표수
        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        int member = sc.nextInt(); // 후보자 수
        String[] memberArray = new String[member]; //후보자 이름 저장 배열
        int[] voteArray= new int[member]; //후보자 투표수 저장 배열

        for (int i = 0; i < member; i++) {
            System.out.print((i+1)+"번째 후보자를 입력해 주세요.");
            memberArray[i] = sc.next();
        }
        for (int i = 1; i <= vote; i++) {
            int voteNumber = rd.nextInt(member); //몇번에 투표?
            voteArray[voteNumber]++; //투표받은 사람 득표수 증가
            float progress = (float)i*100 / vote;
            System.out.println("[투표진행률]: "+ String.format("%.2f",progress)+"%, "+i+"명 투표 => "+memberArray[voteNumber]);

            for (int j = 0; j < member; j++) {
                float getVote = (float)voteArray[j]*100 / vote;
                System.out.println("[기호:"+(j+1)+"] "+memberArray[j]+": "+ String.format("%.2f",getVote)+"% \t"+"(투표수: "+voteArray[j]+")");
            }
        }
        int max = 0;
        // 당선인 선정
        for (int i = 1; i < member; i++) {
            if(voteArray[max]<voteArray[i]){max = i;}
        }
        // 최대 투표수가 같은 예외상황
        List<Integer> list = Arrays.stream(voteArray)
                .boxed()
                .collect(Collectors.toList());
        int count = Collections.frequency(list ,voteArray[max]);
        if(count>=2){
            System.out.println("[투표결과] 최다득표자가 다수입니다.");
        }
        else{
        System.out.println("[투표결과] 당선인: " + memberArray[max]);
        }
    }
}
