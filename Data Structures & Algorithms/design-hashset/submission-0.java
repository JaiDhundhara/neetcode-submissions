class MyHashSet {
    private int numb;
    private LinkedList<Integer>[]buc;
    public MyHashSet() {
        numb=1009;
        buc=new LinkedList[numb];
        for(int i=0;i<numb;i++){
            buc[i]=new LinkedList<>();
        }
    }
    private int hash(int key) {
        return key % numb;
    }
    public void add(int key) {
        int indx=hash(key);
        if(!buc[indx].contains(key)){
            buc[indx].add(key);
        }
    }
    
    public void remove(int key) {
        int indx=hash(key);
        buc[indx].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int indx=hash(key);
        return buc[indx].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */