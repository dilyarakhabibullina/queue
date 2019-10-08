package ru.itpark;

public class QueueService {
    private QueueElement first = null;
    private QueueElement last= null;
    private int size;

    public QueueElement getFirst() {
        return first;
    }

    public void setFirst(QueueElement first) {
        this.first = first;
    }

    public QueueElement getLast() {
        return last;
    }

    public void setLast(QueueElement last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addElement (QueueElement first){
        QueueElement ob = new QueueElement();
        ob.setNext(getFirst());
        if (first==null){
            first = ob;
        }

        if (first==null){
            first = ob;
        } else {last.setNext (ob);}
        last=ob;
        size++;





    }
    public int size(){
        return size;
    }
}
