package com.hillel.IhorProkhorov.HomeTaskSeven;

public class Runner {

    public static void main(String[] args) {
        Seven seven = new Seven();
        seven.setSize(4);
        seven.setArray(new String[]{"0", "1", "2", "3"});
        seven.getSize();
        seven.addElement("4");
        for (String s: seven.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        seven.addElement("5");
        for (String s: seven.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        seven.deleteJelement(3);
        for (String s: seven.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        seven.addElement("0");
        for (String s: seven.getArray()
        ) {
            System.out.print(", " + s);
        }
        System.out.println();
        boolean s = seven.equals();
        System.out.println(s);

        seven.clearArray();

        if( seven.getSize() == 0 ){
            boolean flag = true;
            for (int i = 0; i < seven.getArray().length; i++){
                if (seven.getArray()[i] != null){
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("Array has been deleted");
        }
    }
}
