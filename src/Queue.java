public class Queue {
    int length;
    int cap = 20;
    QueueNode head;
    QueueNode tail;

    public Queue() {
        length = 0;
    }

    public void enQueue(String name, int calories, int servings) {
        QueueNode temp = new QueueNode(name, calories, servings);
        if(length < cap) {
            if (head == null) {
                head = temp;
                tail = temp;
                head.setNext(tail);
                head.setPrev(tail);
                tail.setNext(head);
                tail.setPrev(head);
                length++;
            }
            else {
                temp.setPrev(tail);
                temp.setNext(head);
                tail.setNext(temp);
                tail = temp;
                head.setPrev(tail);
                length++;
            }
        }
        else {
            System.out.println( "\n" + "Max number of items have been reached could not add item " + temp.getName() + "\n");
        }
    }

    public void deQueue() {
        if(head != null && head != tail) {
            peek();
            QueueNode temp = head.getNext();
            head.setPrev(null);
            head.setNext(null);
            head = temp;
            head.setPrev(tail);
            length--;
        }
        else if(head != null && head == tail) {
            peek();
            head = null;
            tail = null;
            length--;
        }
        else {
            System.out.println("\n" + "Queue is empty");
        }
    }

    public void peek() {
        if(head != null) {
            System.out.println("\n" + head);
        }
        else {
            System.out.println("Queue is empty");
        }
    }

    public double getAvgCals() {
        int temp = 0;

        QueueNode cN = head;
        for(int i=0; i < length; i++) {
            temp = temp + cN.getCalories();
            cN = cN.getNext();
        }

        return ((double)temp/(double)length);
    }

    public String getHighestTotalCals() {
        int temp = 0;
        QueueNode cN = head;
        QueueNode bigest = null;

        for(int i=0; i < length; i++) {
            if(cN.getTotalCal() > temp) {
                bigest = cN;
                temp = cN.getCalories();
            }
            cN = cN.getNext();
        }
        return "\n" + cN.getName() + " has the most calories (" + bigest.getTotalCal() + ")";
    }

}
