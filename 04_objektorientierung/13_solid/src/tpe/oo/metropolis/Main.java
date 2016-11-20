package tpe.oo.metropolis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) {
        try {
            start();
        } catch(IOException e) {
            System.err.println("Fehler beim Lesen der Konsole");      
        } catch(NumberFormatException e){
            System.err.println("Sie haben eine falsche Eingabe gemacht");
        }
    }
    
    private static void start() throws IOException, NumberFormatException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        
        while(true){
            System.out.println("1. Erstelle Einwohner");
            System.out.println("2. Berechne Steuern");
            System.out.println("3. Erstelle Syndikat");
            System.out.println("4. Ausgaben");
            System.out.println("5. Erstelle Unternehmen");
            System.out.println("6. Füge Inhaber/Gesellschafter hinzu");
            System.out.println("7. Füge Schurken zu Syndikat hinzu");
            System.out.println("8. Verurteile");
            System.out.println("9. Kämpfe mit Schurke");
            System.out.println("10. Kämpfe mit Superheld");
            System.out.println();
            System.out.println("Geben Sie die Ziffer der gewünschten Aktion ein: ");
            
            int i=0;
            try {
                i=Integer.parseInt(reader.readLine());
            }
            catch(IOException e) {
                System.out.println("Fehler beim Lesen der Konsole");
                continue;
            }   
            switch(i) {
            case 1: System.out.println("1. Bürger");
                    System.out.println("2. Richter");
                    System.out.println("3. Superheld");
                    System.out.println("4. Schurke");
                    int j=Integer.parseInt(reader.readLine());
                    if(j==1){
                        //Bürger
                        System.out.println("Gewünschter Name: ");
                        String name=reader.readLine();
                        System.out.println("Gewünschtes Alter: ");
                        int alter=Integer.parseInt(reader.readLine());
                        System.out.println("Gewünschtes Einkommen: ");
                        int einkommen=Integer.parseInt(reader.readLine());
                        
                        Buerger buerger = new Buerger(name, alter, einkommen);
                        Metropolis.getMetropolis().addEinwohner(buerger);
                        Finanzamt.getFinanzamt().addSteuerpflichtigen(buerger);
                        System.out.println(name+ " wurde erfolgreich erstellt");
                        System.out.println();
                        continue;
                        
                    } else if(j==2) {
                        //Richter
                        System.out.println("Gewünschter Name: ");
                        String name=reader.readLine();
                        System.out.println("Gewünschtes Alter: ");
                        int alter=Integer.parseInt(reader.readLine());
                        System.out.println("Gewünschtes Einkommen: ");
                        int einkommen=Integer.parseInt(reader.readLine());
                        System.out.println("Ist der Richter korrupt?");
                        String korrupt=reader.readLine();
                        boolean corrupt;
                        if("Ja".equals(korrupt)||"ja".equals(korrupt)) {
                            corrupt=true;
                        } else {
                            corrupt=false;
                        }
                        
                        Richter richter = new Richter(name, alter, einkommen, corrupt);
                        Metropolis.getMetropolis().addEinwohner(richter);
                        System.out.println(name + " wurde erfolgreich erstellt");
                        System.out.println();
                        continue;
                        
                    } else if(j==3) {
                        //Superhelden
                        System.out.println("Gewünschter Name: ");
                        String name=reader.readLine();
                        System.out.println("Gewünschte Mutation: ");
                        String mutation=reader.readLine();
                        System.out.println("Gewünschtes Einkommen: ");
                        int einkommen=Integer.parseInt(reader.readLine());
                        Superheld held = new Superheld(name, mutation, einkommen);
                        Metropolis.getMetropolis().addEinwohner(held);                       
                        System.out.println("Geben Sie die gewünschte Superkraft ein: ");
                        Superkraft kraft=new Superkraft(reader.readLine());
                        held.addSuperkraft(kraft);                       
                        System.out.println(name + " wurde erfolgreich erstellt");
                        System.out.println();                       
                        continue;
                        
                    } else if(j==4) {
                        //Schurken
                        System.out.println("Gewünschter Name: ");
                        String name=reader.readLine();
                        System.out.println("Gewünschte Mutation: ");
                        String mutation=reader.readLine();
                        System.out.println("Gewünschtes Einkommen: ");
                        int einkommen=Integer.parseInt(reader.readLine());
                        Schurke schurke = new Schurke(name, mutation, einkommen);
                        System.out.println("Welche Schwäche hat ihr Schurke?");
                        String schwaeche=reader.readLine();
                        schurke.setSchwaeche(schwaeche);
                        Metropolis.getMetropolis().addEinwohner(schurke);
                        Finanzamt.getFinanzamt().addSteuerpflichtigen(schurke);
                        System.out.println(name + " wurde erfolgreich erstellt");
                        System.out.println();                       
                        continue;
                    }
                        
            case 2: //Nicht alle Einwohner zahlen auch Steuern
                    System.out.println("Die Steuern betragen: " +Finanzamt.getFinanzamt().steuer()+" Metrodollar");
                    System.out.println();
                    continue;
            
            case 3: System.out.println("Name des Syndikats: ");
                    String name=reader.readLine();
                    Syndikat syndikat=new Syndikat(name);
                    Metropolis.getMetropolis().addSyndikat(syndikat);
                    Finanzamt.getFinanzamt().addSteuerpflichtigen(syndikat);
                    System.out.println(name+" wurde erfolgreich erstellt");
                    System.out.println();
                    continue;
                    
                    
                
            case 4: System.out.println("Was möchten sie Ausgeben? Alle...");
                    System.out.println("1. Einwohner");
                    System.out.println("2. Unternehmen");
                    System.out.println("3. Steuerpflichtigen");
                    System.out.println("4. Syndikate");
                    int y=Integer.parseInt(reader.readLine());
                    
                    if(y==1) {
                        Metropolis.getMetropolis().printEinwohner();
                        continue;
                    } else
                        if(y==2) {
                        Metropolis.getMetropolis().printUnternehmen();
                        continue;
                    } else
                        if(y==3) {
                        Finanzamt.getFinanzamt().printSteuerpflichtige();
                        continue;
                    } else
                        if(y==4) {
                        Metropolis.getMetropolis().printSyndikate();
                        continue;
                    }
                    
            
            case 5: System.out.println("1. Personengesellschaft");
                    System.out.println("2. Kapitalgesellschaft");
                    int k=Integer.parseInt(reader.readLine());
                    
                    if(k==1) {
                        System.out.println("Name der Personengesellschaft: ");
                        String namePG=reader.readLine();
                        System.out.println("Gewinn der Personengesellschaft: ");
                        int gewinn=Integer.parseInt(reader.readLine());
                        Personengesellschaft pg = new Personengesellschaft(namePG, gewinn);
                        Metropolis.getMetropolis().addUnternehmen(pg);
                        Finanzamt.getFinanzamt().addSteuerpflichtigen(pg);
                        System.out.println(namePG+" wurde erfolgreich erstellt");
                        System.out.println();
                        continue;
                                               
                    } else 
                        if(k==2) {
                         System.out.println("Name der Kapitalgesellschaft: ");
                         String nameKG=reader.readLine();
                         System.out.println("Gewinn der Kapitalgesellschaft: ");
                         int gewinn=Integer.parseInt(reader.readLine());
                         Kapitalgesellschaft kg=new Kapitalgesellschaft(nameKG, gewinn);
                         Metropolis.getMetropolis().addUnternehmen(kg);
                         Finanzamt.getFinanzamt().addSteuerpflichtigen(kg);
                         System.out.println(nameKG+" wurde erfolgreich erstellt");
                         System.out.println();
                         continue;
                        }
                    
            case 6: System.out.println("Möchten Sie Inhaber einer Personen- oder Gesellschafter einer Kapitalgesellschaft hinzufügen?");
                    System.out.println("1. Inhaber einer Personengesellschaft");
                    System.out.println("2. Gesellschafter einer Kapitalgesellschaft");
                    int l=Integer.parseInt(reader.readLine());
                    
                    if(l==1) {
                        System.out.println("Geben Sie den Namen der gewünschten Personengesellschaft ein");
                        String pgName=reader.readLine();
                        Personengesellschaft pg=(Personengesellschaft)Metropolis.getMetropolis().getUnternehmen(pgName);
                        System.out.println("Geben Sie den Namen des Inhabers ein, den Sie hinzufügen wollen");
                        String inhaberName=reader.readLine();
                        Buerger inhaber=(Buerger)Metropolis.getMetropolis().getEinwohner(inhaberName);
                        if(inhaber!=null) {
                            pg.addInhaber(inhaber);
                            System.out.println("Sie haben der Personengesellschaft "+pgName+" den Inhaber "+inhaberName+" hinzugefügt");
                            continue;
                        }
                        else {
                            System.out.println("Dieser Bürger existiert nicht");
                            continue;
                        }
                    }
                    else if(l==2) {
                        System.out.println("Geben Sie den Namen der gewünschten Kapitalgesellschaft ein");
                        String kgName=reader.readLine();
                        Kapitalgesellschaft kg=(Kapitalgesellschaft)Metropolis.getMetropolis().getUnternehmen(kgName);
                        System.out.println("Geben Sie den Namen des Gesellschafters ein, den Sie hinzufügen wollen");
                        String gesellschafterName=reader.readLine();
                        Buerger gesellschafter=(Buerger)Metropolis.getMetropolis().getEinwohner(gesellschafterName);
                        if(gesellschafter!=null) {
                            kg.addGesellschafter(gesellschafter);
                            System.out.println("Sie haben der Kapitalgesellschaft "+kgName+" den Inhaber "+gesellschafterName+" hinzugefügt");
                            continue;
                        }
                        else {
                            System.out.println("Dieser Bürger existiert nicht");
                            continue;
                        }
                    }
                    
                    
                    
                    
                    
            case 7: System.out.println("Geben Sie den Namen des gewünschten Syndikats ein");
                    String syndiName=reader.readLine();
                    Syndikat syndi=Metropolis.getMetropolis().getSyndikat(syndiName);
                    if(syndi!=null) {
                        System.out.println("Geben Sie den Namen des Schurken ein, den sie hinzufügen möchten");
                        String schurkenName=reader.readLine();
                        syndi.addSchurke((Schurke)Metropolis.getMetropolis().getEinwohner(schurkenName));
                        System.out.println("Sie haben "+schurkenName+" erfolgreich dem Syndikat "+syndiName+" hinzugefügt");
                        continue;
                    }
                    else {
                        System.out.println("das von ihnen eingegebene Syndikat existiert nicht");
                        continue;
                    }
                    
            case 8: System.out.println("Geben Sie den Namen des gewünschten Richters ein");
                    String richterName=reader.readLine();
                    Richter richter=(Richter)Metropolis.getMetropolis().getEinwohner(richterName);
                    if(richter!=null) {
                        System.out.println("Geben Sie den Namen des Schurken ein, der verurteilt werden soll");
                        String schurkenName=reader.readLine();
                        Schurke schurke=(Schurke)Metropolis.getMetropolis().getEinwohner(schurkenName);
                        if(schurke!=null) {
                            if(richter.verurteile(schurke)) {
                                System.out.println("Der Schurke "+schurkenName+" wurde von dem Richter "+ richterName+" verurteilt");
                                System.out.println();
                                continue;
                            }
                            else {
                                System.out.println("Der Schurke "+schurkenName+" wurde von dem Richter "+ richterName+" freigesprochen");
                                System.out.println();
                                continue;
                            }
                            
                        }
                        else {
                            System.out.println("Dieser Schurke existiert nicht");
                            System.out.println();
                            continue;
                        }
                    } 
                    else {
                        System.out.println("Dieser Richter existiert nicht");
                        System.out.println();
                        continue;
                    }
                    //funktioniert nicht, Schurke gewinnt immer
            case 9: System.out.println("Geben Sie den Namen des gewünschten Superhelden ein");
                    String heldName=reader.readLine();
                    Superheld held=(Superheld)Metropolis.getMetropolis().getEinwohner(heldName);
                    if(held!=null) {
                        System.out.println("Geben Sie den Namen des Schurken ein, mit dem "+heldName+" kämpfen soll");
                        String schurkenName=reader.readLine();
                        Schurke schurke=(Schurke)Metropolis.getMetropolis().getEinwohner(schurkenName);
                        if(schurke!=null) {
                            boolean result=held.kaempfe(schurke);
                            if(result) {
                                System.out.println("Der Superheld "+heldName+" hat gewonnen!");
                                Metropolis.getMetropolis().deleteEinwohner(schurke);
                                Finanzamt.getFinanzamt().deleteSteuerpflichtigen(schurke);
                                System.out.println("Der Schurke "+schurkenName+" wurde aus der Liste der Einwohner entfernt");
                                continue;
                                
                            }
                            else {
                                System.out.println("Der Schurke "+schurkenName+" hat gewonnen");
                                Metropolis.getMetropolis().deleteEinwohner(held);
                                System.out.println("Der Superheld "+heldName+" wurde aus der Liste der Einwohner entfernt");
                                continue;
                            }
                        }
                        else {
                            System.out.println("Dieser Schurke existiert nicht");
                            continue;
                        }
                        
                    } else {
                        System.out.println("Dieser Superheld existiert nicht");
                        continue;
                    }
                
            } 
        }
    }

}
