#creating a simple Linked list with 3 nodes

class Student:
    def __init__(self, data):
        self.data = data
        self.next = next #initialize next as null

class Node_Object:
    def __init__(self):
        self.head = None

if __name__ == 'main':
    l_list = Node_Object()

    l_list.head= Student(1)
    l_list_2 = Student(2)
    l_list_3 = Student(3)

    l_list.head.next = l_list_2
    l_list_2.next = l_list_3

    
        