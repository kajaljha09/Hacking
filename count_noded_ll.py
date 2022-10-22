#program to count number of nodes in a singly linked list

class node:
    def __init__(self , data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    #insert a new node at the starting
    def new_node_1(self , new_data):
        new_node = node(new_data)
        new_node.next = self.head
        self.head = new_node

    def count_nodes(self):
        #point temp at header
        temp = self.head
        count = 0 

        while(temp):
            count = count + 1
            temp = temp.next
        return count

if __name__ == '__main__':
    llist = LinkedList()
    llist.new_node_1(1)
    llist.new_node_1(2)
    llist.new_node_1(3)
    llist.new_node_1(4)
    llist.new_node_1(5)
    print("number of nodes = " , llist.count_nodes())

        



        