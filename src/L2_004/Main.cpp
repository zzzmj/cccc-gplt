// 二叉搜索树判断 
#include<cstdio>
#include<vector>
#include<iostream>
using namespace std;
struct Node {
    int data;
    Node* left;
    Node* right;
};

void insert(Node* &root, int x) {
    if (root == NULL) {
        root = new Node;
        root -> data = x;
        root -> left = root -> right = NULL;
        return ;
    }
    
    if (x < root -> data) {
        insert(root->left, x);
    } else {
        insert(root->right, x);
    }
}

void preOrder(Node* root, vector<int> &pre) {
    if (root == NULL) {
        return ;
    }
    pre.push_back(root->data);
    preOrder(root -> left, pre);
    preOrder(root -> right, pre);
}

// 前序遍历镜像 
void preOrderM(Node* root, vector<int> &preM) {
    if (root == NULL) {
        return ;
    }
    preM.push_back(root->data);
    preOrderM(root -> right, preM);
    preOrderM(root -> left, preM);
}

void postOrder(Node* root, vector<int> &post) {
    if (root == NULL) {
        return ;
    }
    postOrder(root -> left, post);
    postOrder(root -> right, post);
    post.push_back(root->data);
}

// 镜像后序 
void postOrderM(Node* root, vector<int> &postM) {
    if (root == NULL) {
        return ;
    }
    postOrderM(root -> right, postM);
    postOrderM(root -> left, postM);
    postM.push_back(root->data);
}

int main() {
    Node* root = NULL;
    vector<int> orgin, pre, preM, post, postM;
    int n, arr[1005];
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        int t;
        scanf("%d", &t);
        orgin.push_back(t);
        insert(root, t);
    } 
    preOrder(root, pre);
    preOrderM(root, preM);
    postOrder(root, post);
    postOrderM(root, postM);
    
    if (orgin == pre) {
        printf("YES\n");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                printf("%d", post[i]);
                continue; 
            }
            printf(" %d", post[i]);
        }
        printf("\n");
    } else if (orgin == preM) {
        printf("YES\n");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                printf("%d", postM[i]);
                continue; 
            }
            printf(" %d", postM[i]);
        }
        printf("\n");
    } else {
        printf("NO\n");
    }
} 