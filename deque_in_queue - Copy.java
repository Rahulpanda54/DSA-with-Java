import java.util.ArrayDeque;
class deque_in_queue{
    public static void main(String[] args) {
        ArrayDeque<Integer>st = new ArrayDeque<>();
        st.offer(1);
        st.offer(2);
        st.offer(3);
        st.offer(4);
        st.offer(5);
        System.out.println(st);
        st.poll();
        st.poll();
        System.out.println(st);
        // (offer) me tail aage shift hoti hai aur (poll) me head delete ho kar aage shift ho jata hai...
        System.out.println(st.remove());
        st.addFirst(0);
        st.addLast(99);
        System.out.println(st);
    }

}