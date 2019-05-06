#include<set>
#include<iostream>
#include<cstring>
#include<cstdio>
using namespace std;
int main() {
    int a[105][105], b[105][105];
    int ra, ca;
    scanf("%d%d", &ra, &ca);
    for (int i = 0; i < ra; i++) {
        for (int j = 0; j < ca; j++) {
            scanf("%d", &a[i][j]);
        } 
    }
    
    int rb, cb;
    scanf("%d%d", &rb, &cb);
    for (int i = 0; i < rb; i++) {
        for (int j = 0; j < cb; j++) {
            scanf("%d", &b[i][j]);
        } 
    }
    
    if (ca != rb) {
        printf("Error: %d != %d", ca, rb);
    } else {
        printf("%d %d\n", ra, cb);
        for (int i = 0; i < ra; i++) {
            for (int k = 0; k < cb; k++) {
                int sum = 0;
                for (int j = 0; j < ca; j++) {
                    sum += a[i][j] * b[j][k];
                }
                if (k != 0) {
                    printf(" ");
                }
                printf("%d", sum);
            } 
            printf("\n");
        }
    }
} 