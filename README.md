# Laboratorio #3 CVDS

### :hammer: Crear Proyecto Maven
Para empezar, creamos un nuevo proyecto en Maven siguiendo los parametros dados con el comando 

`mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=Library -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.0 -Dpackage=edu.eci.cvds.tdd -DinteractiveMode=false`

![image](https://github.com/user-attachments/assets/f077c5b8-a996-4b50-8c00-4514958fcbfe)


### ✔️ Agregar Dependencia JUnit5
Editamos el archivo `pom.xml` y agregamos la dependencia de JUnit5 en su última versión `5.11.4` y verificamos las propiedades 

![image](https://github.com/user-attachments/assets/98ae3f5b-9a71-464c-b5d1-4a2017f9bea1)

Compilamos y validamos

![image](https://github.com/user-attachments/assets/3672b21c-53f0-4ec0-8375-6e7b56f18b1e)

### :computer: Agregar Esqueleto del Proyecto





## Pruebas Unitarias y TDD

### 📊 Cobertura
Editamos el archivo `pom.xml` agregando la dependencia de Jacoco con la estructura sugerida y en su última versión `0.8.12`

![image](https://github.com/user-attachments/assets/388606ed-ce73-4274-8caa-26e52c4335f5)

Verificamos...

![image](https://github.com/user-attachments/assets/17241dcc-a4ba-494d-afa2-aada6ac0c9d8)
