/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author Shenaz Buhari
 */
public class DoubleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DLLinkedList dls=new DLLinkedList();
       dls.AddData(1);
       dls.AddData(2);
       dls.AddData(3);
       dls.AddData(4);
       
       
       dls.Print();
       dls.delete(3);
       dls.Print();
        System.out.println("next");
        Node node=dls.PrintNext();
        while(node!=null){
            System.out.println(node.getData());
            node=dls.PrintNext();
        }
        System.out.println("prvs");
        Node prvs=dls.PrintPrevious();
        System.out.println(prvs.getData());
        System.out.println(dls.PrintPrevious().getData());
        
    
    }
    
}
