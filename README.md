# JavaScriptToJQueryConverter
L’obiettivo del progetto è la traduzione automatica di un codice in JavaScript nativo nel corrispettivo in jQuery.
L’applicazione si presenta con un’interfaccia grafica che permette all’utente di selezionare un file di input, la directory in cui salvare l’output e la console per la comunicazione di eventuali messaggi.
La filosofia generale dell’analisi sintattica è quella di essere più permissiva rispetto agli analizzatori sul mercato in quanto lo scopo finale non è l’esecuzione del codice, la cui correttezza non dipende dalla traduzione ma dal solo codice fornito in input.
Per quanto riguarda i principi su cui si basa la traduzione sono di convertire solo quando vi è la sicurezza di non alterare il senso logico del codice altrimenti si preferisce segnalare all’utente il potenziale problema indicando la posizione nel file senza effettuare la
traduzione.
