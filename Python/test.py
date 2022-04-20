a = ["apple", "banana", "cherry"]
b = ("apple", "banana", "cherry")
c = range(6)
d = {"name" : "john", "age" : 25}
e = {"apple", "banana", "cherry"}
f = frozenset({"apple", "banana", "cherry"})
g = True
h = b"hello"
i = bytearray(3)
j = memoryview(bytes(6))
k = -7587678587
l = 35e4
m = """ efaehjae """
str1 = "Hello World!"



def myFunc():
    x = "local"
    print("Python is : " + x)
myFunc()

print("testing")

print(type(a)) 
print(type(b))
print(type(c))
print(type(d))
print(type(e))
print(type(f))
print(type(g))
print(type(h))
print(type(i))
print(type(k))
print(type(l))
print(type(m))

print(str1[2:5])
print(str1[:5])
print(str1.upper())
print(str1.strip())
print(str1.replace("H", "Z"))

import random
print(random.randrange(1, 10))