public class QueueNode {
    private String name;
    private int calories;
    private int servings;
    QueueNode prev;
    QueueNode next;


    public QueueNode(String name, int calories, int servings) {
        this.name = name;
        this.calories = calories;
        this.servings = servings;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getServings() {
        return servings;
    }

    public QueueNode getNext() {
        return next;
    }

    public QueueNode getPrev() {
        return prev;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setPrev(QueueNode prev) {
        this.prev = prev;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    public int getTotalCal() {
        return calories * servings;
    }

    @Override
    public String toString() {
        return "\n" + "Name: " + name + "\n" + "Calories: " + calories + "\n" + "Servings: " + servings;
    }
}
