#include <stdio.h>
#include <stdlib.h>
typedef struct stack{
    int top;
    int size;
    int *arr;
}stack;

stack *create(int size)
{
    stack *s = (stack*)malloc(sizeof(stack));
    s->size = size;
    s->arr = (int*)malloc(size* sizeof(int));
    s->top = -1;
    return s;
}
stack *push(stack *s,int val)
{
    if(s->top == (s->size)-1)
        printf("Stack Overflow\n");
    else
        s->arr[++(s->top)] = val;
    return s;
}
stack *pop(stack *s)
{
    if(s->top == -1)
        printf("Stack Underflow\n");
    else
    {
        printf("%d is popped\n",s->arr[s->top]);
        s->top = s->top - 1;
    }
        return s;
}
void disp(stack *s)
{
    int i;
    if(s->top == -1){
        printf("Stack is empty\n");
    }
    else{
    for(i=s->size;i>=0;i--)
        printf("%d\n",s->arr[i]);
    }
}

int main()
{
    int s=0,n=0;
    printf("Enter the size\n");
    scanf("%d",&s);
    stack *a = create(s);
    int ch=1;
    while(ch!=4)
    {
        printf(" 1. Push\n 2. Pop\n 3. Display\n 4. Exit\n");
        scanf("Enter your choice:\n");
        switch(ch)
        {
            case 1: printf("Enter the value to be pushed\n");
                    scanf("%d",&n);
                    a = push(a,n);
                    break;
            case 2: a = pop(a);
                    break;
            case 3: disp(a);
                    break;
            case 4: break;
            default: printf("Wrong choice!!\n");
        }
    }
}
