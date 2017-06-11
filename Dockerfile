FROM java:8

# Install maven
RUN apt-get update
RUN apt-get install -y maven
RUN apt-get install curl
RUN curl -sL https://deb.nodesource.com/setup_6.x | bash
RUN apt-get install -y nodejs

# Create app directory
RUN mkdir -p /usr/src/app

# Install app dependencies
COPY package.json /usr/src/app/package.json
RUN cd /usr/src/app && npm install

# Prepare by downloading dependencies
ADD pom.xml /usr/src/pom.xml
COPY . /usr/src/app

WORKDIR /usr/src/app

RUN ["mvn", "dependency:resolve"]
RUN ["mvn", "verify"]
RUN ["mvn", "compile"]

EXPOSE 4567
CMD ["mvn", "exec:java"]
