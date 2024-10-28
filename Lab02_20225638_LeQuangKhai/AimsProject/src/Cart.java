public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int numberOfItemsOrdered = 0;
    // thêm 1 đĩa mới vào cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(this.numberOfItemsOrdered == 0) {
            this.itemsOrdered[0] = disc;
            this.numberOfItemsOrdered++;
            System.out.println("Le Quang Khai - 20225638 - The disc: " + disc.getTitle() + " has been added");
        }
        else if(this.numberOfItemsOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("Le Quang Khai - 20225638 - The cart is full");
        }
        else{
            this.itemsOrdered[this.numberOfItemsOrdered] = disc;
            this.numberOfItemsOrdered++;
            System.out.println("Le Quang Khai - 20225638 - The disc: " + disc.getTitle() + " has been added");
        }
    }

    // xoá 1 đĩa trong cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.numberOfItemsOrdered == 0) {
            System.out.println("Le Quang Khai - 20225638 - The cart is empty now so cannot remove any discs");
        } else {
            // Kiem tra disc có tồn tại k
            for (int i = 0; i < this.numberOfItemsOrdered; ++i) {
                // nêú tồn tại thì xoá và in tbao
                if (this.itemsOrdered[i].equals(disc)) {
                    for (int j = i; j < this.numberOfItemsOrdered; ++j) {
                        this.itemsOrdered[j] = this.itemsOrdered[j + 1];
                    }
                    this.numberOfItemsOrdered--;
                    System.out.println("The disc " + disc.getTitle() + " has been removed from the cart");
                    break;
                }
                if(i==this.numberOfItemsOrdered-1) {
                    //Neu khong co dia can xoa thi in ra thong bao
                    System.out.println("The disc " + disc.getTitle() + " doesn't exist in the cart");
                }
            }

        }
    }

    // Tinh tong gia tri cart
    public float totalCost() {
        float cost = 0f;
        for (int i = 0; i < this.numberOfItemsOrdered; ++i) {
            cost += this.itemsOrdered[i].getCost();
        }
        return cost;
    }

    // In ra toan bo thong tin ve cart gom cac dia trong cart va tong tien
    public void  printAllDisc() {
        System.out.println("Le Quang Khai - 20225638  ");
        System.out.println("\n----------CART----------");
        System.out.println("Ordered Items:");
        for (int i = 0; i < this.numberOfItemsOrdered ; i++) {
            System.out.println((i + 1) + ". " + this.itemsOrdered[i].getTitle());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("--------------------------");
    }
}
