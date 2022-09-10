SUMMARY = "Client side implementation for TREZOR-compatible Blackcoin hardware wallets."

HOMEPAGE = "https://github.com/CryptoLover705/Blackcoin_PiTrezor"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=a7a390d1c6d31d9e293b723cb92e23cb"

SRC_URI = "gitsm://github.com/CryptoLover705/Blackcoin_PiTrezor.git"
SRCREV = "a84b7dcef8d0fc990470e90d640294167aa136ba"
S="${WORKDIR}/git"

SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

BBCLASSEXTEND = "native nativesdk"

inherit setuptools3

DEPENDS += " protobuf-native python3-protobuf-native python3-six-native "
