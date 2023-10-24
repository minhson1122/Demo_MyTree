// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Mytree tree = new Mytree();
        tree.insert(10);
        tree.insert(6);
        tree.insert(7);
        tree.insert(13);
        tree.insert(19);
        tree.readTree(tree.Root);
    }
}