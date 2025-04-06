# SubscriptionSystem 📺🎶

Este projeto é um sistema simples de gerenciamento de assinaturas, desenvolvido em **Java**, com foco no uso de **Programação Orientada a Objetos (POO)**. Ele simula um ambiente onde usuários podem se cadastrar, visualizar e contratar serviços, como plataformas de streaming.

## 🚀 Funcionalidades

- Cadastrar usuários com nome e CPF.
- Listar todos os usuários cadastrados.
- Listar todos os serviços disponíveis.
- Assinar serviços por CPF.
- Cancelar serviços assinados.
- Exibir as assinaturas de um usuário específico.
- Calcular o valor total mensal de todas as assinaturas de um usuário.
- Menu interativo via terminal.

## 🛠️ Tecnologias utilizadas

- Java 17+
- Paradigma de Programação Orientada a Objetos (POO)
- Scanner (entrada de dados via terminal)
- Estruturas de dados: `ArrayList` e `HashMap`

## 🧠 Conceitos aplicados

- Encapsulamento
- Composição de classes
- Coleções Java
- Manipulação de strings
- Interação com o usuário via console

## 📂 Organização do projeto

- `Service.java` → Representa um serviço com nome, valor mensal e categoria.
- `User.java` → Representa um usuário com CPF, nome e suas assinaturas.
- `SubscriptionSystem.java` → Gerencia os usuários e serviços disponíveis.
- `Main.java` → Classe principal que executa o menu interativo no terminal.

