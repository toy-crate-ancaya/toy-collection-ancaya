# 🎮 Toy Collection Backend

<div align="center">

![Status do Projeto](https://img.shields.io/badge/Status-Em%20Desenvolvimento-green)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Java](https://img.shields.io/badge/Java-17-orange)
![Licença](https://img.shields.io/badge/Licença-Privada-red)

</div>

API REST desenvolvida em Java com Spring Boot para gerenciamento de coleção de brinquedos.

## 📋 Índice

- [📱 Sobre o Projeto](#-sobre-o-projeto)
- [🚀 Tecnologias](#-tecnologias)
- [🏗️ Estrutura do Projeto](#️-estrutura-do-projeto)
- [⚙️ Pré-requisitos](#️-pré-requisitos)
- [🔧 Instalação e Execução](#-instalação-e-execução)
- [📚 Documentação da API](#-documentação-da-api)

## 📱 Sobre o Projeto

Backend robusto desenvolvido para suportar o gerenciamento completo de coleções de brinquedos, oferecendo endpoints REST para todas as operações necessárias.

## 🚀 Tecnologias

- ☕ Java 17
- 🍃 Spring Boot
- 🎲 PostgreSQL
- 📝 Maven
- 🐳 Docker
- 🔄 JPA/Hibernate

## 🏗️ Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com.generate.toy/
│   │       ├── configs/      # ⚙️ Configurações do Spring
│   │       ├── controllers/  # 🎮 Controladores REST
│   │       ├── dtos/        # 📦 Objetos de Transferência
│   │       ├── entities/    # 📊 Entidades JPA
│   │       ├── mappers/     # 🔄 Conversores de Objetos
│   │       ├── projections/ # 📐 Projeções
│   │       ├── repositories/# 💾 Repositórios
│   │       ├── services/    # 🔧 Regras de Negócio
│   │       └── utils/       # 🛠️ Utilitários
│   └── resources/           # 📁 Recursos e Configurações
└── test/                    # 🧪 Testes Automatizados
```

## ⚙️ Pré-requisitos

- ☕ Java 17+
- 📦 Maven
- 🐳 Docker e Docker Compose
- 🎲 PostgreSQL

## 🔧 Instalação e Execução

1. Clone o repositório:
```bash
git clone [URL_DO_REPOSITÓRIO]
```

2. Configure o banco de dados:
```bash
docker-compose up -d
```

3. Execute o projeto:
```bash
mvn spring-boot:run
```

## 📚 Documentação da API

### 🎮 Endpoints Principais

#### Brinquedos
- `GET /api/toys` - Lista todos os brinquedos
- `POST /api/toys` - Cadastra novo brinquedo
- `GET /api/toys/{id}` - Busca brinquedo por ID
- `PUT /api/toys/{id}` - Atualiza brinquedo
- `DELETE /api/toys/{id}` - Remove brinquedo



### 🔄 Integração
- API RESTful
- Formato JSON
- Paginação de resultados
- Filtros avançados

## 🎯 Status do Desenvolvimento

- ✅ Configuração do Projeto
- ✅ Estrutura Base
- ✅ CRUD Básico
- 🚧 Autenticação
- 🚧 Testes Unitários
- 📝 Documentação

## 📞 Suporte

Para suporte ou dúvidas sobre a API, entre em contato através:
- 📧 Email: [EMAIL]
- 💬 Discord: [DISCORD]

---

<div align="center">

Desenvolvido com ☕ pela Equipe Toy Collection

[⬆ Voltar ao topo](#-toy-collection-backend)

</div> 
