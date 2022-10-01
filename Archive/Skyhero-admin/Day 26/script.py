#!/usr/bin/env python3

# Import all from pwntools library
from pwn import *

# Create connection with remote service
conn = remote("google.com", 80)

# Send data request
conn.send(b"GET /\r\n")

# Receive one line of reponse from server
line = conn.recvline()
print(line)

# Close connection when we are done
conn.close()
