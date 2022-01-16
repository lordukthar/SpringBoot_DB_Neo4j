##

$ brew install neo4j

$ neo4j start

You need to change the default user neo4j's password

$ neo4j-admin set-initial-password secret

##Do NOT, I repeat, do NOT use secret in production

$ neo4j stop //You must do this for the pwd change to be applied

$ neo4j start

Run AccessingDataNeo4jApplication


###Call
http://localhost:8080/people/Greg

##GIT

Created repo locally and pushed it, followed these instructions
https://docs.github.com/en/github/importing-your-projects-to-github/importing-source-code-to-github/adding-an-existing-project-to-github-using-the-command-line

git init -b main

git add .

git commit -m "First commit"

git remote add origin https://github.com/lordukthar/SpringBoot_DB_Neo4j.git

git remote -v

git push -u origin main

