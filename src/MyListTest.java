
public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>();
        myList.add("java");
        myList.add("c++");
        myList.add("c#");
        myList.add("java");

        System.out.println("Cac phan tu co strong myList: ");
        for (int i = 0; i < myList.size(); i++) System.out.println(myList.get(i));
//        for (String i : myList) System.out.println(i);

        myList.clear();
        System.out.println("Cac phan tu sau khi clear: " + myList.size());
    }

}