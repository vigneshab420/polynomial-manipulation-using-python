class polynomial:
    def __init__(self,coeffs):
        self.coeffs=coeffs
    def evaluate(self,x):
        result=0
        for exp,coeff in self.coeffs.items():
            result+=coeff*(x**exp)
        return result
    def __add__(self,other):
        result_coeffs={}
        for exp,coeff in self.coeffs.items():
            result_coeffs[exp]=coeff
        for exp,coeff in other.coeffs.items():
            result_coeffs[exp]=result_coeffs.get(exp,0)+coeff
        return polynomial(result_coeffs)
    def __str__(self):
        terms=[]
        for exp,coeff in self.coeffs.items():
            if exp==0:
                term=str(coeff)
            elif exp==1:
                term=f"{coeff}x"
            else:
                term=f"{coeff}x^{exp}"
            terms.append(term)
        return "+".join(terms)
poly1=polynomial({2:3,1:2,0:5})
poly2=polynomial({2:2,1:-1,0:3})
print("polynomial 1:",poly1)
print("polynomial 2:",poly2)
sum_poly=poly1+poly2
print("sum:",sum_poly)
x_value=3
print("poly1:",poly1.evaluate(x_value))
print("poly2:",poly2.evaluate(x_value))
print("sum:",sum_poly.evaluate(x_value))
        
        
