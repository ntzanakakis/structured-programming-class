/*-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_*/
/*-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_2013030066-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_*/
#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

struct list 
{
    int value;
    struct list *next;
};

void FindLastOdd2(struct list *a, int i , struct list **ptr,int j);

int main ()
{ 
struct list *curr , *head , *ptr1,*ptr,*returned; 
int FLAG,i,j,given; //i=amount of user elements , j=counter
char answer; //for new list question
j=0;
FLAG = TRUE;  
head = NULL;  
while (FLAG) // stops when answer = 'n' (see below)
{
    printf ("Posa stoixeia 8a exei h lista?\n");
    if (scanf(" %d",&i) != 1)                  //if letter
      {
          printf ("That's not a number!\n");
          printf ("Exiting...\n");
          system ("PAUSE");
          return -1;
      }
      if (i<0)
      {
          do
          {
              printf ("Only positive number.\n");
              if (scanf(" %d",&i) != 1)                  //if letter
              {
                  printf ("That's not a number!\n");
                  printf ("Exiting...\n");
                  system ("PAUSE");
                  return -1;
              }
          }
          while (i<0);
      }
    for (j=0;j<i;j++)
    {
        curr = (struct list*)malloc(sizeof(struct list)); // allocate memory
        printf("Give value %d.\n", j+1);
        scanf(" %d", &given);  
        curr->value = given; //insert new elements in list
        curr->next = head;
        head = curr;
    }
    ptr1 = head;
    j=1; //initialize counter
    FindLastOdd2(ptr1 , i , &ptr,j); 
    if(ptr==0)
    printf("%d\n", ptr);                      //print node
    else
    printf("%d\n",ptr->value);
    free(curr);
    printf ("Insert new list?(y/n)\n");
    do
    {
        scanf (" %c", &answer);     
        if (answer == 'n')
        {
            FLAG = FALSE;
        }
        else if (answer != 'y' && answer != 'n')
        {
            printf("Only 'y' or 'n'.\n");
        }
      }
      while (answer != 'y' && answer != 'n');
}
system ("PAUSE");
}



/*------------------------------------------------------------------------------------function------------------------------------------------------------------------------------*/



void FindLastOdd2(struct list *a, int i , struct list **ptr,int j)
{
struct list *curr;
int b;
if (i==0) // if no number is given
{
    printf ("Den bre8hke perritos ari8mos.\n");
    b=0;
    *ptr = 0;
}
else if ((a->value)%2==1 || (a->value)%2==-1) //if goal is met
{
    printf("Found final odd number %d.\n" ,a->value);
    *ptr = a;
}
else                                         //move list and recursion
{
    j++;
    a = a->next;
    FindLastOdd2(a,i,ptr,j);
}
}















