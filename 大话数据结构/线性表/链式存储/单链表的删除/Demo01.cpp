
Status ClearList(LinkList *L){
    LinkList p,q;
    q = (*L)->next;
    while(q){
     p = q->next;
     free(q);
     q = p;
    }
    (*L)->next = NULL;
    return OK;
}
