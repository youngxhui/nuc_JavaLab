class Frequency {
public:
    int getFrequency(vector<string> article, int n, string word) {
        int j=0;
        for(int i=0;i<n;i++){
            if(word==article[i]){
                j++;
            }
        }
        return j;
    }
};
