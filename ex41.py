class Queue:
    def __init__(self):
        self.queue=[]
    def is_empty(self):
        return len(self.queue)==0
    def enqueue(self,item):
        self.queue.append(item)
    def dequeue(self):
        if self.is_empty():
            return IndexError("queue is empty")
        return self.queue.pop(0)
    def peek(self):
        if self.is_empty():
            raise IndexError("queue is empty")
        return self.queue[0]
    def size(self):
        return len(self.queue)
q=Queue()
q.enqueue(10)
q.enqueue(20)
q.enqueue(30)
print("Queue after enqueuing elements:",q.queue)
print(" Dequeued elements:",q.dequeue())
print("Queue after dequeuing elements:",q.queue)
print("front elements:",q.peek())
print("Queue size:",q.size())

