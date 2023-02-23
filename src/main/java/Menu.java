public class Menu {

    private MenuItem[] items;

    public Menu() {
        items = new MenuItem[] {
                new MenuItem("french fries" , 3.99),
                new MenuItem("garden salad", 8.99),
                new MenuItem("vegetable soup", 5.99)
        };
    }

    public MenuItem get(int i) {
        return null;
    }

    public MenuItem itemLookup(String name) {
        return null;
    }

    public boolean adjustPrice(int i, double amount) {
        return false;
    }

    public void displayMenuItems() {

    }

}
