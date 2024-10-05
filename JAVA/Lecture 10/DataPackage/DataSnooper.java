package DataPackage;

import java.util.ArrayList;

public class DataSnooper {
    Data d = new Data();

    public void snoop() {
        System.out.println("Beginning DataPackage.Data");
        System.out.println(d.toString());

        // Problem 1
        System.out.println("Direct access");
        System.out.println("iValue = " + d.getiValue());
        System.out.println("sValue = " + d.getsValue());
        System.out.println("iList = ");
        for (int i=0; i < d.getiList().length; i++) {
            System.out.println(d.iList[i]);
        }

        // Problem 2
        System.out.println("Change the simple data");
        d.setiValue(-1);
        d.setsValue("Dog");
        d.setiListValue(0, 0);
        d.setiListValue(1, 0);
        d.setiListValue(2, 0);
        System.out.println(d.toString());

        // Problem 3
        System.out.println("Change the array");
        int[] mylist = {-1, -2, -3, -4, -5};
        d.setiList(mylist);
        System.out.println(d.toString());

        // Problem 4
        System.out.println("Change the ArrayList");
        ArrayList<Integer> yourlist = new ArrayList<>();
        yourlist.add(1000);
        d.setaList(yourlist);
        System.out.println(d.toString());

        // Problem 5
        Data newD = new Data(d);
        newD.setsValue("Cat");
        newD.cc.setCcString("Elephant");
        System.out.println(newD.toString());
        System.out.println(d.toString());

        DataPackage.ContainedClass x = new DataPackage.ContainedClass();
        x.setCcString("Gopher");
        d.setCc(x);
        System.out.println(d);
        System.out.println(newD);

        // Problem 7
        newD.setiValue(-2);
        newD.setsValue("This is a very very very very very very long string");
        int[] mylist2 = {10, 20, 20, 20, 20};
        newD.setiList(mylist2);

        int[] mylist3 = {10, 20, 30, 40};
        newD.setiList(mylist3);
    }
}
