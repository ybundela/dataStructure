public class BinarySearchTree {

    Node root;

    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(newNode.value == temp.value){
                return false;
            }else if(newNode.value< temp.value){
                 if(temp.left == null){
                     temp.left = newNode;
                     return true;
                 }
                 temp = temp.left;
            } else if(newNode.value> temp.value){
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }


    public boolean contain(int value){
        Node temp = root;
        while(temp != null){
            if(value > temp.value){
                temp = temp.right;
            }else if(value < temp.value){
                temp = temp.left;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public int findHighestValue(int Rootvalue){
       Node temp = root;
       if(temp.right == null){
           return Rootvalue;
       } else if(temp == null){
           return temp.value;
       } else {
           while(temp.right != null){
               temp = temp.right;
           }
           return temp.value;
       }
    }

    public int findLowestValue(int Rootvalue){
        Node temp = root;
        if(temp.right == null){
            return Rootvalue;
        } else if(temp == null){
            return temp.value;
        } else {
            while(temp.left != null){
                temp = temp.left;
            }
            return temp.value;
        }
    }
}
