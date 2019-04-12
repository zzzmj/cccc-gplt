#include<cstdio>
#include<iostream>
#include<algorithm>
using namespace std;
struct node {
    int id;
    int cnt;
    double amount;
}p[10005];

bool cmp(node a, node b) {
    if (a.amount == b.amount) {
        if (a.cnt == b.cnt) {
            return a.id > b.id;    
        } else {
            return a.cnt < b.cnt; 
        } 
        
    } else {
        return b.amount < a.amount;    
    }
}

int main() { 
    int n;
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        p[i].id = i;
        int k, sum = 0;
        scanf("%d", &k);
        p[i].cnt -= k;
        for (int j = 0; j < k; j++) {
            int id, price;
            scanf("%d%d", &id, &price);
            p[id].amount += price;
            p[id].cnt++;
            sum += price;
        }
        p[i].amount -= sum;
    }
    
    sort(p+1, p+n+1, cmp);
    for (int i = 1; i <= n; i++) {
        printf("%d %.2lf\n", p[i].id, p[i].amount/100.0);
    }
}