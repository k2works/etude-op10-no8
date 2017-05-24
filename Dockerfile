FROM gradle
ADD . /code
WORKDIR /code
CMD ["gradle","build"]