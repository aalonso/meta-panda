require ../meta/recipes-kernel/linux/linux-omap2.inc

COMPATIBLE_MACHINE = "pandaboard"

BRANCH="L24.11"
TAG="ti-2.6.35-omap4-L24.11-p3"
PV = "${TAG}"
PR = "r1"

SRC_URI = "git://dev.omapzoom.org/pub/scm/integration/kernel-omap4.git;branch=${BRANCH};protocol=git"
SRCREV = "${TAG}"

S = "${WORKDIR}/git"

do_configure_prepend() {
    cp -p ${S}/arch/arm/configs/omap_4430sdp_defconfig ${WORKDIR}/defconfig
}
