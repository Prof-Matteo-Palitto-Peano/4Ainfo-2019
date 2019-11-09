# 4Ainfo-2019
Al termine di ogni esercizio caricare i files su Repository nel proprio GitHub e aggiungere una documentazione nel README dove descrivete quello che avete osservato e una spiegazione del perchè.
## 9 Novembre - Esercizi Multi-Threading
1. Realizzare 2 classi che estendono la classe **Thread**
  - Classe **Hi** che scrive 10 volte "Hi" sullo schermo
  - Classe **Hello** che scrive 10 volte "Hello sullo schermo
  - Classe **HiHello** che avvia i due threads uno per Hi e uno per Hello.
Questo esercizio vuole mostrare come i threads vengono eseguiti contemporaneamente ma non possimamp assumere in quale sequenza e per quanto tempo vengano eseguite.

2. Realizzare 1 classe che estende la classe **Thread**
  - Classe **Say** che scrive 10 volte la stringa che gli viene passata come parametro (cosaDire)
  - Classe **CiaoHiHello** che avvia 3 threads usando sempre la classe **Say** una per dire **Ciao** una per dire **Hi** e una per dire **Hello**
  Questo esercizio vuole sottolineare che si possono crare più **threads** usando la stessa classe
  
  ## 16 Novembre - Esercizi Multi-Threading
  1. Realizzare 1 classe che estende la classe **Thread**
    - classe **Inc1000** al cui interno possiede una variabile **STATIC** (count) e che esegua un ciclo **for** che incrementi la variabile 1000 volte
    - classe **TestInc1000** che avvia 2 thread usando la classe **Inc1000** e quindi stampino il risultato su schermo
 Questo esercizio vuole mostrare che anche **main** viene eseguito in un thread e può terminare prima degli altri threads che avvia.
 
 2. Modificare il **main** dell'esercizio **1** per aspettare che i 2 threads avviati terminino prima di stampare su schermo il risultato.
 
