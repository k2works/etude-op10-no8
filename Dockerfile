FROM java:8
ADD . /code
WORKDIR /code
RUN apt-get update
RUN apt-get install zip -y
RUN curl -s https://get.sdkman.io | bash
RUN /bin/bash -c "source /root/.sdkman/bin/sdkman-init.sh"
RUN sdk install gradle 3.3