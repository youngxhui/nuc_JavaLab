#include <stdlib.h>

void CreatLinkList(LinkList *L,int n){
    Linklist p,r;
    int i;
    srand(time(0));
    *L = (LinkList)malloc(Node);
    (*L)->next = NULL;
    r = *L;
    for(i = 0;i < n;i ++){
        p = (LinkList)malloc(sizeof(Node));
        p->data = rand()%100+1;
        r->next = p;
        r = p;
    }
    r->next = NULL;
}
