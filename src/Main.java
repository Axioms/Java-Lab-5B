public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();

        stack.push("Item1", "RED", true);
        stack.push("Item2", "Blue", false);
        stack.push("Item3", "RED", false);
        stack.push("Item4", "Yellow", true);
        stack.push("Item5", "RED", true);
        stack.push("Item6", "BLUE", false);
        stack.push("Item7", "RED", true);
        stack.push("Item8", "RED", true);
        stack.push("Item9", "Pink", false);
        stack.push("Item10", "RED", false);
        stack.push("Item11", "RED", true);
        stack.push("Item12", "BLUE", false);
        stack.push("Item13", "RED", false);
        stack.push("Item14", "RED", false);
        stack.push("Item15", "RED", false);
        stack.push("Item16", "BLUE", true);
        stack.push("Item17", "RED", true);
        stack.push("Item18", "Green", false);
        stack.push("Item19", "RED", false);
        stack.push("Item20", "Blue", false);
        stack.push("Item21", "Green", true);

        System.out.println(stack.getItemsOfColor("Blue"));
        System.out.println(stack.getCanBeWashedWithHotWater());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        queue.enQueue("Item1", 20, 1);
        queue.enQueue("Item2", 524, 2);
        queue.enQueue("Item3", 45, 3);
        queue.enQueue("Item4", 4522, 54);
        queue.enQueue("Item5", 22250, 56);
        queue.enQueue("Item6", 220, 55);
        queue.enQueue("Item7", 524, 57);
        queue.enQueue("Item8", 453, 59);
        queue.enQueue("Item9", 25, 58);
        queue.enQueue("Item10", 456, 54);
        queue.enQueue("Item11", 468, 15);
        queue.enQueue("Item12", 456, 15);
        queue.enQueue("Item13", 20, 35);
        queue.enQueue("Item14", 645, 85);
        queue.enQueue("Item15", 555, 95);
        queue.enQueue("Item16", 25, 75);
        queue.enQueue("Item17", 528, 65);
        queue.enQueue("Item18", 89, 25);
        queue.enQueue("Item19", 120, 255);
        queue.enQueue("Item20", 130, 55);
        queue.enQueue("Item21", 140, 75);

        System.out.println("average calories in queue " + queue.getAvgCals());
        System.out.println(queue.getHighestTotalCals());

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.enQueue("Item21", 140, 75);
    }
}
