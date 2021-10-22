/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedtest;

/**
 *
 * @author KHELLO
 */
public class DoublylinkedTEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DoublyLinkedListt test = new DoublyLinkedListt();

        test.insertLast(10);
        test.insertLast(20);
        test.insertLast(30);
        test.insertLast(40);
        test.insertLast(50);
        test.insertLast(60);
        test.deleteNode(60);
        test.display();

        test.deleteNode(20);
        test.display();

        test.InsertAfter(30, 70);
        test.display();

        test.deleteNode(40);
        test.display();

        test.deleteNode(50);
        test.display();

        test.insertLast(50);
        test.display();

        test.insertLast(40);
        test.display();

    }

}
