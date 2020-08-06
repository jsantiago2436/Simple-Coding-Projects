'''
8-Queens Problem using Python Code
@author: Jonathan Santiago
August 6th, 2020
'''

def printBoard(q, s):
    print("Solution #" + str(s))
    for i in range(8): print(q[i] + 1, end = " ")
    print()
    for i in range(8):
        for j in range(8):
            if q[j] == i: print("*", end = " ")
            else: print("X", end = " ")
        print()
    print()

def ok(q, c):
    for i in range(c):
        if q[c] == q[i] or abs(q[c] - q[i]) == c - i: return False
    return True

def main():
    c = 0
    s = 1
    q = []
    for i in range(8): q.append(0)
    while c >= 0:
        c += 1
        if c == 8:
            printBoard(q, s)
            s += 1
            c -= 1
        else: q[c] = -1
        while c >= 0:
            q[c]+= 1
            if q[c] == 8: c -= 1
            elif ok(q, c): break

main()
