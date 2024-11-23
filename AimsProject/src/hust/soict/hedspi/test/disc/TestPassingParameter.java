package hust.soict.hedspi.test.disc;// Lê Quang Khải - 20225638

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {

        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		System.out.println("Sau khi swap\n");
		swap(jungleDVD, cinderellaDVD);

	    System.out.println("Jungle title: "+ jungleDVD.getTitle()+"\n");
	    System.out.println("Cinderella title: "+ cinderellaDVD.getTitle()+"\n");

//        System.out.println("Sau khi goi change title\n");
//	    changeTitle(jungleDVD, cinderellaDVD.getTitle());
	    System.out.println("Jungle title: "+ jungleDVD.getTitle()+"\n");
//       Le Quang Khai - 20225638
        System.out.println("Sau khi goi ham correct swap\n");
        correctSwap(jungleDVD, cinderellaDVD);

        System.out.println("Jungle title: "+ jungleDVD.getTitle()+"\n");
        System.out.println("Cinderella title: "+ cinderellaDVD.getTitle()+"\n");
    }

    //correct swap
    public static void correctSwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String oldTitle = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(oldTitle);
    }

    public static void swap(Object o1,Object o2) {
        Object tmp=o1;
        o1=o2;
        o2=tmp;
    }

    public static void changeTitle(DigitalVideoDisc disc,String title) {
        String oldTitle = disc.getTitle();
        disc.setTitle(title);
        disc = new DigitalVideoDisc(oldTitle);
    }

}
