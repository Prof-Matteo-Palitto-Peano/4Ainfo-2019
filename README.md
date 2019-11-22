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
    - classe **Inc1000** al cui interno possiede una variabile **STATIC** (count) e che esegua un ciclo **for** che incrementi la variabile ``(count = count +1)`` 1000 volte. (**Nota Bene:** inserire tra un incremento e il successivo un intervallo di 1ms usando la seguente instruzione: ``Thread.sleep(1);``)
    - classe **TestInc1000** che avvia 2 thread usando la classe **Inc1000** e quindi stampi il risultato su schermo. **Nota Bene:** Per accedere alla variabile **count** posso usare la seguente sintassi: ``inc1000.count``... per quale motivo?
 Questo esercizio vuole mostrare che anche **main** viene eseguito in un thread e può terminare prima degli altri threads che avvia.
 * dare spiegazione del motivo che posso accedere alla variabile **count** usando il nome della classe invece del nome dell'oggetto.
 * dare spiegazione del risultato ottenuto
 
 2. Modificare il **main** dell'esercizio **1** per aspettare che i 2 threads avviati terminino prima di stampare su schermo il risultato.
 Questo esercizio vuole mostrare il verificarsi dei conflitti durante l'accesso alla variabile condivisa.
  * dare spiegazione del risultato ottenuto
  
 3. Modificare il codice per eliminare il conflitto tra i 2 threads
 * usare la parola chiave **syncronized** con il metodo **inc1()** che esegue l'incremento di 1.
 * dare la spiegazione teorica del risultato ottenuto

