package org.akbar.app.action;

import org.akbar.app.service.TutorialFinderService;

public class TutorialAction {

    private  String bestStrutsTutorialSite;

    public String execute() {
        //find best struts tutorial on the web
        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        setBestStrutsTutorialSite(tutorialFinderService.getBestTutorialSite());
        return "success";
    }

    public String getBestStrutsTutorialSite() {
        return bestStrutsTutorialSite;
    }

    public void setBestStrutsTutorialSite(String bestStrutsTutorialSite) {
        this.bestStrutsTutorialSite = bestStrutsTutorialSite;
    }


}
