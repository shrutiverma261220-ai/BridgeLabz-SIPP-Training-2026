interface RestaurantWorker {
    void performDuties();
}

class RestaurantPerson {
    String name;
    int id;

    RestaurantPerson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
    }
}

class RestaurantChef extends RestaurantPerson implements RestaurantWorker {

    RestaurantChef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef prepares delicious food.");
    }
}

class RestaurantWaiter extends RestaurantPerson implements RestaurantWorker {

    RestaurantWaiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter serves food to customers.");
    }
}

public class RestaurantManagementSystem {

    public static void main(String[] args) {

        RestaurantChef chef = new RestaurantChef("Rahul", 201);
        RestaurantWaiter waiter = new RestaurantWaiter("Amit", 202);

        System.out.println("Chef Details");
        chef.displayPerson();
        chef.performDuties();

        System.out.println();

        System.out.println("Waiter Details");
        waiter.displayPerson();
        waiter.performDuties();
    }
}