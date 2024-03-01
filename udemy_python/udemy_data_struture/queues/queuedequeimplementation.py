from queues import queue1, deque1
class QueueDQImplemenation(object):

    def queueImpl1(self):
        q1 = queue1.Queue()
        print(q1.is_empty())
        q1.enque(1)
        q1.enque(3)
        q1.enque(5)
        q1.display()
        print(q1.peek())
        print(q1.dequeue())
        print(q1.size())
        q1.dequeue()
        q1.dequeue()
        # q1.dequeue() exception

    def dequeImpl1(self):
        d = deque1.Dequeue()
        print(d.is_empty())
        d.add_front(1)
        d.add_front(2)
        d.add_front(4)
        print(d.peek_Front())  # 4
        d.add_rear(6)
        d.add_rear(7)
        d.add_rear(8)
        print(d.peek_rear())
        print(d.remove_front())  # 4
        print(d.remove_rear())  # 8
        print(d.display())  # [7, 6, 1, 2]
        print(d.size())