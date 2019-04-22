#include<iostream>
#include<cstdio>
#include<algorithm>
using namespace std;

int main(){
    int n, k, m;
    scanf("%d%d%d", &n, &k, &m);
    double score[10005];
    for (int i = 0; i < n; i++) {
        int single[15];
        for (int j = 0; j < k; j++) {
            scanf("%d", &single[j]);
        }
        sort(single, single+k);
        double sum = 0;
        for (int j = 1; j < k-1; j++) {
            sum += single[j];
        }
        score[i] = sum / (k-2);
    }
    
    sort(score, score+n);
    
    for (int i = n-m; i < n; i++) {
        if (i > n - m) {
            printf(" ");
        }
        printf("%.3f", score[i]);
    }
}

