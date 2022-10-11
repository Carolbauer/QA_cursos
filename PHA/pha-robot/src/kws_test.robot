*** Settings ***
Documentation    primeiro teste em robot

Library    SeleniumLibrary

*** Variables ***

${VAR01}    170
${VAR02}    29
${VARSOMA}    200

*** Keywords ***

#    TEST SETUP
Dado que tenha criado espaco
    criar espacos no meu codigo

#    SUITE SETUP
AVISANDO QUE ESTAMOS RODANDO UMA SUITE
    Log To Console    ESTOU RODANDO NO INICIO DA SUITE

quando eu somar duas variaveis
    ${VARSOMA}    Evaluate    ${VAR01} + ${VAR02}
    Set Test Variable    ${VARSOMA}

quando eu somar tres numeros
    ${VARSOMA}    Evaluate    ${VAR01} + ${VAR02} + 3
    Set Test Variable    ${VARSOMA}

quando eu somar 4 numeros
    ${VARSOMA}    Evaluate    ${VAR01} + ${VAR02} + 3 + 10
    Set Test Variable    ${VARSOMA}

#aqui da erro
entao vejo um carro da fiat
    Log To Console    ${UNO_MILLE_1999}

Entao vejo sua soma
    Log To Console    ${VARSOMA}

criar espacos no meu codigo
    Log To Console    ${\n}

print no console o valor da variavel
    Log To Console    ${VAR01}

#    SUITE SETUP
abrir navegador
    Open Browser    https://learningprime.com.br/    chrome

#    SUITE TEARDOWN
fechar navegador
    Close Browser