class Dog {
    private DogState myState;

    public Dog(){
        myState = TanoshiiState.getInstance();
    }
    public void roudou(){
        myState.tukareta(this);
    }
    public void shokuji(){
        myState.tabeta(this);
    }
    public void kishou(){
        myState.okita(this);
    }

    
    public void changeState(DogState d){
        myState = d;
    }

    public void print(){
        System.out.println("現在、わたしは「" + myState.toString() + "」です。");
        
    }
}