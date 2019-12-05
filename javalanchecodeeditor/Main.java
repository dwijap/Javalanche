public class Main {
    public static void main(String[] args) {
        new JavalancheCodeEditor();
        PrintClassLoader();
    }
    public static void PrintClassLoader() {
        System.out.println("Classloader of Main: "
                + Main.class.getClassLoader());

        System.out.println("Classloader of JavalancheCodeEditor: "
                + JavalancheCodeEditor.class.getClassLoader());

        System.out.println("Classloader of KeywordCounter: "
                + KeywordCounter.class.getClassLoader());
    }
}
