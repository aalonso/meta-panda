require recipes-bsp/uboot/u-boot.inc
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4c6cde5df68eff615d36789dc18edd3b \
                    file://README;beginline=1;endline=22;md5=3a00ef51d3fc96e9d6c1bc4708ccd3b5"
BRANCH="omap4-exp"
TAG="261733408a27d14590cf3ec6b596461808050e32"
SRC_URI = "git://www.sakoman.com/git/u-boot.git;branch=${BRANCH};protocol=git"
SRCREV = "${TAG}"

PV="2010-09-rc1"
PR="r3"

UBOOT_MACHINE_pandaboard = "omap4_panda_config"
UBOOT_MACHINE_sdp4430 = "omap4_sdp4430_config"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(pandaboard|sdp4430)"
