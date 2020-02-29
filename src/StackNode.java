public class StackNode {
    private String name;
    private String color;
    private Boolean canWashHighTemp;
    private StackNode next;
    private StackNode prev;

    public StackNode(String name, String color, Boolean canWashHighTemp) {
        this.name = name;
        this.color = color;
        this.canWashHighTemp = canWashHighTemp;
    }

    public Boolean getCanWashHighTemp() {
        return canWashHighTemp;
    }

    public StackNode getNext() {
        return next;
    }

    public StackNode getPrev() {
        return prev;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    public void setCanWashHighTemp(Boolean canWashHighTemp) {
        this.canWashHighTemp = canWashHighTemp;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrev(StackNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Color: " + color + "\n" + "Can wash with Hot water: " + canWashHighTemp;
    }
}
