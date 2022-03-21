public class Haeschenapp {

    public static void main(String[] args) {
        // statisches Attribut bzw. Methode kann auch ohne Objekt oder Instanz verwendet werden
        //mit dem Namen der Klasse!
        System.out.println(Haeschen.spezies);

        Haeschen roger = new Haeschen();
        //Zugriff auf Attribut mittels Objekt-/ Instanzname
        roger.name = "Roger Rabbit";
        roger.farbe = "weiß";
        System.out.println(roger.name + " " + roger.farbe);

        Haeschen bugs = null; //kann auch erst später initialisiert werden

        bugs = new Haeschen();
        bugs.name = "Bugs Bunny";
        bugs.farbe = "grau";

        //hoppel-Methode verwenden - geht nicht ohne haeschen!

        bugs.hoppel("nach hinten");
        roger.hoppel("in the woods");

        // in statischen Methoden können wir nur auf statische Attribute zugreifen
        // Java weiß ja nicht, ob es ein Objekt oder eine Instanz, die nichtstatisch sind, überhaupt gibt
        // und welche wir aufrufen wollen
        //Aufruf statische Methode:

        Haeschen.ausgabeSpezies();


    }
}
