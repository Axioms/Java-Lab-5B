public class Stack {

    int cap = 20;
    int length;
    StackNode top;

    public Stack() {
        length = 0;
    }

    public void push(String name, String color, Boolean canWashHighTemp) {

        StackNode temp = new StackNode(name, color, canWashHighTemp);

        if(top == null) {
            top = temp;
            length++;
        }   
        else {
            if(length < cap) {
                top.setNext(temp);
                temp.setPrev(top);
                top = temp;
                length++;
            }
            else {
                System.out.println( "\n" + "Max number of items have been reached could not add item " + temp.getName() + "\n");
            }
        }
    }

    public void pop() {
        if(top != null && top.getPrev() != null) {
            System.out.println( "\n" + peek());
            StackNode temp = top.getPrev();
            top.setPrev(null);
            top = temp;
            top.setNext(null);
            length--;
        }
        else if(top != null && top.getPrev() == null) {
            System.out.println( "\n" + peek());
            top = null;
            length--;
        }
        else {
            System.out.println( "\n" + "No elements in the Stack");
        }
    }

    public String peek() {
        if(top != null) {
            return "" + top;
        }
        else {
            return  "\nNo elements in the Stack";
        }
    }

    public String getItemsOfColor(String color) {
        String temp = "\n";

        StackNode cN = top;
        for(int i=0; i < length; i++) {
            if (cN.getColor().equals(color)) {
                temp = temp + cN.getName() + ", ";
            }
            cN = cN.getPrev();
        }

        if (temp.substring(temp.length() -2).equals(", ")) {
            temp = temp.substring(0, temp.length() -2);
        }

        return temp;
    }

    public String getCanBeWashedWithHotWater() {
        String temp = "\n";

        StackNode cN =  top;
        for(int i=0; i < length; i++) {
            if (cN.getCanWashHighTemp()) {
                temp = temp + cN.getName() + ", ";
            }
            cN = cN.getPrev();
        }

        if (temp.substring(temp.length() -2).equals(", ")) {
            temp = temp.substring(0, temp.length() -2);
        }

        return temp;
    }
}
