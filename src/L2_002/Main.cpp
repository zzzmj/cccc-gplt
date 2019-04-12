#include<cstdio>
#include<cmath>
#include<iostream>
using namespace std;
struct node {
    int data;
    int next;
};
int vis[100005]; // 去重
int l1[100005], l2[100005]; // 记录两个链表地址  
node list[100005];
int main() {
    int head, n;
    scanf("%d%d", &head, &n);
    
    for (int i = 0; i < n; i++) {
        int t;
        scanf("%d", &t);
        scanf("%d%d", &list[t].data, &list[t].next);
    }
    
    int p1 = 0, p2 = 0;
    for (int i = head; i != -1; i = list[i].next) {
        int t = abs(list[i].data);
        if (vis[t] == 0) {
            vis[t] = 1;
            l1[p1++] = i;
        } else {
            l2[p2++] = i;
        }
    }

    for (int i = 0; i < p1; i++) {
        int pos = l1[i];
        if (i + 1 == p1) {
            printf("%05d %d -1\n", pos, list[pos].data);
        } else {
            printf("%05d %d %05d\n", pos, list[pos].data, l1[i+1]);
        }
        
    }
    for (int i = 0; i < p2; i++) {
        int pos = l2[i];
        if (i + 1 == p2) {
            printf("%05d %d -1\n", pos, list[pos].data);
        } else {
            printf("%05d %d %05d\n", pos, list[pos].data, l2[i+1]);
        }
    }
    return 0;
} 