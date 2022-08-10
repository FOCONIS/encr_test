Vorwort
-------
Parameter in der Anwendung sollten nicht im Klartext abgelegt werden.
Man hat sich deshalb dazu entschieden, diese in verschlüsselter Form abzulegen. Hierfür wurde das `Encryptor` Interface 
bereit gestellt, sowie 2 Referenzimplementierungen `DummyEncryptor` und `BetterEncryptor`


Aufgabe 0
---------
Checken Sie das Projekt aus, öffnen Sie es in der IDE und compilieren Sie es mit Maven. 


Aufgabe 1
---------
Es existiert bereits ein UnitTest, der einen Wert mit `BetterEncryptor` ver- und wieder entschlüsselt.

Während die Funktion von `DummyEncryptor` noch einfach zu durchschauen ist, ist diese bei `BetterEncryptor` schon 
komplexer.

Versuchen Sie die Funktion von `BetterEncryptor` zu verstehen und zeigen Sie, dass der Algorithmus funktioniert. 
(z.B. durch weitere Tests)


Aufgabe 2
---------
Ändern Sie den vorhandenen UnitTest so ab, das dieser alle vorhandenen Implementierungen durchtestet.
(Stichwort `junit 5 parameterized class test`)


Aufgabe 3
---------
Denken Sie sich selber einen Algorithmus aus und implementieren Sie diesen. Erweitern Sie anschließend den Test, so dass
auch diese Implementierung getestet wird.


Aufgabe 4
---------
Sehen Sie sich das Interface `Encryptor` nochmals im Detail an. Haben Sie Anmerkungen was man hier verbessern könnte,
bevor man es freigibt.


Aufgabe 5
---------
Es existiert bereits ein rudimentäres Web-Interface. Erweitern Sie dieses Webinterface, so dass man sowohl ver- als auch
entschlüsseln kann.


Aufgabe 6
---------
Überlegen Sie sich, wie man mit diesem Verfahren komplette Dateien verschlüsseln könnte.


Aufgabe 7
---------
Implementieren Sie einen CI Workflow, so dass bei einem Commit automatisch die Unit-Tests laufen.
Siehe
https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-maven


Aufgabe 8
---------
Überlegen Sie, wie man das Ganze so modularisieren könnte, dass der `EncryptionController` keinen direkten Import auf das `.impl.`
Paket benötigt. Stellen Sie dazu den Scope von `de.foconis.demo:encryptor-impl` im pom.xml auf `runtime`