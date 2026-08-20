# def count_down(n):
#     if n==0:
#         return
#     print(n)
#     count_down(n-1)
# count_down(5)

# using loop
# for i in range(5,0,-1):
#     print(i)


# factorial
# def factorial(n):
#     if n==1:
#         return 1
#     return n*factorial(n-1)
# print(factorial(5))

# def number(n):
#     if n==0:
#         return
#     number(n-1)
#     print(n)
# number(5)
   
    
# sum
# def sum_num(n):
#     sum=0
#     if n<=0:
#         return 0
#     return n+sum_num(n-1)
# print(sum_num(5))

# def fibonacci(n):
#     if n<=0:
#         return 0
#     if n==1:
#         return 1
#     return fibonacci(n-1)+fibonacci(n-2)
# terms=8
# for i in range(terms):
#     print(fibonacci(i),end=" ")
# def smallest(n):
#     if n<10:
#         return n

#     current = n % 10
#     previous = smallest(n // 10)

#     if current < previous:
#         return current
#     else:
#         return previous


# print(smallest(58321))


# def count(n,target):
#     if n<10:
#         return n
#     current=n%10
#     remaining=n//10
#     if current==target:
#        return 1+count(remaining,target)
#     else:
#         return count(remaining,target)
# print(count(12233,3))

# def product(n):
#     if n<10:
#         return n
#     current=n%10
#     return current*product(n//10)
# print(product(1234))

# def gcd(a,b):
#     if b==0:
#         return a
#     return gcd(b,a%b)
# print(gcd(48,18))




        
        
        
        
    

    