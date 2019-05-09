#include <cstdio>
#include <iostream>
#include <cstring>
#include <queue>
#include <vector>
using namespace std;
struct people {
    int id, level;
};
vector<people> adj[100005];
vector<people> list;
bool vis[100005] = { false };

int BFS(int u) {
    queue<people> q;
    vis[u] = true;
    people s;
    s.id = u;
    s.level = 0;
    q.push(s);
    int maxlevel = 0;
    while(!q.empty()) {
        people e = q.front();
        if (e.level > maxlevel) {
            maxlevel = e.level;
        }
        q.pop();
        for (int i = 0; i < adj[e.id].size(); i++) {
            int id = adj[e.id][i].id;
            if (vis[id] == false) {
                people temp;
                temp.id = id;
                temp.level = e.level + 1;
                q.push(temp);
                list.push_back(temp);
            }
        }
    }
    return maxlevel;
}

int main() {
    int n;
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        int t;
        scanf("%d", &t);
        people temp; 
        temp.id = i;
        if (t == -1) {
            t = 0;
        }
        adj[t].push_back(temp);
    }
    int maxlevel = BFS(0);
    printf("%d\n", maxlevel);
    bool flag = false;
    for (int i = 0; i < list.size(); i++) {
        if (list[i].level == maxlevel) {
            if (flag) {
                printf(" ");
            }
            printf("%d", list[i].id);
            flag = true;
        }
    }
}