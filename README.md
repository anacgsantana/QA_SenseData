
# Desafio e-commerce

Desafio que propôs a criação de testes para verificar o desempenho de um e-commerce.
Foram realizados testes manuais e automatizados utilizando o Selenium Web Driver com Java. 

Passos para rodar o teste automatizado:

1) Caso não tenha, instale o navegador Firefox

2) Instale a biblioteca GeckoDriver. Será necessário fazer o download da versão referente à sua máquina no repositório: https://github.com/mozilla/geckodriver/releases
3) Com o GeckDriver baixado, extrair dentro da pasta “C:\Windows”.   
 
    Porque dentro da pasta Windows?    
    Porque a pasta Windows está configurado por padrão no PATH.
    
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
