a=int(input("enter the price :"))
d=0
if(a>=300):
       d=30/100

elif(a>=200):
       d=20/100

elif(a>100):
       d=10/100

else:
       print ("no discount")

r=a*(1-d)
print("total price :",r)