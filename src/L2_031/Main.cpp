#include<iostream>
#include<cstdio>
#include<queue>
#include<vector>
using namespace std;
vector<int> adj[100005];
bool vis[100005];
int n;
int maxv = -1;
int value = 0;
struct node {
    int v;
    int cnt;
};

void BFS(int u) {
    queue<node> q;
    node s;
    s.v = u; s.cnt = 0;
    vis[u] = true;
    q.push(s);
    while(!q.empty()) {
        node t = q.front();
        q.pop();
        if (t.cnt > maxv) {
            maxv = t.cnt;
            value = t.v;
        }
        int u = t.v;
        for (int i = 0; i < adj[u].size(); i++) {
            int v = adj[u][i];
            int cnt = t.cnt + 1;
            if (vis[v] == false) {
                vis[v] = true;
                node ns;
                ns.v = v; ns.cnt = cnt;
                q.push(ns);
            }
        }
    }
}

int main() {
    int degree[100005];
    fill(degree, degree+100005, 0);
    fill(vis, vis+100005, false);
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        int k;
        scanf("%d", &k);
        for (int j = 0; j < k; j++) {
            int t;
            scanf("%d", &t);
            degree[t]++;
            adj[i].push_back(t);
        }
    }
    // 找入口
    for (int i = 1; i <= n; i++) {
        if (degree[i] == 0) {
            BFS(i);
            break;
        }
    } 
    printf("%d\n", value);
} 