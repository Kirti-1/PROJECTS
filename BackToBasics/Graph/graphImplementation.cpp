#include <iostream>
#include <queue>
using namespace std;
// void print(int **edges, int v, int sv, bool *visited){
//     cout << sv << endl;
//     visited[sv] = true;
//     for(int i=0;i<v;i++){
//         if(sv == i){
//             continue;
//         }
//         if(edges[sv][i] == 1){
//             if(visited[i]){
//                 continue;
//             }
//             print(edges,v,i,visited);
//         }
//     }
// }
void print(int **edges, int v, int sv, bool *visited)
{
    queue<int> q;
    q.push(sv);
    visited[sv] = true;
    while (!q.empty())
    {
        int front = q.front();
        cout << front << " ";
        // visited[front] = true;
        q.pop();
        for (int i = 0; i < v; i++)
        {
            if (i == front)
            {
                continue;
            }
            if (edges[front][i] == 1)
            {
                if (visited[i])
                {
                    continue;
                }
                q.push(i);
                visited[i] = true;
            }
        }
    }
}
int main()
{
    // Write your code here
    int v, e;
    cin >> v >> e;
    int **edges = new int *[v];
    for (int i = 0; i < v; i++)
    {
        edges[i] = new int[v];
        for (int j = 0; j < v; j++)
        {
            edges[i][j] = 0; // there is no edge
        }
    }
    for (int i = 0; i < e; i++)
    {
        int fv, sv;
        cin >> fv >> sv;   // user input
        edges[fv][sv] = 1; // edge = true between fv and sv and thus sv and fv
        edges[sv][fv] = 1;
    }
    bool *visited = new bool[v];
    for (int i = 0; i < v; i++)
    {
        visited[i] = false;
    }
    print(edges, v, 0, visited);
    for (int i = 0; i < v; i++)
    {
        delete[] edges[i];
    }
    delete[] edges;
    delete[] visited;
    return 0;
}