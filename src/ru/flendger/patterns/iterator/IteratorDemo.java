package ru.flendger.patterns.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        MyIterator<Integer> myIterator = myList.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
//        myIterator.next(); //exception
        System.out.println();

        myIterator = myList.iteratorDesc();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}
