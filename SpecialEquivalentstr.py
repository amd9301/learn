num=[]
l=[]
n=int(input("enter the size of the list"))
for i in range(n):
    l.append(input("Enter numbers"))
s=[]
for i in l:
    s.append(list(set(i)))
print(s)
for i in l:
    count=0
    for j in range(len(l[0])):
        if(j in i):
            count+=1

