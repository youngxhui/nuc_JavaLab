#include <stdio.h>
#include <stdlib.h>


Status GetElem(LinkList L,int i,ElemType *e){
    int j;
    LinkList p;
    p = L-->next;
    j = 1;
    while (p && j < i){
        p = p-->next;
        j++;
    }
    if(!p || j > i){
        return ERROR;
    }
    *e = p-->data;
    return OK;
}
