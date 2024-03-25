
public class DynamicArrayDemo 
{
    public static void show(){

        // ArrayList<String> list = new ArrayList<>();
        // list.add("Gilberto");
        // list.add("Josélia");
        // list.add("João");
        // list.add("Anna");
        // list.add("Raimundo");
        // list.add("Alan");

        // System.out.println("Prints the list:");
        // System.out.println(list);

        var dynamicArray = new DynamicArray(5);

        System.out.println(dynamicArray.capacity);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");
        dynamicArray.add("H");
        dynamicArray.add("I");
        dynamicArray.add("J");
        dynamicArray.add("K");
        // System.out.println("dynamicArray.insert(0, \"X\")");
        // dynamicArray.insert(0, "X");
        // System.out.println(dynamicArray);
        
        // System.out.println("dynamicArray.delete(\"A\")");
        // dynamicArray.delete("A");
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");
        dynamicArray.delete("E");
        dynamicArray.delete("F");


        System.out.println(dynamicArray);
        System.out.println("dynamicArray.size() : " + dynamicArray.size );
        System.out.println("dynamicArray.capacity() : " + dynamicArray.capacity );

        System.out.println("dynamicArray.isEmpty(): "+ dynamicArray.isEmpty());


        System.out.println("dynamicArray.search(\"B\"): " + dynamicArray.search("B"));

        



    }

}
