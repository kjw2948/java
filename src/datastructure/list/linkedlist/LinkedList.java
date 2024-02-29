package datastructure.list.linkedlist;

class Node{
    int data;
    Node next; // 다음 노드를 가리키는 변수

    Node(){}
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedList {
    Node head;
    //생성자
    LinkedList() {}
    LinkedList(Node head){
        this.head = head;
    }
    //비어있는 지 확인
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }else{
            return false;
        }
    }
    // 연결 리스트 맨 뒤에 데이터 추가
    public void addData(int data){
        if (this.head == null) {
            this.head = new Node(data, null);
        } else{
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }
    }
    // 현재 리스트의 맨 뒤의 데이터 삭제
    public void removeData(){
        if (this.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        Node cur = this.head;
        Node prev = cur;

        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }
        if (cur == this.head) {
            this.head = null;
        } else {
            prev.next = null;
        }

    }
}
