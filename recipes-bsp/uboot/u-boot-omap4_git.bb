require ../meta/recipes-bsp/uboot/u-boot.inc

BRANCH="omap4_panda_L24.9"
SRC_URI = "git://gitorious.org/pandaboard/u-boot.git;branch=${BRANCH};protocol=git"
SRCREV = "cebe815a605f7e0ca658d6c512bc580170bc6888"

PV="2010-09-rc1-ti-${BRANCH}"
PR="r2"

UBOOT_MACHINE_pandaboard = "omap4430panda_config"
UBOOT_MACHINE_sdp4430 = "omap4430sdp_config"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "(pandaboard|sdp4430)"
