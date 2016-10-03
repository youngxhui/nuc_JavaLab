const int MAXSIZE = 1000;

typedef struct {
    ElemType data;
    int cur;
}Component,StaticLinkList[MAXSIZE];

Status InitList(StaticLinkList space){
    int i;
    for(i = 0;i < MAXSIZE - 1;i ++){
        StaticLinkList[i].cur = i + 1;
    }
    StaticLinkList[i] = 0;
    return OK;
}

//插入操作
int Malloc_SLL(StaticLinkList space){
    int i = space[0].cur;
    if(space[0].cur){//判断是否为空链表；
        space[0].cur = space[i].cur;
    }
    return i;
}
//两结点间插入
Status ListInsert(StaticLinkList L,int i,ElemType e){
    int j,k,l;
    k = MAXSIZE - 1;
    if(i < 1||i > ListLength(L) + 1){
        return ERROR;
    }
    j = Malloc_SSL(L);
    if(j){
        L[j].data = e;
        for(l = 1;l < MAXSIZE - 1;l ++){
            k = L[k].cur;
        }
        L[j].cur = L[k].cur;
        L[k].cur = j;
        return OK;
    }
    return ERROR;
}
//删除操作
Status ListDelete(StatusLinkList L,int i){
    int j,k;
    if(i < 1||i > ListLength(L)){
        return ERROR;
    }
    K = MAXSIZE - 1;
    for(j = 1;j < i - 1;j ++){
        k = L[k].cur;
    }
    j = L[k].cur;
    L[k].cur = L[j].cur;
    Free_SSL(L,i);
    return OK;
}

void Free_SSL(StaticLinkList space,int k){
    space[k].cur = space[0].cur;
    space[0].cur = k;
}
//判断长度
int ListLength(StaticLinkList L){
    int j = 0;
    int i = L[MAXSIZE-1].cur;
    while(i){
        i = L[i].cur;
        j ++;
    }
    return j;
}





