#include "TreeNode.h"
#include <queue>
TreeNode<int> *takeInput()
{
    int data;
    cin>>data;
    if(data == 0)
       return NULL;
    TreeNode<int> *root = new TreeNode<int>(data);
    queue<TreeNode<int>*> q;
    q.push(root);
    while(!q.empty())
    {
        int n = q.size();
        while(n--)
        {
        TreeNode<int> *front = q.front();
        q.pop();
        int noOfChildrens;
        cin >> noOfChildrens;
        for(int i=0;i<noOfChildrens;i++)
           {
            int childNodeData;
            cin >> childNodeData;
            TreeNode<int> *child = new TreeNode<int>(childNodeData);
            front->children.push_back(child);
            q.push(child);
           } 
        }
    }
    return root;   

}
void printLevelWise(TreeNode<int> *root){
    if(root == NULL){
        return;
    }
    queue<TreeNode<int>*> q;
    q.push(root);
    while(!q.empty())
    {
        int n = q.size();
        while(n--)
        {
            TreeNode<int> *front = q.front();
            q.pop();
            cout << front->data << " ";
            int totChildren = front->children.size();
            for(int i = 0;i < totChildren; i++){
                q.push(front->children[i]);
            }
        }
        cout << endl;
    }
}
int maximumEle(TreeNode<int> *root)
{
    if(root == NULL)
    {
        return -1;
    }
    static int Maximum = INT_MIN;
    if(root->data>Maximum)
    {
        Maximum = root->data;
    }
    for(int i=0;i<root->children.size();i++)
    {
        maximumEle(root->children[i]);
    }
    return Maximum;


}
int main()
{   TreeNode<int> *root = takeInput();
    printLevelWise(root);
    int MAX = maximumEle(root);
    cout << MAX ;


}