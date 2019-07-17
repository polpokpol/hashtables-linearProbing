public class Main{
    public static void main(String[] args) {
        
        HashTable hashTable = new HashTable();

        hashTable.put(1, 100);
        System.out.println();
        hashTable.put(2, 200);
        System.out.println();
        hashTable.put(3, 300);
        System.out.println();
        System.out.println(hashTable.get(3));
    }
}