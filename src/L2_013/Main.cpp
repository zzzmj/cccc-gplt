#include<cstdio>
#include<iostream>
#include<algorithm>
using namespace std;
int n, m;
int G[510][510];
bool vis[510]; 

void dfs(int node) {
    vis[node] = true;
    for (int i = 0; i < n; i++) {
        if (vis[i] == false && G[node][i] == 1) {
            dfs(i);
        }
    }
}

int count() {
    int cnt = 0;
    fill(vis, vis+510, false);
    for (int i = 0; i < n; i++) {
        if (vis[i] == false) {
            dfs(i);
            cnt++;
        }
    }
    return cnt;
}

int main() { 
    scanf("%d%d", &n, &m);
    for (int i = 0; i < m; i++) {
        int a, b;
        scanf("%d%d", &a, &b);
        G[a][b] = G[b][a] = 1;
    }
    
    int start = count();
    int k;
    scanf("%d", &k);
    for (int i = 0; i < k; i++) {
        int ki;
        scanf("%d", &ki);
        for (int i = 0; i < n; i++) {
            if (G[ki][i] == 1) {
                G[ki][i] = G[i][ki] = 0;
            }
        }
        int res = count();
        if (start == res || start+1 == res) {
            printf("City %d is lost.\n", ki);
        } else {
            printf("Red Alert: City %d is lost!\n", ki);
        }
        start = res;
        if (i == n-1) {
            printf("Game Over.\n");    
        }
    }
}