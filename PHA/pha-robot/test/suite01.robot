*** Settings ***
Documentation    primeiro teste em robot

Resource    ../src/kws_test.robot

Test Setup    Dado que tenha criado espaco
Suite Setup    AVISANDO QUE ESTAMOS RODANDO UMA SUITE


*** Test Cases ***

TEST CASE 01
    [Tags]    modulo_financas
    quando eu somar duas variaveis
    entao vejo sua soma

TEST CASE 03
    [Tags]    modulo_vendas
    entao vejo um carro da fiat
