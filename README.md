
# Desafio e-commerce

Desafio que propôs a criação de testes para verificar o desempenho de um e-commerce.
Foram realizados testes manuais e automatizados utilizando o Selenium Web Driver com Java. 

Após clonar o projeto, segue os passos a serem seguidos para rodar o teste automatizado:

1) Caso não tenha, [instale](https://www.mozilla.org/pt-BR/firefox/new/) o navegador Firefox

2) Instale a biblioteca GeckoDriver. Será necessário fazer o download da versão referente à sua máquina no repositório: https://github.com/mozilla/geckodriver/releases
3) Com o GeckoDriver baixado, faça a extração do arquivo dentro da pasta “C:\Windows”.   
 
    <b>Porque dentro da pasta Windows?</b> Porque a pasta Windows está configurado por padrão no PATH.
    
4) Acrescente ao arquivo pom.xml, o seguinte código:
```java
<dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.0.0</version>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

```


5) Caso queira ir direto para a classe onde os testes foram criados, clique [aqui](https://github.com/anacgsantana/QA_SenseData/blob/main/src/main/java/testeSenseData.java) !
