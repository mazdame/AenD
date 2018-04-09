package com.company;

public class QueueTest {
    public static class Main {

        public static void main(String[] args) {
            testQueue(1, 2, 3, 4, 5);
            testQueue("first", "second", "third");
        }

        private static <T> void testQueue(T... elements) {
            outputLine("testing a Queue<%s>", getClassOf(elements));
            Queue<T> queue = new Queue<T>();
            outputSize(queue);
            enqueueElementsInto(queue, elements);
            outputSize(queue);
            loopOverAllElementsOf(queue);
            dequeueAllFrom(queue);
            outputSize(queue);
            outputLine("---");
        }

        private static <T> void outputSize(Queue<T> queue) {
            outputLine("empty: %s, size: %s elements", queue.isEmpty(), queue.size());
        }

        private static <T> void enqueueElementsInto(Queue<T> queue, T... elements) {
            outputLine("enqueueing: ");
            for (T element : elements) {
                queue.enqueue(element);
                output(element + " ");
            }
        }

        private static <T> void loopOverAllElementsOf(Queue<T> queue) {
            outputLine("Queue contains: ");
            for (T element : queue) {
                output(element + " ");
            }
        }

        private static <T> void dequeueAllFrom(Queue<T> queue) {
            outputLine("dequeueing: ");
            while (!queue.isEmpty()) {
                T next = queue.peek();
                T dequeued = queue.dequeue();
                outputLine("expected: %s ", next);
                output("dequeued: %s ", dequeued);
            }
        }

        private static void outputLine(String format, Object... params) {
            output('\n' + format, params);
        }

        private static void output(String format, Object... params) {
            System.out.print(String.format(format, params));
        }

        private static <T> String getClassOf(T... elements) {
            String nameOfArray = elements.getClass().getSimpleName();
            return nameOfArray.substring(0, nameOfArray.length() - 2);
        }
    }
}
