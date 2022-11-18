package com.neolians.website.functions.pages;


import com.neolians.website.functions.general.Footer;
import com.neolians.website.repository.general.PageFooter;
import com.neolians.website.repository.general.PageMenu;
import com.neolians.website.repository.pages.*;
import com.neolians.website.repository.pages.PageNeoMobile;

public class Home {
    private Home() { throw new IllegalStateException("Utility class");}

    /**
     ************ Ouvre la page Home
     */
    public static void openPage() {
        PageHome.url.openUrl();
        PageMenu.neoliansLogo.assertPresent();


    }


    public static void verifyContenetPageHome() {

        /**
         * Verifier le titre et le paragraphe 1
         */

        //le titre
        PageHome.title.assertPresent();
        String contenuTitle= PageHome.title.getText();
        PageHome.title.assertEquals("Votre nouveau partenaire qualité est là !",contenuTitle);

        //Paragraphe1
        PageHome.paragraph1.assertPresent();
        String contenuParagraphe1= PageHome.paragraph1.getText();
        PageHome.paragraph1.assertEquals("neolians est votre partenaire de choix pour l’amélioration de la qualité logicielle, le test de vos logiciels , la mise en place de centres de test et la formation de vos équipes test."
                ,contenuParagraphe1);


        /**
         * Verifier le premier bouton "EN SAVOIR PLUS" et le titre "NosOffres"
         */


        // 1er Bouton en savoir plus
        PageHome.enSavoirPlus.assertPresent();
        PageHome.enSavoirPlus.click();

        //Le titre "Nos offres
        PageHome.titleNosOffres.assertPresent();
        String contenuTitle1 = PageHome.titleNosOffres.getText();
        PageHome.titleNosOffres.assertEquals("Nos offres",contenuTitle1);


        /**
         * verfier "neo.conseil" : image,titre,description,bouton "En savoir plus"
         */

    //image de neo.conseil
        PageHome.imageNeoConseil.assertPresent();


    //titre de neo.conseil
        PageHome.titleNeoConseil.assertPresent();
        String contenuTitle2 = PageHome.titleNeoConseil.getText();
        PageHome.titleNeoConseil.assertEquals("neo.conseil",contenuTitle2);



    //description de neo.conseil
        PageHome.descriptionNeoConseil.assertPresent();
        String description1=PageHome.descriptionNeoConseil.getText();
        PageHome.descriptionNeoConseil.assertEquals("Un accompagnement dans la mise en place, l’évolution et la performance de vos processus de test dans une optique d’amélioration continue et d’optimisation de coûts."
                , description1);



    //Bouton "EN savoir plus" de neo.conseil
        PageHome.ensavoirPlusNeoConseil.assertPresent();



        /**
         * verfier "neo.services": image,titre,description,bouton "En savoir plus"
         */


    //image de neo.services
        PageHome.imageNeoServices.assertPresent();

    //titre de neo.services
        PageHome.titleNeoServices.assertPresent();
        String contenuTitle3=PageHome.titleNeoServices.getText();
        PageHome.titleNeoServices.assertEquals("neo.services",contenuTitle3);

    //description de neo.services
        PageHome.descriptionNeoServices.assertPresent();
        String description2=PageHome.descriptionNeoServices.getText();
        PageHome.descriptionNeoServices.assertEquals("Un accompagnement dans les domaines du Test de logiciels, que vos applications soient développées en architecture traditionnelle, en mode web ou adaptés à tout support mobile."
                ,description2);

    //bouton en savoir plus de neo.services
        PageHome.ensavoirPlusNeoServices.assertPresent();



        /**
         * verfier "neo.academy" : image,titre,description,bouton "En savoir plus"
         */


    //image neo.academy
        PageHome.imageNeoAcademy.assertPresent();

    //titre de neo.academy
        PageHome.titleNeoAcademy.assertPresent();
        String contenuTitle4 = PageHome.titleNeoAcademy.getText();
        PageHome.titleNeoAcademy.assertEquals("neo.academy",contenuTitle4);

    //description de neo.academy
        PageHome.descriptionNeoAcademy.assertPresent();
        String description3 = PageHome.descriptionNeoAcademy.getText();
        PageHome.descriptionNeoAcademy.assertEquals("Un accompagnement dans la formation de vos équipes aux certifications ISTQB niveau Fondation et Test Manager. Formation ouverte aux professionnels et aux particuliers."
                ,description3);

    //bouton en savoir plus de neo.academy
        PageHome.ensavoirPlusNeoAcademy.assertPresent();



        /**
         * verfier "neo.tools" : image,titre,description,bouton "En savoir plus"
         */


    //image de neo.tools
        PageHome.imageNeoTools.assertPresent();

    //titre de neo.tools
        PageHome.titleNeoTools.assertPresent();
        String contenuTitle5 =PageHome.titleNeoTools.getText();
        PageHome.titleNeoTools.assertEquals("neo.tools",contenuTitle5);

    //description de neo.tools
        PageHome.descriptionNeoTools.assertPresent();
        String description4 =PageHome.descriptionNeoTools.getText();
        PageHome.descriptionNeoTools.assertEquals("Un outil vous permettant de maîtriser la qualité de vos migrations. Il s’occupe pour vous de tester les régressions à la suite de l’installation d’une nouvelle application ou version."
                ,description4);

    //bouton en savoir plus de neo.tools
        PageHome.ensavoirPlusNeoTools.assertPresent();



        /**
         * Verifier le paragraphe 2
         */


        PageHome.paragraphe2.assertPresent();
        String contenuParagraphe2 =PageHome.paragraphe2.getText();
        PageHome.paragraphe2.assertEquals("Notre solution monétique Limoney nécessite des tests avancés de manière quotidienne pour garantir un service optimal. Nous avons trouvé, avec neolians, le partenaire idéal pour nous assurer que notre solution fonctionne au mieux et en permanence. Nous avons apprécié le professionnalisme de l’équipe neolians qui se traduit par un reporting régulier, un respect des délais de livraison et une bonne qualification des bugs. Avec la mise en place d’une base de connaissance commune et enrichie par notre collaboration, nous arrivons à améliorer nos procédures de test de manière continue."
                ,contenuParagraphe2);

        /**
         * Verifier le titre "Nos dernière publications"
         */

        PageHome.titleNosDernierePublications.assertPresent();
        String contenuTitle6 =PageHome.titleNosDernierePublications.getText();
        PageHome.titleNosDernierePublications.assertEquals("Nos dernières publications",contenuTitle6);



        /**
         * Verifier le titre "Nos partenaires" et les partenaires
         */


        PageHome.titleNosPartenaires.assertPresent();
        String contenuTitle7 = PageHome.titleNosPartenaires.getText();
        PageHome.titleNosPartenaires.assertEquals("Nos partenaires",contenuTitle7);

        PageHome.partenaires.assertPresent();



        /**
          ******* Verifier le titre "Nos clients" et les clients
         */

        PageHome.titleNosClient.assertPresent();
        String contenuTitle8 = PageHome.titleNosClient.getText();
        PageHome.titleNosClient.assertEquals("Nos clients",contenuTitle8);

        PageHome.Client1.assertPresent();
        PageHome.Client2.assertPresent();
        PageHome.Client3.assertPresent();
        PageHome.Client4.assertPresent();
        PageHome.Client5.assertPresent();
        PageHome.Client6.assertPresent();
        PageHome.Client7.assertPresent();

    }

