public interface LinkedList{
    void add(int data);
    void print();
    boolean contains(int data);
    boolean isEmpty();
    long size();
    void insert(int data, int position);
    void remove(int position);
    int get(int position);
}
