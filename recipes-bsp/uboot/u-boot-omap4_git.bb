require ../meta/recipes-bsp/uboot/u-boot.inc

BRANCH="omap4-exp"
TAG="fc1671a814bb9fdb07ac9d216fb307a5ebac6efa"
SRC_URI = "git://www.sakoman.com/git/u-boot.git;branch=${BRANCH};protocol=git"
SRCREV = "${TAG}"

PV="2010-09-rc1"
PR="r1"

UBOOT_MACHINE_pandaboard = "omap4_panda_config"
UBOOT_MACHINE_sdp4430 = "omap4_sdp4430_config"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(pandaboard|sdp4430)"