    /**
     ***************Ouvre la page Nos partenaires
     */

    public static void openPageNosPartenaires(){
        PageHome.url.openUrl();
        PageMenu.entreprise.moveTo();
        PageMenu.NosPartenairesButton.click();

    }



    public static void openPageNousRejoindre(){
        PageHome.url.openUrl();
        PageMenu.nousRejoindre.click();



    }


    public static void openPageNeoMobile(){

        PageHome.url.openUrl();
        PageMenu.nosOffres.moveTo();
        PageMenu.NeoServicesButton.moveTo();
        PageMenu.NeoMobileButton.click();




    }




    public static void openNosprojets() {
        PageMenu.entreprise.click();
        PageMenu.nosprojets.click();

    }

    public static void openLinkedlndepuislabarreenhautdepage() {
        PageMenu.iconLinkedIn1.click();

    }

    public static void NeoServicesviaPageHome() {
        PageHome.ensavoirPlusNeoServices.click();

    }

    public static void openLinkedlndepuislabarreenpieddepage() {
        PageFooter.iconLinkedIn2.click();
        PageLinkedlnFromFooterBar.linkedlndepuislabarreenpieddepage.assertPresent("la page de linkedln s'affiche");
    }

    public static void openNeoTra() {
        PageHome.url.openUrl();
        PageMenu.nosOffres.click();
        PageMenu.NeoServicesButton.moveTo();
        PageNeoServices.neoTRA.click();


    }

    public static void NeoConseil() {
        PageMenu.nosOffres.click();
        PageMenu.Neoconseil.click();


    }

    public static void openNeoConseilviaPageHome() {

        PageHome.ensavoirPlusNeoConseil.click();
    }

    /**
     "Nos dernière publications"
     */
    public static void VerifyNosdernièrespublication(){

        PageHome.titleNosDernierePublications.assertPresent();
    }


}
