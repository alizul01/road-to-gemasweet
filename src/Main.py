from cv2 import exp


def mysteryRecursive(str, s, e):
    if (s == e):
        return True
    
    if (str[s] != str[e]):
        return False
    
    if (s < e + 1):
        return mysteryRecursive(str, s + 1, e - 1)
    
    return True

def expr():
    p = True
    q = False
    
    print(
        "Percobaan 1 : ",not ((p and q)) or ( ( not p ) or (p and ( not q ) ) )
        # (False or (True or (False and True)))
        # (False or (True or False))
        # (False or True)
        # True
        # False
    )
    
    print(
        "Percobaan 2 : ",
        not ((p and q) or ((not p) or (p and (not q))))
    )

def mystery(str):
    n = len(str)
    
    if (n == 0):
        return True
    
    return mysteryRecursive(str, 0, n - 1)

def mystery(a, b):
    m = 0
    
    if (a != b):
        print("GDSC2022")
        m = (a + b) / 2
        mystery(a, m)
        mystery(m, b)

def main():
    
    expr()

main()