# jsf-campus

`JSF` e' un framework per lo sviluppo di interfacce di applicazioni Web Java che implementa l'architettura `MVC`(Model View Controller). 
* Model, e' la struttura dell'applicazione, dove stanno gli `action methods`.
* View rappresenta la parte grafica dell'applicazione.
* Controller e' dove sta tutta la  _business logic_  dell'applicazione. Esso funge da updater del Model e della View.

### Dichiarazione del managed bean

Quando utilizzi l'annotazione `@ManagedBean` in una classe java, prima dell'inizio della classe,
stai dicendo che jsf nel suo `context` individua il managed bean col nome che utilizzi per identiticare il @ManagedBean. 

```
package mypackage;

@ManagedBean("bean")
@SessionScoped
public class Controller {
	//codice 
}
```
Il nome nel context jsf sara' `bean`. Se non si assegna nessun nome, di default e' il nome della classe in minuscolo, in questo caso sarebbe `controller`.
Il ciclo di vita del bean può essere di 4 tipi:
* `@ApplicationScoped`, il bean viene creato una volta per la durata dell'applicazione.
* `@SessionScoped`, il bean viene creato una volta per la durata della sessione.
* `@ViewScoped`, il bean viene creato una volta per la durata della view.
* `@RequestScoped`, il bean viene creato una volta per la durata della request.

### Ciclo di vita di un JSF

Il ciclo di vita definisce il processo mediante il quale una richiesta viene gestita da una applicazione JSF dal momento in cui viene presa in carico dal controller fino alla generazione di una risposta al client.

Ogni pagina di una applicazione JSF viene rappresentata da un albero di componenti che corrispondono ai vari elementi dell‘interfaccia grafica `component tree`.

Le fasi del ciclo, dopo l'invio della `request` sono le seguenti:
* `Restore Component Tree`, In questa fase il framework acquisisce il `component-tree` della pagina richiesta se non è la prima request alla stessa, altrimenti ne crea uno nuovo nel caso di prima request. Se la request non possiede dati (i dati in una request `HTTP` vengono manipolati sottoforma di `stringhe`) il framework redirige il flusso direttamente alla fase di RenderResponse.
* `Apply Request Value`, In questa fase il framework memorizza i dati associati alla request nei componenti associati ai vari elementi della pagina. Al termine di questa fase tutti i componenti sono aggiornati con i dati acquisiti dalla richiesta pervenuta.
* `Process Validations`, In questa fase a tutti i componenti dell‘albero che rappresenta la pagina in elaborazione viene richiesto di verificare che i valori presenti nella richiesta e memorizzati nella fase precedente sono validi quindi accettabili. I dati vengono convertiti da stringhe al formato usato nel Model. Se i valori sono validi il framework passa alla fase successiva altrimenti salta alla fase RenderResponse accodando degli opportuni messaggi di errore.
* `Update Model Values`, in questa fase avviene l'aggiornamento degli attributi associati ai vari componenti della vista presenti nel Model, tramite il popolamento degli stessi, con i dati fin qui validati. Per interfacciare la View con il Model si usano dei `backing-bean`, che sono dei `JavaBean`, classi scritte in linguaggio `Java`,  e generalmente contengono proprietà  che vengono valorizzate con i valori immessi dall‘utente nella vista dell‘applicazione e metodi che effettuano elaborazioni in risposta ad eventi.
* `Invoke Application`,  In JSF come sappiamo quando un utente interagisce con un elemento della vista, un bottone o un link, vengono generati degli eventi, `action events`, i quali sono gestiti da listener, `action listener`. In questa fase il framework notifica gli action events a tutti i listener registrati, quindi vengono eseguiti gli `action methods` dei backing-bean della vista e quindi viene eseguita la logica corrispondente all‘azione effettuata dall‘utente sull‘interfaccia.
* `Render Response`, E' l‘ultima fase del ciclo , e si occupa di memorizzare lo stato della vista che si sta elaborando e di generare la risposta per il client.

### See
* [JSF Overview](src/main/doc/JSFIntro.pdf)
* [JSF Practical tutorial](src/main/doc/jsf_tutorial.pdf)
