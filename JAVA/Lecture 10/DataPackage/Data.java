package DataPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    int iValue = 10;
    String sValue = "a string";
    int[] iList = {12, 15, 20};
    ArrayList<Integer> aList = new ArrayList<>();
    DataPackage.ContainedClass cc = new DataPackage.ContainedClass();

    Data() {
        for (int i=0; i<iList.length; i++) {
            aList.add(iList[i]);
        }
        cc.setCcString("a contained string");
    }

    Data(Data d) {
        this.iValue = d.iValue;
        this.sValue = d.sValue;
        this.iList = d.iList;
        this.aList = d.aList;
        this.cc  = d.cc;
    }

    @Override
    public String toString() {
        return "DataPackage.Data{" +
                "iValue=" + iValue +
                ", sValue='" + sValue + '\'' +
                ", iList=" + Arrays.toString(iList) +
                ", aList=" + aList +
                ", cc = " + cc.getCcString() +
                '}';
    }

    public void setiValue(int iValue) {
        if (iValue < 0) {
            System.out.println("iValue must be positive");
            return;
        }
        this.iValue = iValue;
    }

    public void setsValue(String sValue) {
        if (sValue.length() > 10) {
            System.out.println("sValue must have a maximum of 10 characters");
            return;
        }
        this.sValue = sValue;
    }

    public void setiList(int[] iList) {
        if (iList.length > 4 ) {
            System.out.println("iList must have a maximum of 4 entries");
            return;
        } else if (Arrays.stream(iList).anyMatch(i -> i < 10 || i > 20)) {
            System.out.println("iList must have values between 10 and 20");
            return;
        }
        this.iList = iList.clone();
    }

    public void setiListValue(int index, int value) {
        if (index < 0 || index >= iList.length) {
            System.out.println("Index out of bounds");
            return;
        }
        this.iList[index] = value;
    }

    public void setaList(ArrayList<Integer> aList) {
        this.aList = new ArrayList<>(aList);
    }

    public void setCc(DataPackage.ContainedClass cc) {
        DataPackage.ContainedClass new_cc = new DataPackage.ContainedClass();
        new_cc.setCcString(cc.getCcString());
        this.cc = new_cc;
    }

    public int getiValue() {
        return iValue;
    }

    public String getsValue() {
        return sValue;
    }

    public int[] getiList() {
        return iList;
    }

    public ArrayList<Integer> getaList() {
        return aList;
    }

    private void elif(boolean anyMatch) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
