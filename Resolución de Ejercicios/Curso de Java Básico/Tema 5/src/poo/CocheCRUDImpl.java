package poo;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save() {
        System.out.println("Método save ejecutando");
    }

    @Override
    public void findAll() {
        System.out.println("Método findAll ejecutando");

    }

    @Override
    public void delete() {
        System.out.println("Método delete ejecutando");

    }
}
