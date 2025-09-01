#include<stdio.h>
void main(){
	int n,choice,i=1;
	printf("Enter a n number:-");
	scanf("%d",&n);
	
	while(1){
		printf("Enter a choice(1 to 6):-");
	    scanf("%d",&choice);
		if(choice==1){
		n%2==0?printf("Even \n"):printf("odd\n");
	}else if(choice==2){
		int i=2,flag=0;
		while(i<n){
			if(n % i==0){
				flag=1;
				printf("notprime\n");
				break;
			}
			i++;
		}
		if(flag==0){
			printf("prime\n");
		}
	}else if(choice==3){
		int rem,sum=0,temp=n,num=n;
		while(num>0){
			rem=num % 10;
			num = num/10;
			sum = sum * 10+rem;
		}
		temp == sum?printf("palindrome\n"):printf("not palindrome\n");
	}
	else if(choice == 4){
		if(n==0){
			printf("number is zero\n");
		}else if(n>0){
			printf("number is positive\n");
		}else{
			printf("number is negative\n");
		}
	}
	else if(choice == 5){
		int j=n,rem,rev=0;
		while(j>0){
			rem=j %10;
			j= j/10;
			rev = rev *10 +rem;
		}
		printf("Reverse of a number:- %d \n",rev);
	}
	else if(choice == 6){
		int rem,sum=0,u=n;
		while(u>0){
			rem=u%10;
			u = u/10;
			sum=sum+rem;
		}
		printf("sum:-%d \n ",sum);
	}else{
		printf("Invalid choice \n");
	}
	if(choice==0){
		break;
	}
}
}










