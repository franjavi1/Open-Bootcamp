package poo;

public class Main {
    public static void main(String[] args) {

        CocheCRUDImpl cocheCRUD2 = new CocheCRUDImpl();

        cocheCRUD2.save();
        cocheCRUD2.findAll();
        cocheCRUD2.delete();


    }
}
