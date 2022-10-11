*** Settings ***
Documentation    primeiro teste em robot

*** Variables ***

${VAR01}    171
${VAR02}    29

*** Keywords ***

Dado que tenha criado espaco
    criar espacos no meu codigo

quando eu somar duas variaveis
    ${VARSOMA}    Evaluate    ${VAR01} + ${VAR02}
    Set Global Variable    ${VARSOMA}

entao vejo sua soma
    Log To Console    ${VARSOMA}

criar espacos no meu codigo
    Log To Console    ${\n}

print no console o valor da variavel
    Log To Console    ${VAR01}

*** Test Cases ***

TEST CASE 01
    Dado que tenha criado espaco
    quando eu somar duas variaveis

Test case 02
    entao vejo sua soma

