#include<cstdio>
#include<iostream>
#include<queue>
#include<vector>
using namespace std;
struct Node {
    int data;
    Node* left;
    Node* right;
};

void createTree(Node* &root, int* pre, int* mid, int len) {
    if (len == 0) {
        root = NULL;
        return ;
    }
    int v = pre[0];
    int pos = 0;
    while(mid[pos] != v) pos++;
    root = new Node;

    root -> data = v;
    createTree(root->left, pre+1, mid, pos);
    createTree(root->right, pre+pos+1, mid+pos+1, len-pos-1);
}

void midOrder(Node* root) {
    if (root == NULL) {
        return ;
    }
    midOrder(root -> left);
    printf("%d ", root -> data);
    midOrder(root -> right);
}

void bfs(Node* root, vector<int> &v) {
    queue<Node*> q;
    q.push(root);
    while (!q.empty()) {
        Node* t = q.front();
        q.pop();
        v.push_back(t -> data);
        if (t -> right != NULL) {
            q.push(t->right);
        }
        
        if (t -> left != NULL) {
            q.push(t->left);
        }
    }
}

int main() {
    int pre[105], mid[105];
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &mid[i]);
    }
    for (int i = 0; i < n; i++) {
        scanf("%d", &pre[i]);
    }
    
    Node* root;
    createTree(root, pre, mid, n);
    vector<int> v;
    bfs(root, v);
    
    for (int i = 0; i < v.size(); i++) {
        if (i == 0) {
            printf("%d", v[i]);
            continue;
        }
        printf(" %d", v[i]);
    }
}