package view;

public class Bean {
    public Bean() {
    }
    public String cambek() {
        Main main = new Main();
        main.setParam1("cambek");
        return "goTo";
    }
    public String goPaje1() {
        Main main;
        main = new Main();
        main.setParam1("goPaje1");
        return "goTo";
    }
    public String goPaje2() {
        Main main;
        main = new Main();
        main.setParam1("goPaje2");
        return "goTo";
    }


    public String goToPage1() {
        Main main = new Main();
        main.setParam("goToPage1");
        return "goTo";
        
        
    }
    public String goToPage2() {
        Main main;
        main = new Main();
        main.setParam("goToPage2");
        return "goTo";
    }
    public String b2_action() {
        Main main;
        main = new Main();
        main.setParam1("pageStart");
        return "goTo";
    }
    public String b1_action() {
        Main main = new Main();
        main.setParam("pageStart");
        return "goTo";
    }
    public String goToOllProject() {
        Main main = new Main();
        main.setParam("goToOllProject");
        return "goTo";
    }
    public String returnToStart() {
        Main main = new Main();
        main.setParam("pageStart");
        return "goTo";
    }
    public String goToProject1() {
        Main main;
        main = new Main();
        main.setParam("goToProject1");
        return "goTo";
    }
    public String goToProject2() {
        Main main;
        main = new Main();
        main.setParam("goToProject2");
        return "goTo";
    }
    public String goToProject3() {
        Main main;
        main = new Main();
        main.setParam("goToProject3");
        return "goTo";
    }
    public String goToProject4() {
        Main main;
        main = new Main();
        main.setParam("goToProject4");
        return "goTo";
    }
    public String goToProject5() {
        Main main;
        main = new Main();
        main.setParam("goToProject5");
        return "goTo";
    }
}
