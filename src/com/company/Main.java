/*
     *
     * Classname: Main
     * @author Kirill Kryukov
     * @version 2020-06-21
     * JavaCollectionsFramework.
     *Task:
     * 1.  Create ArrayList and LinkedList containing  10 000 Integer elements. Compare time intervals.
     * 2. Insert  new 100 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
     * 3. Update 100 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
     * 4. Delete 100 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
     *
     * */
package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------------------------------Initialization of Lists-----------------------------------");

//-----------------------------------------Initialization of Lists-----------------------------------------------------

//-----------------------------------------Initialization of ArrayList-------------------------------------------------

        LocalDateTime arrayListStartOfInitialization = LocalDateTime.now();
        List<Integer>arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        LocalDateTime arrayListFinishOfInitialization = LocalDateTime.now();

        System.out.println("Initialization of ArrayList needs a " + ChronoUnit.MILLIS
                .between( arrayListStartOfInitialization, arrayListFinishOfInitialization) + " milliseconds.");

//---------------------------------------------Initialization of LinkedList--------------------------------------------

        LocalDateTime linkedListStartOfInitialization = LocalDateTime.now();
List<Integer>linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        LocalDateTime linkedListFinishOfInitialization = LocalDateTime.now();

        System.out.println("Initialization of LinkedList needs a " + ChronoUnit.MILLIS
        .between(linkedListStartOfInitialization,linkedListFinishOfInitialization) + " milliseconds.");


//--------------------------------------------Insert new 1000 elements at the begining---------------------------------


        System.out.println(System.lineSeparator() +"----------Insert new 1000 elements at the begining---------------");


//------------------------------Insert new 1000 elements at the begining of ArrayList----------------------------------


LocalDateTime arrayListStartIncertBegining = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(1,i);
        }
        LocalDateTime arrayListFinishIncertBegining = LocalDateTime.now();

        System.out.println("Array list for adding a 1000 elements at start needs a "+ ChronoUnit.MILLIS
                .between(arrayListStartIncertBegining,arrayListFinishIncertBegining)
                + " milliseconds.");


//------------------------------Insert new 1000 elements at the begining of LinkedList---------------------------------



        LocalDateTime linkedListStartIncertBegining = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(1,i);
        }
        LocalDateTime linkedListFinishIncertBegining = LocalDateTime.now();

        System.out.println("Linked list for adding a 1000 elements at start needs a "+ ChronoUnit.MILLIS
                .between(linkedListStartIncertBegining,linkedListFinishIncertBegining)
                + " milliseconds.");


//-------------------------------Insert new 1000 elements at the middle of List----------------------------------------


        System.out.println(System.lineSeparator()+"---------Insert new 1000 elements at the middle of List-----------");


//-------------------------------Insert new 1000 elements at the middle of ArrayList-----------------------------------


        LocalDateTime arrayListStartIncertMiddle = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(5050 + 1,i);
        }
        LocalDateTime arrayListFinishIncertMiddle = LocalDateTime.now();

        System.out.println("ArrayList for adding a 1000 elements at the midlle needs a "+ ChronoUnit.MILLIS
                .between(arrayListStartIncertMiddle,arrayListFinishIncertMiddle)+ " milliseconds.");


//-------------------------------Insert new 1000 elements at the middle of LinkedList----------------------------------


        LocalDateTime linkedListStartIncertMiddle = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(5050 + 1,i);
        }
        LocalDateTime linkedListFinishIncertMiddle = LocalDateTime.now();

        System.out.println("LinkedList for adding a 1000 elements at the midlle needs a "+ ChronoUnit.MILLIS
                .between(linkedListStartIncertMiddle,linkedListFinishIncertMiddle)+ " milliseconds.");


//-----------------------------Incert new 1000 elements at the end of Lists--------------------------------------------



        System.out.println(System.lineSeparator()+ "---------Incert new 1000 elements at the end of Lists------------");


//-------------------------------Incert new 1000 elements at the end of ArrayList--------------------------------------


LocalDateTime arrayListStartIncertEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        LocalDateTime arrayListFinishIncertEnd = LocalDateTime.now();

        System.out.println("ArrayList for adding a 1000 elements at the end needs a "+ ChronoUnit.MILLIS
                .between(arrayListStartIncertEnd,arrayListFinishIncertEnd)+ " milliseconds.");


//-------------------------------Incert new 1000 elements at the end of LinkedList-------------------------------------


LocalDateTime linkedListStartIncertEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        LocalDateTime linkedListFinishIncertEnd = LocalDateTime.now();

        System.out.println("LinkedList for adding a 1000 elements at the end needs a "+ ChronoUnit.MILLIS
                .between(linkedListStartIncertEnd,linkedListFinishIncertEnd)+ " milliseconds.");


