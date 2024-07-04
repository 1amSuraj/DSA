class Solution {
public:
    ListNode* mergeNodes(ListNode* head) {
        ListNode* curr = head->next;
        ListNode* prevZero = head;
        int sum = 0;
        while(curr != nullptr){
            if(curr->val == 0){
                prevZero->val = sum;
                prevZero->next = curr;
                prevZero = curr;
                sum = 0;
            }
            sum += curr->val;
            curr = curr->next;
        }
        curr = head;
        while(curr->next->val !=0){
            curr = curr->next;
        }
        curr->next = nullptr;
        return head;   
    }
};
