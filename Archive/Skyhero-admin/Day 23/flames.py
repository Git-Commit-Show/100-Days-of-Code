def flames(name1,name2):
newName1=[i for i in name1.lower()]
newName2=[i for i in name2.lower()]
results=[
"Friend",
"Love",
"Affection",
"Marriage",
"Enemy",
"Siblings"]
for i in name1.lower():
if(i in (newName1 and newName2)):
newName1.remove(i)
newName2.remove(i)
remainingLetters=len(newName1+newName2)
while len(results)>1:
index=(remainingLetters%len(results))-1
results.pop(index)
if(index>0):
results=results[index: ] + results[ :index]

return results[0]
n1=input("Enter name 1: ")
n2=input("Enter name 2: ")
print("FLAMES RESULT :",flames(n1, n2))