//-------------------------------Update 1000 elements in the begining at the of List-----------------------------------


        System.out.println(System.lineSeparator()+"------------Update 1000 elements at the begining------------------");


//------------------------Update 1000 elements in the begining at the of ArrayList------------------------------------



        LocalDateTime arrayListStartUpdateBegining = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(i, i + 5);
        }
        LocalDateTime arrayListFinishUpdateBegining = LocalDateTime.now();

        System.out.println("ArrayList for update a 1000 elements at the begining needs a " + ChronoUnit.MILLIS
                .between(arrayListStartUpdateBegining, arrayListFinishUpdateBegining) + " milliseconds.");


//--------------------------Update 1000 elements in the begining at the of LinkedList----------------------------------


LocalDateTime linkedListStartUpdateBegining = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(i, i + 5);
        }
        LocalDateTime linkedListFinishUpdateBegining = LocalDateTime.now();

        System.out.println("LinkedList for update a 1000 elements at the begining needs a " + ChronoUnit.MILLIS
        .between(linkedListStartUpdateBegining,linkedListFinishUpdateBegining) +  " milliseconds.");


//-------------------------------Update 1000 elements in the middle at the middle of Lists-----------------------------


        System.out.println(System.lineSeparator()+"-------------Update 1000 elements at the middle-------------------");


//-------------------------------Update 1000 elements at the middle of ArrayList---------------------------------------


LocalDateTime arrayListStartUpdateMiddle = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(5000 + i , i + 5);
        }
        LocalDateTime arrayListFinishUpdateMiddle = LocalDateTime.now();

        System.out.println("ArrayList for update a 1000 elements at the middle needs a " + ChronoUnit.MILLIS
                .between(arrayListStartUpdateBegining,arrayListFinishUpdateBegining) +  " milliseconds.");


//-------------------------------Update 1000 elements at the middle of LinkedList--------------------------------------


LocalDateTime linkedListStartUpdateMiddle = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(5000 + i , i + 5);
        }
        LocalDateTime linkedListFinishUpdateMiddle = LocalDateTime.now();

        System.out.println("Linked List for update a 1000 elements at the middle needs a " + ChronoUnit.MILLIS
                .between(linkedListStartUpdateBegining,linkedListFinishUpdateBegining) +  " milliseconds.");


//-------------------------------Update 1000 elements in the end at the middle of Lists--------------------------------


        System.out.println(System.lineSeparator()+"---------------Update 1000 elements at the end--------------------");


//-------------------------------Update 1000 elements at the end of ArrayList------------------------------------------


LocalDateTime arrayListStartUpdateEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(arrayList.size() - 1000 + i , i + 5);
        }
        LocalDateTime arrayListFinishUpdateEnd = LocalDateTime.now();

        System.out.println("Array List for update a 1000 elements at the end needs a " + ChronoUnit.MILLIS
                .between(arrayListStartUpdateBegining,arrayListFinishUpdateBegining) +  " milliseconds.");


//---------------------------------Update 1000 elements at the end of LinkedList---------------------------------------


        LocalDateTime linkedListStartUpdateEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(arrayList.size() - 1000 + i , i + 5);
        }
        LocalDateTime linkedListFinishUpdateEnd = LocalDateTime.now();

        System.out.println("Linked List for update a 1000 elements at the end needs a " + ChronoUnit.MILLIS
                .between(linkedListStartUpdateBegining,linkedListFinishUpdateBegining) +  " milliseconds.");


//--------------------------------Remove 1000 elements at the begining of Lists----------------------------------------

        System.out.println(System.lineSeparator() + "---------Remove 1000 elemetns at the begining of Lists----------");


//--------------------------------Remove 1000 elements at the begining of ArrayList------------------------------------


        LocalDateTime arrayListStartRemoveBegining = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(i);
        }
        LocalDateTime arrayListFinishRemoveBegining = LocalDateTime.now();

        System.out.println("Array List for remove a 1000 elements at the begining needs a " + ChronoUnit.MILLIS
                .between(arrayListStartRemoveBegining,arrayListFinishRemoveBegining) +  " milliseconds.");


//--------------------------------Remove 1000 elements at the begining of LinkedList-----------------------------------


        LocalDateTime linkedListStartRemoveBegining = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(i);
        }
        LocalDateTime linkedListFinishRemoveBegining = LocalDateTime.now();

        System.out.println("Linked List for remove a 1000 elements at the begining needs a " + ChronoUnit.MILLIS
                .between(linkedListStartRemoveBegining,linkedListFinishRemoveBegining) +  " milliseconds.");


