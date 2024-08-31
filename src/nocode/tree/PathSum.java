package nocode.tree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static nocode.tree.OrderTraversal.Node;
public class PathSum {
    public static ArrayList<List<Integer>> solution(OrderTraversal tree, int target) {

    }
    public static void main(String[] args) {
        OrderTraversal tree = new OrderTraversal();
        Node node1 = new Node(7);
        Node node2 = new Node(-2);
        Node node3 = new Node(5);
        Node node4 = new Node(3);
        Node node5 = new Node(15);
        Node node6 = new Node(8);
        Node node7 = new Node(-5);

        tree.tree = node1;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        int target = 20;
        ArrayList<List<Integer>> solution = solution(tree, target);
        System.out.println(Arrays.toString(solution.toArray()));
    }
}
