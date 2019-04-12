#include<iostream>
#include<cstdio>
#include<algorithm>
using namespace std; 
const int MAXN = 505;
const int INF = 1000000000;
int G[MAXN][MAXN]; 
bool vis[MAXN] = {false};
int d[MAXN]; // 记录最短距离 
int pre[MAXN]; // 记录路径
int num[MAXN]; // 记录最短路径条数

int weight[MAXN]; // 记录救援队数目
int w[MAXN]; // 记录最多救援队数量  
int n, m, s, e; // 城市个数, 边数, 起点, 终点 


void dijkstra(int s) {
    fill(d, d+MAXN, INF);
    fill(w, w+MAXN, 0);
    fill(num, num+MAXN, 0);
    d[s] = 0;
    w[s] = weight[s];
    num[s] = 1;
    for (int i = 0; i < n; i++) {
        // 找到最近的城市 
        int u = -1, min = INF;
        for (int j = 0; j < n; j++) {
            if (vis[j] == false && d[j] < min) {
                min = d[j];
                u = j;
            }
        } 

        if (u == -1) return ;
        vis[u] = true;
        for (int v = 0; v < n; v++) {
            if (vis[v] == false && G[u][v] != INF) {
                if (d[u] + G[u][v] < d[v]) {
                    d[v] = d[u] + G[u][v];
                    w[v] = w[u] + weight[v];
                    num[v] = num[u]; 
                    pre[v] = u; 
                } else if (d[u] + G[u][v] == d[v]) {
                    num[v] += num[u]; // 最短距离相同时累加 
                    if (w[u] + weight[v] > w[v]) {
                        w[v] = w[u] + weight[v];
                        pre[v] = u;
                    }
                }                
            }
        }
    }
}

void dfs(int s, int v) {
    if (s == v) {
        printf("%d", s);
        return ;
    }
    dfs(s, pre[v]);
    printf(" %d", v);
}

int main() {
    scanf("%d%d%d%d", &n, &m, &s, &e);
    for (int i = 0; i < n; i++) {
        scanf("%d", &weight[i]);
    }
    fill(G[0], G[0] + MAXN*MAXN, INF);
    int a, b, c;
    for (int i = 0; i < m; i++) {
        scanf("%d%d%d", &a, &b, &c);
        G[a][b] = c;
        G[b][a] = c;
    }
    dijkstra(s);
    printf("%d %d\n",num[e], w[e]);
    dfs(s, e);
    printf("\n");
    return 0;
}