//--------------------------------Remove 1000 elements at the middle of Lists------------------------------------------

        System.out.println(System.lineSeparator() + "---------Remove 1000 elements at the middle of Lists------------");


//--------------------------------Remove 1000 elements at the middle of ArrayList--------------------------------------


        LocalDateTime arrayListStartRemoveMiddle = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(5000 + i);
        }
        LocalDateTime arrayListFinishRemoveMiddle = LocalDateTime.now();

        System.out.println("Array List for remove a 1000 elements at the middle needs a " + ChronoUnit.MILLIS
                .between(arrayListStartRemoveMiddle,arrayListFinishRemoveMiddle) +  " milliseconds.");


//--------------------------------Remove 1000 elements at the middle of LinkedList-------------------------------------


LocalDateTime linkedListStartRemoveMiddle = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(5000 + i);
        }
        LocalDateTime linkedListFinishRemoveMiddle = LocalDateTime.now();

        System.out.println("Linked List for remove a 1000 elements at the middle needs a " + ChronoUnit.MILLIS
                .between(linkedListStartRemoveMiddle,linkedListFinishRemoveMiddle) +  " milliseconds.");


//------------------------------------Remove 1000 elements at the end of Lists-----------------------------------------


        System.out.println(System.lineSeparator() + "-----------Remove 1000 elements at the end of Lists-------------");


//-----------------------------------Remove 1000 elements at the end of ArrayList--------------------------------------


LocalDateTime arrayListStartRemoveEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - 1000 + i);
        }
        LocalDateTime arrayListFinishRemoveEnd = LocalDateTime.now();

        System.out.println("Array List for remove a 1000 elements at the end needs a " + ChronoUnit.MILLIS
                .between(arrayListStartRemoveEnd,arrayListFinishRemoveEnd) +  " milliseconds.");


//--------------------------------Remove 1000 elements at the end of LinkedList----------------------------------------


LocalDateTime linkedListStartRemoveEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - 1000 + i);
        }
        LocalDateTime linkedListFinishRemoveEnd = LocalDateTime.now();

        System.out.println("Linked List for remove a 1000 elements at the end needs a " + ChronoUnit.MILLIS
                .between(linkedListStartRemoveEnd,linkedListFinishRemoveEnd) +  " milliseconds.");


//-----------------------------------------------------Time Intervals--------------------------------------------------
       /* ----------Initialization of Lists----------
                Initialization of ArrayList needs a 8 milliseconds.
                Initialization of LinkedList needs a 10 milliseconds.

                --------------Insert new 1000 elements at the begining---------------------
                Array list for adding a 1000 elements at start needs a 42 milliseconds.
                Linked list for adding a 1000 elements at start needs a 0 milliseconds.

                --------------Insert new 1000 elements at the middle of List---------------
                ArrayList for adding a 1000 elements at the midlle needs a 42 milliseconds.
                LinkedList for adding a 1000 elements at the midlle needs a 45 milliseconds.

                ---------------Incert new 1000 elements at the end of Lists----------------
                ArrayList for adding a 1000 elements at the end needs a 0 milliseconds.
                LinkedList for adding a 1000 elements at the end needs a 0 milliseconds.

                ----------------Update 1000 elements at the begining-----------------------
                ArrayList for update a 1000 elements at the begining needs a 1 milliseconds.
                LinkedList for update a 1000 elements at the begining needs a 0 milliseconds.

                -------------------Update 1000 elements at the middle----------------------
                ArrayList for update a 1000 elements at the middle needs a 1 milliseconds.
                Linked List for update a 1000 elements at the middle needs a 0 milliseconds.

                --------------------Update 1000 elements at the end------------------------
                Array List for update a 1000 elements at the end needs a 1 milliseconds.
                Linked List for update a 1000 elements at the end needs a 0 milliseconds.

                --------------Remove 1000 elemetns at the begining of Lists----------------
                Array List for remove a 1000 elements at the begining needs a 58 milliseconds.
                Linked List for remove a 1000 elements at the begining needs a 4 milliseconds.

                --------------Remove 1000 elements at the middle of Lists------------------
                Array List for remove a 1000 elements at the middle needs a 75 milliseconds.
                Linked List for remove a 1000 elements at the middle needs a 13 milliseconds.

                -----------------Remove 1000 elements at the end of Lists------------------
                Array List for remove a 1000 elements at the end needs a 0 milliseconds.
                Linked List for remove a 1000 elements at the end needs a 0 milliseconds.*/
    }
}



