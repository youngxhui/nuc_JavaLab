Status ListDelete(LinkList *L,int i,ElemType *e){
    int j;
    ListLink p,s;
    p = *L;
    j = 1;
    while(p->next && j < i){
        p = p->next;
        j++;
    }
    if(j > i || !p){
        return ERROR;
    }
    s = p->next;
    p->next = s->next;
    free(s);
    return OK;
}
