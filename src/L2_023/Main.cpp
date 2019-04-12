#include<stdio.h>
#include<set>
#include<iostream>
using namespace std;
int G[510][510];
int vis[510];
int main() {
    int v, e, k;
    scanf("%d%d%d", &v, &e, &k);
    for (int i = 0; i < e; i++) {
        int a, b;
        scanf("%d%d", &a, &b);
        G[a][b] = 1;
        G[b][a] = 1;
    }
    
    int n;
    scanf("%d", &n);
    while(n--) {
        set<int> set;
        fill(vis, vis+510, 0);
        for (int i = 1; i <= v; i++) {
            scanf("%d", &vis[i]);
            set.insert(vis[i]);
        }
        int cnt = set.size();
        if (cnt != k) {
            printf("No\n");
        } else {
            bool flag = true;
            for (int i = 1; i <= v; i++) {
                for (int j = 1; j <= v; j++) {
                    // i顶点与其他相邻顶点颜色相同则标记为false
                    if (G[i][j] == 1 && vis[i] == vis[j]) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                printf("Yes\n");
            } else {
                printf("No\n");
            }
        }
    }
}
