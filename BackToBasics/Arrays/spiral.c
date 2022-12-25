#include<stdio.h>
void spiral(int n)
{
        int spiral_matrix[10][10];
        int row = 0,col = 0,i,boundary = n-1,increment = n-1,boundary_times=0,j;
        char move = 'r';
        for(i=1;i<=n*n;i++)
        {
                spiral_matrix[row][col] = i;
                switch(move)
                {
                        case 'r':col++;
                                 break;
                        case 'l':col--;
                                 break;
                        case 'u':row--;
                                 break;
                        case 'd':row++;
                }
                //check for boundary and change movement if needed
                if(boundary==i)
                {
                        //update boundary value
                        boundary+=increment;
                        boundary_times++;
                        //after even number of times boundary is checked
                        if(boundary_times%2==0)
                                increment--;
                        switch(move)
                        {
                                case 'r':move='d';
                                         break;
                                case 'd':move='l';
                                        break;
                                case 'l':move='u';
                                        break;
                                case 'u':move='r';
                                        break;
                        }
                }
        }
        for(i=0;i<=n-1;i++)
        {
                for(j=0;j<=n-1;j++)
                {
                        printf("%d\t",spiral_matrix[i][j]);
                }
                printf("\n");
        }
}
int main()
{
        int n;
        scanf("%d",&n);
        spiral(n);
        return 0;
}
