#include <stdlib.h>//随机函数的头文件；

void CreatLinkList(LinkList *L,int n){
    LinkList p;//声明一个指针；
    int i;//计数；
    srand(time(0));//初始化随机种子；
    *L = (LinkList)malloc(sizeof(Node));
    (*L)->next = NULL;
    for(i = 0;i < n;i ++){
        p = (LinkList)malloc(sizeof(Node));
        p->next = (*L)->next;
        p->data = rand()%100 + 1;
        (*L)->next = p;
    }


}
