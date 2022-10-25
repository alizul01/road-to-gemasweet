#include <stdio.h>
#include <string.h>


int main() {
    char input[16];
    char ans[10];
    int lengthAns;
    scanf("%s", input);
    lengthAns = strlen(input);

    if (lengthAns == 1) {
        strcpy(ans, "satuan");
    } else if (lengthAns == 2) {
        strcpy(ans, "puluhan");
    } else if (lengthAns == 3) {
        strcpy(ans, "ratusan");
    } else if (lengthAns == 4) {
        strcpy(ans, "ribuan");
    } else if (lengthAns == 5) {
        strcpy(ans, "puluhribuan");
    }

    printf("%s", ans);
    return 0;
}