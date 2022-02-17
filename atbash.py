def atbash(s):

    upper = []
    lower = []
    for i in range(65, 91):
        upper.append(chr(i))
    for i in range(97, 123):
        lower.append(chr(i))
    revupper=upper[::-1]
    revlower=lower[::-1]

    out = ""
    for i in s:
        if i.isupper():
            ind = upper.index(i)
            out+=revupper[ind]
        elif i.islower():
            ind = lower.index(i)
            out+=revlower[ind]
        else:
            out+=i
    return out


print(atbash("apple"))
print(atbash("Hello world!"))
print(atbash("Christmas is the 25th of December"))
