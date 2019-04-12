#include<cstdio>
#include<set>
#include<vector>
#include<iostream>
using namespace std;
int main() {
    int n;
    scanf("%d", &n);
    vector<set<int> > arr;
    for(int i = 1; i <= n; i++) {
        int k;
        scanf("%d", &k);
        set<int> s;
        for (int j = 0; j < k; j++) {
            int t;
            scanf("%d", &t);
            s.insert(t);
        }
        arr.push_back(s);
    }
    
    int m;
    scanf("%d", &m);
    for (int i = 0; i < m; i++) {
        int a, b;
        scanf("%d%d", &a, &b);
        a--, b--; // -1, 因为下标是从0开始的 
        set<int>::iterator it;
        double nc = 0, nt = 0;
        for (it = arr[a].begin(); it != arr[a].end(); it++) {
            if (arr[b].find(*it) != arr[b].end()) {
                nc++;
            }
        }
        nt = arr[a].size() + arr[b].size() - nc;
        printf("%.2lf%%\n", nc/nt*100);
    }
} 