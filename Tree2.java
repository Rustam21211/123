//import ru.arhiser.stack
//import
public class Tree2 {
    public static void main(String[] args) {
        Tree root =
                new Tree(20, new Tree(7,
                        new Tree(4, null, new Tree(6)), new Tree(9)),
        new Tree(35,
                        new Tree(31, new Tree(28), null)),
                        new Tree(40, new Tree(38), new Tree(52)));

        System.out.println("          52");
        System.out.println("      40");
        System.out.println("          38");
        System.out.println("  35");
        System.out.println("");
        System.out.println("      31");
        System.out.println("          28");
        System.out.println("");
        System.out.println("20");
        System.out.println("");
        System.out.println("");
        System.out.println("      9");
        System.out.println("");
        System.out.println("  7");
        System.out.println("          6");
        System.out.println("      4");
        System.out.println("");
    }



    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }

        public Tree(int i, Tree tree) {
        }

        public Tree(int i, Tree tree, Tree tree1, Tree tree2) {
        }
    }

}
