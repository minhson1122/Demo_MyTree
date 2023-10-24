import javax.xml.soap.Node;

public class Mytree {
   public node Root;

    public Mytree() {
        this.Root = null;
    }
    public node insert(Integer value){
        node nodes = new node(value);
         node currentNode = this.Root;
         if (currentNode == null){
             this.Root = nodes;
         }else {
             node previous = currentNode;
             while (currentNode != null){
                 previous = currentNode;
                 if (currentNode.data > value){
                     currentNode = currentNode.left;
                 }else {
                     currentNode = currentNode.right;
                 }
             }
             if (previous.data > value){
                 previous.left = nodes;
             }else {
                 previous.right = nodes;
             }
         }
         return this.Root;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void readTree(node parent){
        if (parent == null){
            return;
        }
        System.out.println(parent.data);
        this.readTree(parent.left);
        this.readTree(parent.right);
    }
}
