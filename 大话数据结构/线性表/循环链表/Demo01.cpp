
p = rearA->next;//保存A的头结点；
rearA->next = rearB->next->next;//B的第一个结点非B的头结点；
q=rearB->next;
rearB->next = p;
free(q);


