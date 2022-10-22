def rotate(list1):
    for i in range(len(list1)):
        for j in range(i+1,len(list1),1):
            list1[i][j] = list1[j][i]
    return list1

print(rotate(list1=[[1,2,3],[4,5,6],[7,8,9]]))
