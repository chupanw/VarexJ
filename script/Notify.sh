#!/usr/bin/env bash

curl -s \
    --form-string "token=aFKUW1adj9jixGsdxQzvHevEF842SN" \
    --form-string "user=u7S6GK9mf5tzrrNmkjcv6QWKiapDAp" \
    --form-string "message=Execution finished" \
    --form-string "device=iphone5s" \
    --form-string "title=Message from Mac Pro" \
    https://api.pushover.net/1/messages.json

echo ""