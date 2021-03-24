def factorial(n):
       if(n==0 or n==1):
              return 1
       if(n<0):
              print("invalid number")
              return
       return n * factorial(n-1)

print(factorial(int(input('Enter the values :'))))