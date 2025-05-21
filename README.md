🧸 Ancaya - Projeto de Coleção de Brinquedos
Bem-vindo ao projeto Ancaya Toy Collection! Este repositório contém o código-fonte e os recursos da nossa aplicação de coleção de brinquedos, desenvolvida pela equipe Ancaya.
👥 Integrantes da Equipe

Caio
Ana Cariele
Yago

📋 Visão Geral do Projeto
O Ancaya Toy Collection é uma aplicação baseada em Java para gerenciar e exibir uma coleção de brinquedos. O projeto utiliza o Maven para gerenciamento de dependências e inclui diretórios organizados para o código-fonte, recursos e utilitários.
✨ Funcionalidades Principais

Minha Coleção 🗂️: Gerencie sua coleção pessoal de brinquedos, adicionando, editando ou removendo itens.
Os Melhores ⭐: Veja os brinquedos mais populares ou bem avaliados da comunidade.
Categorias 🧩: Explore brinquedos organizados por categorias

📁 Estrutura de Pastas
Back-end

src/main/java 🖥️: Contém o código-fonte principal em Java.
src/main/resources 📜: Armazena arquivos de configuração e outros recursos.
src/test/java 🧪: Inclui os testes unitários da aplicação.
target/ 📦: Contém classes compiladas, resultados de testes e anotações.
bin/ ⚙️: Armazena arquivos executáveis.
src/ 📂: Diretório raiz do código-fonte.
uploads/ 📤: Diretório para arquivos enviados.
docker-compose.yml 🐳: Arquivo de configuração para contêineres Docker.
Dockerfile 🐋: Instruções para criar uma imagem Docker.
mvnw 🔨: Executável do Maven Wrapper.
mvnw.cmd 🔧: Maven Wrapper para Windows.
pom.xml 📄: Arquivo de configuração do Maven (Project Object Model).

🛠️ Pré-requisitos
Antes de começar, certifique-se de ter instalado:

Java JDK 11 ou superior ☕
Maven 🔧
Docker 🐳
Git 📂

🚀 Como Começar

Clone o repositório para sua máquina local:
git clone <URL_DO_REPOSITORIO>


Navegue até o diretório do projeto:
cd ancaya-toy-collection


Execute o comando para construir o projeto:
./mvnw install

(ou mvnw.cmd install no Windows).

Configure o ambiente com Docker:
docker-compose up



📝 Notas de Desenvolvimento

Certifique-se de que as portas definidas no docker-compose.yml não estão em uso.

Para rodar os testes unitários, use:
./mvnw test


Os arquivos enviados (como imagens de brinquedos) devem ser colocados no diretório uploads/.


📧 Contato
Para dúvidas ou suporte, entre em contato diretamente com os integrantes da equipe.
