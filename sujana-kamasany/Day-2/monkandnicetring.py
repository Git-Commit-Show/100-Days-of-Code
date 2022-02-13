#Monk and nice string code from HACKERANK
arr = []
n = int(input())
for _ in range(n):
    arr.append(input())
for i in range(n):
    count = 0
    for j in range(0, i, +1):
        if arr[j] < arr[i]:
            count += 1
    print(count)
