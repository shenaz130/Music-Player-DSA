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
public class DLLinkedList {

    private Node head;
     private Node prvs;
     private Node currnt;
     
     
    public Node getCurrnt() {
        return currnt;
    }

   
    public void setCurrnt(Node currnt) {
        this.currnt = currnt;
    }

     
    
    public Node getPrvs() {
        return prvs;
    }

    
    public void setPrvs(Node prvs) {
        this.prvs = prvs;
    }

    
     
    public Node getHead() {
        return head;
    }

   
    public void setHead(Node head) {
        this.head = head;
    }
   
   
    
    public void AddData(int data){
    
        if(getHead()==null){
            Node ob= new Node();
            setHead(ob);
            Node tmphead=getHead();
            tmphead.setData(data);
           
        }else{
        Node temp= new Node(); //create new node to begin of the list
        temp.setData(data);
        temp.setNext(getHead());
        getHead().setPrevious(temp);
            setHead(temp);
        
     }
    
    }
    
       public void Print(){
        Node temp=getHead();
        while(temp.getNext()!=null){
        System.out.println(temp.getData());
        temp=temp.getNext();
    
        }
        System.out.println(temp.getData());
    }
       
    
     public void delete(int data){
        Node temp=head;
        Node prvs= null;
        
        while (temp.getNext()!=null){
            if(temp.getData()==data){
              prvs.setNext(temp.getNext());
              temp= null;
              return;
            }
            prvs=temp;
            temp=temp.getNext();
         
     }
     if(temp.getData()==data){
         prvs.setNext(null);
         temp=null;
     }else{
         System.out.println("Not found");
     }
          
    }
     
     public Node PrintNext(){
         if(getCurrnt()==null){
             setCurrnt(head);
             return getCurrnt();
         }
        
          Node node=getCurrnt().getNext();
         
         
         if(node==null){
         return null;
         }else{
             setCurrnt(node);
         return node;
         }
     
     }
     
     public Node PrintPrevious(){
        if(getCurrnt().getPrevious()==null){
            return null;
        }else{
            Node temp=getCurrnt();
            setCurrnt(temp.getPrevious());
            return temp.getPrevious();
        }
        }
    
}
