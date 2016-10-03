#include <stdio.h>
const int MAXSIZE = 20;
const int OK = 1;
const int ERROR = 0;
const int TRUE = 1;
const int FALSE = 0;

typedef int ElemType;
typedef int Status;

typedef Struct {
    ElemType data[MAXSIZE];
    int length;
}sqList;

Status GetElem(sqList L,int i,ElemType *e){
    if(L.length ==0||i < 1||i > L.length){
        return ERROR;
    }
    *e = L.data[i-1];
    return OK;
}

Status ListInsert (SqList *L;int i;ElemType e){

    if(i <= 0||i > L.length||L.length == 0||L.length == MAXSIZE){
        return ERROR;
    }
    int j;
    if(i != L.length)
    for(j = L.length;j > i-1;j --){
        L--> data[j] = L--> data[j-1];
    }
    L--> data[j] = e;
    L--> length++;
    return OK;
}
Status ListDelete (SqList *L;int i;ElemType *e){
    if(i < 1||i > L-->length||L-->length == 0){
        return ERROR;
    }
    *e = L-->data[i-1];
    if(i < L-->length)//如果不是最后位置；
    for(int j = i-1;j < L-->length - 1;j ++){//前移；
        L-->data[j] = L-->data[j+1];
    }
    L-->length--;
    return OK;
}





















