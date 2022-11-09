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

void FindConsecutiveModulo(struct list *a, int i ,struct list ** returned,int j);

int main ()
{ 
struct list *curr , *head , *ptr,*returned; 
int FLAG,i,j,given;
char answer; //insert new array
j=0;
FLAG = TRUE;  
printf ("Purpose: find 2 consecutive number in a a list that have\nthe same division result with 7.\n");
head = NULL;  
while (FLAG)
{
    printf ("\How many elements?\n");
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
              printf ("Only positive numbers.\n");
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
        curr = (struct list*)malloc(sizeof(struct list));
        printf("Give value %d.\n", j+1);
        scanf(" %d", &given);
        curr->value = given;
        curr->next = head;
        head = curr;
    }
    ptr = head;
    j=1;  //initialize counter
    FindConsecutiveModulo(ptr , i , &returned,j);
    
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



/*<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>SYNARTHSH<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>*/




void FindConsecutiveModulo(struct list *a, int i , struct list **returned,int j)
{
struct list *curr;
int b;
if (i<2 || j+1>i)       // check to stay in bounds and if there are enough elements for our goal
{
     printf ("No pair found.\n");
     b=0;
     *returned = 0;
}
else if (((a->value)%7 == (a->next->value)%7 )&& i>=2) // check if goal is met
{
    printf("Bre8hke zeygari %d %d.\n" , a->next->value ,a->value); //print backwards because list elements where inserted in order
//    b = a->next->value;
    a = a->next;
    *returned = a;
}
else
{
    j++;
    a = a->next;
    FindConsecutiveModulo(a,i,returned,j); //recursion
}
}















