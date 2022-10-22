#traversing a linked list with 3 nodes

class Student:
    def __init__(self , data) -> None:
        self.data = data
        self.next = None

class Node_Object:
    def __init__(self) -> None:
        #create head
        self.head = None

        #print linked list block
        def print_ll(self):
            temp = self.head
            while(temp):
                print(temp.data)
                temp = temp.next

if __name__ == '__main__':
 
    # Start with the empty list
    llist = Node_Object()
 
    llist.head = Student(1)
    second = Student(2)
    third = Student(3)
 
    llist.head.next = second  # Link first node with second
    second.next = third  # Link second node with the third node
 
    llist.printList()
        