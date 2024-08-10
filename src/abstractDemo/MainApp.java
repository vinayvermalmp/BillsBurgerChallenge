package abstractDemo;

public class MainApp {
    public static void main(String[] args) {
        final MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        final SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        final String stringData = "5 7 3 9 8 2 1 0 4 6";

        String [] data = stringData.split(" ");
        for(final String s: data) {
            list.addItem(new Node(s));
            tree.addItem(new Node(s));
        }

        System.out.println("------------------");
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());
        System.out.println("------------------");

        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("9"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("8"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("6"));
        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());



    }
}
