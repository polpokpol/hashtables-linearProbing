public class HashItem {
    
    public HashItem(int key, int value){
        this.key = key;
        this.value = value;
    }

    private int key;
    private int value;

    public int getKey() {
        return this.key;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    
}