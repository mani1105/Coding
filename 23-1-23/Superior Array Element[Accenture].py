arr=list(map(int, input().split()))
l=len(arr)
list=[]
for i in range(0,l ):
        for j in range(i+1,l):
            if arr[i]<=arr[j]:
                break
        if j == l-1:
            list.append(arr[i])
print (len(list))
