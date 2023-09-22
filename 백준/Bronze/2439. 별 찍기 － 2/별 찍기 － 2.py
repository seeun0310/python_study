a = int(input())
b = a
c = 1

while a > 0 :
    while b >= 1 :
        print(" "*(b-1)+"*"*c)
        b -= 1
        c += 1
    a -= 1