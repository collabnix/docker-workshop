FROM       python:3
LABEL      maintainer="Sela Labs <@selalabs>"

ENV        REDIS_URL="redis://localhost:6379"

WORKDIR    /app
COPY       requirements.txt /app/
RUN        pip install -r requirements.txt

COPY       *.py /app/
RUN        chmod a+x *.py

CMD        ["./main.py"]
