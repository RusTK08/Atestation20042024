public class Controller { // ПЕРЕДАЁШЬ ДАННЫЕ ИЗ ПРЕЗЕНТ В МОДУЛЬ ЗДЕСЬ 
    //И ЦЕПОЧКУ ДЕЙСТВИЙ СТРОИШЬ ЗДЕСЬ, И В МАЙНЕ ВЫЗЫВАЕШЬ КОНТРОЛЛЕР
    private Present p;
    private Model m;
    //private String [] s4;
    public Controller() {
        
        p = new Present();
        
        //m.s4 = p.FamilyNameYearPol();
        m = new Model(p.FamilyNameYearPol());
        // this.s4 = s4;
    //     dvij();
    // }
    // public void dvij(){
        
    //     m.writer(p.FamilyNameYearPol());
    // }
}
}
