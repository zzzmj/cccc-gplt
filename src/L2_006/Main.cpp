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

void createTree(Node* &root, int* last, int* mid, int len) {
    if (len == 0) {
        root = NULL;
        return ;
    }
    int v = last[len-1];
    int pos = 0;
    while(mid[pos] != v) pos++;
    root = new Node;

    root -> data = v;
    createTree(root->left, last, mid, pos);
    createTree(root->right, last+pos, mid+pos+1, len-pos-1);
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
        if (t -> left != NULL) {
            q.push(t->left);
        }
        if (t -> right != NULL) {
            q.push(t->right);
        }
    }
}

int main() {
    int last[105], mid[105];
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &last[i]);
    }
    for (int i = 0; i < n; i++) {
        scanf("%d", &mid[i]);
    }
    
    Node* root;
    createTree(root, last, mid, n);
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