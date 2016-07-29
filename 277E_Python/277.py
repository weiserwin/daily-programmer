def gcd(a,b):
    return gcd(b,a%b) if b else a

def simplify(num, den):
        g = gcd(num,den)
        print(num/g, den/g)

simplify(4, 8)
simplify(1536, 78360)
simplify(51478, 5536)
simplify(46410, 119340)
simplify(7673, 4729)
simplify(4096, 1024)
