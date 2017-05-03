# asw-progetto
Progetto per il corso "Architetture dei sistemi software"

Ogni cartella contiene un servizio diverso.

S è il servizio base in ascolto sulla porta 8080 al quale l'utente si deve interfacciare. Accetta due tipi di richieste:
- /S/{nome} interroga S1 e stampa il suo output
- /S/{nome}/{titolo} interroga prima S1 e poi S2, concatenando i due output

S1 e S2 a loro volta interrogano l'applicazione che gestisce il database con la lista ammissibile di registi e film.
Shared Repository cerca nel proprio DB registi in base al nome e film in base al titolo.

N.B. se l'input non è presente nel DB, il controller restituisce NULL, che viene interpretato come un fallimento. Se si vogliono aggiungere altre ennuple, aggiungere codice al metodo init() di Shared Repository.


** Esecuzione: **

Lanciare lo script run.bat

Richiede Gradle.
