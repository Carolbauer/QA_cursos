*** Settings ***

Documentation    aula 3

Test Setup       Pular linha no codigo
Test Teardown    Pular linha no codigo

*** Variables ***

${VAR01}    171

@{LISTA_NUM}    
...    10
...    20
...    30
...    40
...    50
...    60
...    70
...    80
...    90
...    100
...    110
...    120

@{RACA_DOG_TURMA}
...    SRD
...    BEAGLE
...    DASCHUND
...    PITBULL
...    SHITZU
...    GOLDEN
...    PEQUINES
...    PASTOR
...    PUG
...    POODLE

&{DICT_COLEGA}    
...    nome=FULANO
...    idade=25
...    profissao=PROFESSOR
...    carro=FIAT UNO

*** Keywords ***

Pular linha no codigo
    Log To Console    ${\n}

escreva na tela os 3 primeiros valores de uma lista
    log to console    ${LISTA_NUM}[0]
    log to console    ${LISTA_NUM}[1]
    log to console    ${LISTA_NUM}[2]

escreva a profissao e carro do colega
    Log To Console    carro: ${DICT_COLEGA}[carro]
    Log To Console    profissao: ${DICT_COLEGA}[profissao]

escreva os 10 primeiros valores de uma lista
    FOR    ${counter}    IN RANGE    0    10
        Log To Console    ${LISTA_NUM}[${counter}]
    END

escreva todas as racas que anotamos
    FOR    ${element}    IN    @{RACA_DOG_TURMA}
        Log To Console    ${element}
    END

achar a posicao do poodle na minha lista
    Set Local Variable    ${counter}    0
    ${raca_temp}    Set Variable    ${RACA_DOG_TURMA}[${counter}]
    WHILE    ${counter} < 10
        IF    '${raca_temp}' == 'POODLE'
            log to console    ACHAMOS O POODLE, ELE ESTÁ NA POSIÇÃO ${counter}
            BREAK
        ELSE
            Log To Console    ${raca_temp} não é poodle!  
            ${counter}    Evaluate    ${counter} + 1
        END
        ${raca_temp}    Set Variable    ${RACA_DOG_TURMA}[${counter}]
    END

liste as racas melhores que o poodle
    Set Local Variable    ${counter}    0
    ${raca_temp}    Set Variable    ${RACA_DOG_TURMA}[${counter}]
    WHILE    '${raca_temp}' != 'POODLE'
        Log To Console    ${raca_temp} é melhor que o poodle  
        ${counter}    Evaluate    ${counter} + 1
        ${raca_temp}    Set Variable    ${RACA_DOG_TURMA}[${counter}]
    END

Printar no console se ${num1} e maior que ${num2}
    TRY
        IF    ${num1} == ${num2}
            Fail
        ELSE IF    ${num1} > ${num 2}
           Log to console    ${num1} é maior que ${num2}
        ELSE IF    ${num1} < ${num2}
            Log to console    ${num2} é maior que ${num1}
        END        
    EXCEPT    
        Log To Console    (${num1} = ${num2}) Os numeros comparados são iguais.
    FINALLY
        Log To Console    foram comparados os numeros ${num1} e ${num2}
    END

print a posicao do cachorro
    [Arguments]    ${cachorro}
    ${posicao}    ache o cachorro    ${cachorro}
    Log To Console    a posicao do ${cachorro} é ${posicao}

ache o cachorro
    [Arguments]    ${cachorro}
    ${counter}    Set Variable    0
    FOR    ${element}    IN    @{RACA_DOG_TURMA}
        IF    '${element}' == '${cachorro}'    RETURN    ${counter}
        ${counter}    Evaluate    ${counter} + 1
    END


*** Test Cases ***

LISTA - TEST DE PRINT NA TELA 01
    [Tags]    aula-3-list-1
    escreva na tela os 3 primeiros valores de uma lista

DICT - TEST DE PRINT NA TELA 01
    [Tags]    aula-3-dict-1
    escreva a profissao e carro do colega

REPETICAO - PRINTAR 10 PRIMEIROS NUMEROS NA TELA
    [Tags]    aula-3-rep-1
    escreva os 10 primeiros valores de uma lista

REPETICAO - PRINTAR A LISTA NA TELA
    [Tags]    aula-3-rep-2
    escreva todas as racas que anotamos

BONUS - ACHAR O POODLE
    [Tags]    aula-3-bonus-0
    achar a posicao do poodle na minha lista

BONUS - LISTA RACAS MELHORES QUE POODLE
    [Tags]    aula-3-bonus-1  
    liste as racas melhores que o poodle

BONUS - CONDICIONAL + TRY
    [Tags]    aula-3-bonus-2
    Printar no console se 25 e maior que 12
    Printar no console se 25 e maior que 30
    Printar no console se 25 e maior que 25
    
BONUS - CONDICIONAL INLINE + ARGS E RETORNOS
    [Tags]    aula-3-bonus-3
    print a posicao do cachorro    PUG
    print a posicao do cachorro    SHITZU