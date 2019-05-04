#include<set>
#include<iostream>
#include<cstring>
#include<cstdio>
using namespace std;
int a[100005]; 
int main() {
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        int m;
        scanf("%d", &m);
        for (int j = 0; j < m; j++) {
            int t;
            scanf("%d", &t);
            if (m > 1) {
                a[t] = 1;
            }
        }
    }
    
    int k, j = 0, res[100005];
    scanf("%d", &k);
    set<int> s;
    for (int i = 0; i < k; i++) {
        int t;
        scanf("%d", &t);
        if (a[t] == 0 && s.find(t) == s.end()) {
            res[j++] = t;
            s.insert(t);
        }
    }
    
    if (j == 0) {
        printf("No one is handsome");
    }
    for (int i = 0; i < j; i++) {
        if (i != 0) {
            printf(" ");   
        }
        printf("%05d", res[i]);
    }
} 