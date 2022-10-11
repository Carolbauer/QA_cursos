*** Settings ***
Documentation    segundo teste em robot

Resource    ../src/kws_test.robot

Suite Setup       abrir navegador
Suite Teardown    fechar navegador

Test Setup       Dado que tenha criado espaco 
Test Teardown    Entao vejo sua soma

*** Test Cases ***

TEST CASE 02
    [Tags]    modulo_financas    modulo_vendas    tag02
    quando eu somar duas variaveis
    
TEST CASE 04
    [Tags]    modulo_financas    modulo_vendas    tag04
    quando eu somar tres numeros
    
TEST CASE 06
    [Tags]    modulo_financas    modulo_vendas    tag06
    quando eu somar 4 numeros
    


# DADO que eu esteja na rua
# E esteja com meu cachorro
# QUANDO eu corro
# ENTAO eu vejo meu cachorro correndo também
