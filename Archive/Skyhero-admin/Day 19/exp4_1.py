# To check whether a given no is prime or not.
# Made by Nouman

def check_prime(n):
	for i in range(2,n):
		if (n%i)==0:
			return False
	return True

num=int(input("Enter the number: "))
if num==1:
	print(num,"is neither a prime nor a composite number")
elif check_prime(num):
	print(num,"is a prime number")
else:
	print(num,"is a composite number")