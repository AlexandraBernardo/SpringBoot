
📚 SISTEMA COM SPRING BOOT-3, SEGURANÇA, MONITORAMENTO, TESTES E DEPLOY

💻 Descrição do Projeto
Este projeto consiste no desenvolvimento de um Sistema Acadêmico (backend) utilizando Spring Boot 3. O objetivo principal é simular funcionalidades de um sistema de gestão educacional, com foco em gerenciamento de alunos e cursos, aplicando conceitos essenciais de desenvolvimento moderno, incluindo segurança, persistência de dados, monitoramento, testes de desempenho e deploy.

As entidades centrais são:

Aluno: id, nome, email, matricula.

Curso: id, nome, cargaHoraria.

Existe um relacionamento N:N (muitos para muitos) entre Aluno e Curso, gerenciado por uma tabela intermediária AlunoCurso.


⚙️ Tecnologias Utilizadas
O backend foi desenvolvido utilizando as seguintes tecnologias e dependências:

Framework: Spring Boot 3 

Linguagem: Java

Persistência: Spring Data JPA 

Banco de Dados: H2 (em memória, para desenvolvimento e testes) 

Segurança: Spring Security (para autenticação) 

API Web: Spring Boot Starter Web 

Monitoramento: Spring Boot Actuator , Prometheus e Grafana 

Documentação da API: Springdoc-OpenAPI-UI (Swagger) 

Ferramentas de Desenvolvimento: Spring Boot Devtools 

Testes de Carga/Stress: [Escolha uma: Gatling ou Apache JMeter] 

Containerização (para monitoramento): Docker

🔗 Referências Utilizadas
Spring Boot 
Spring Data JPA 
Spring Security 
Swagger (Springdoc) 
Spring Boot Actuator 
Prometheus 
Grafana 
Keycloak 
Gatling 
Apache JMeter 
Deploy no Render



