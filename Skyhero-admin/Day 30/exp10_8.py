s = {2,34,5,25634,6534,5,3,24,1,24321,421,4}

s.add(55)
print("Added 55 to set:", s)
t = s.copy()
print("Copied to t:", t)
t = s.pop()
print("Pop:", s, t)
s.remove(6534)
print("Removed 6534:",s)
s.clear()
print("Cleared:", s)