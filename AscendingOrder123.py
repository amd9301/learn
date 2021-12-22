#Enter strings of numbers in the list
num=[]
l=[]
n=int(input("enter the size of the list"))
for i in range(n):
    l.append(input("Enter numbers"))
lista=['1','2','3']
res=[]
for i in l:
    count=0
    for j in lista:
        if(j in i):
            count+=1
    if(count==len(lista)):
        res.append(i)

print(sorted(res))
