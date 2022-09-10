# Blackcoin-pitrezor
This code is used to build the linux platform image for the raspberry pi zero to be able to run the pitrezor software at bootup.

## Quick start (Items you will need for this project)
all items you will need are listed in [quickstart.md](https://github.com/CryptoLover705/Blackcoin_PiTrezor/blob/main/quickstart.md)



1. [Install Docker](https://docs.docker.com/engine/installation/)
2. `git clone https://github.com/CryptoLover705/Blackcoin_PiTrezor.git`
3. `cd Blackcoin_PiTrezor`
4. `sudo ./build-pitrezor.sh TAG` (where TAG is 1.9.3.0 for example, if left blank the script builds latest commit in master branch)

This creates file `build/pitrezor-TAG.zip` .

