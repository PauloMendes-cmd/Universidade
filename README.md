src/
└── universidade/
        ├── ProvaUniversidade.java        ← Superclasse abstrata
        ├── ProvaFinalUniversidade.java   ← Abstrata para provas finais
        ├── ProvaUCB.java                 ← Regras da UCB
        ├── ProvaFafifo.java              ← Regras da Fafifo
        ├── ProvaAV3UCB.java              ← Prova final UCB
        ├── ProvaFinalFafifo.java         ← Prova final Fafifo
        └── teste/
            └── Main.java               ← Classe main

=== UCB ===
AV1 = 6,0 (peso 1)
AV2 = 5,0 (peso 1)
Media minima: 7,0
Media calculada: 5,50
Situacao: REPROVADO
Habilitado para AV3: Sim
Apos AV3 (9.0) - nova media: 7,50
Situacao final: APROVADO

=== FAFIFO ===
AV1 = 4,0 (peso 1)
AV2 = 5,0 (peso 1)
Peso AV3 = 3
Media minima: 6,0
Media calculada: 1,80
Situacao: REPROVADO
Habilitado para AV3: Sim
Apos AV3 (8.0) - nova media: 6,60
Situacao final: APROVADO
