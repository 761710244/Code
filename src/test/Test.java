package test;

public class Test {

    public static void main(String[] args) {
        String tag = "StorageLog_12863781";
        System.out.println(tag);
        tag = tag.contains("StorageLog_") ? tag.split("_")[0] : tag;
        System.out.println(tag);
    }
}
