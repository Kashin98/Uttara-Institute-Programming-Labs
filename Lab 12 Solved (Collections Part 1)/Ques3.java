public class Ques3 {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<String>();
        col.add("A");
        col.add("B");
        col.add("C");
        col.add("D");
//        System.out.println(col.contains("A"));
//        System.out.println(col.size());
//        col.remove("A");
//        col.remove("C");
//        System.out.println(col.isEmpty());
        Collection<String> col2 = new HashSet<>();
        col2.add("A");
        col2.add("D");
        col2.add("E");
        col2.add("F");

        col2.removeAll(col);
        for (String s : col2){
            System.out.println(s);
        }
    }
}