package core;

public class TestBoolMemory {
    /**
     * 
     */
    public TestBoolMemory() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BookMemory bookMemory = new BookMemory();
        // set data
        bookMemory.setData();
        // a.
        if (bookMemory.checkExists(3443)) {
            System.out.println("Exists");
        } else {
            System.out.println("Not Exists");
        }
        //b.
        if (bookMemory.checkExists("Jack")) {
            System.out.println("Exists");
        } else {
            System.out.println("Not Exists");
        }
        //
        System.out.println(bookMemory.showPhoneNumber("Tina"));
       
        // show Joy's phone numner
        System.out.println("Joy's phone numner: "+ bookMemory.showPhoneNumber("Joy"));

        //
        bookMemory.list();
    }
}
