public class Tree {

    protected static class Node {
        protected int data;
        protected Node leftChild;
        protected Node rightChild;

        public Node(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }

    }

}
