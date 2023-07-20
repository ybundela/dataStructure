import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BSTMain {

    public static void main(String[] args){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(47);
        binarySearchTree.insert(21);
        binarySearchTree.insert(9);
        binarySearchTree.insert(76);
        binarySearchTree.insert(18);
        binarySearchTree.insert(52);
        binarySearchTree.insert(82);
        binarySearchTree.insert(91);
        binarySearchTree.insert(27);
        System.out.println("HightestNode value"+binarySearchTree.findHighestValue(binarySearchTree.root.value));
        System.out.println("LowestNode value"+binarySearchTree.findLowestValue(binarySearchTree.root.value));
        System.out.println(binarySearchTree.contain(82));
        System.out.println(binarySearchTree.contain(17));



    }
}
