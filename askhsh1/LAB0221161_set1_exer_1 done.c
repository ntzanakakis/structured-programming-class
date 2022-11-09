/*-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_TZANAKAKHS NIKOLAOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_*/
/*-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_2013030066-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_*/
#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

void FindSameDyad(int given[] , int j , int i ,int* returned);

int main ()
{
char confirm; // for inserting new array.
int FLAG,i,j,value,*returned; // returned = value returned from the void function , i = amount of elements , j = counter, value = dummy variable to initialize pointer
FLAG = TRUE;
printf("Purpose : Provide integers and find if\n2 pairs of numbers are repeated (example 2 4 2 4)\n");
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
      int given[i];
      printf ("Give numbers one by one.\n");
      for (j=0;j<i;j++)
      {
          scanf(" %d",&given[j]);
      }
      j=0;
      value = 0;
      returned = &value;  // initialize the return variable
      FindSameDyad(given , j ,i,returned);
     // printf ("%d \n" , *returned);
      printf ("Insert new array?(y/n)\n");
      do
      {
      scanf (" %c", &confirm);     
            if (confirm == 'n')
            {
                FLAG = FALSE;
            }
            else if (confirm != 'y' && confirm != 'n')
            {
                 printf("Only y or n accepter.\n");
            }
      }
      while (confirm != 'y' && confirm != 'n');
}
system ("PAUSE");
}
  
  
/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-Function-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/  
  
     
void FindSameDyad(int given[] , int j ,int i ,int* returned)
{
    if (given[j]==given[j+2] && given[j+1] == given[j+3]  && j+3 < i) // check if goal is met.
    {
        printf("Bre8hke Dyada '%d %d'\n" , given[j] , given[j+1]);
        *returned = j;
    }
    else if (i<4 || j+3 >= i)     //check if at least 4 elements (for pair of 2 numbers) and check array position (to stay in bounds)
    {
        printf ("No pair found\n");
        *returned = -1;
    }
    else 
    {
        j++; 
        FindSameDyad(given , j , i,returned); //recursion
    } 
}
