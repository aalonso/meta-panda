require x-load.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/x-load-omap4-git/${MACHINE}"

TAG="L24.11"
BRANCH="omap4_dev"
PV = "1.41-ti-${BRANCH}"
PR="r2"

SRC_URI = "git://dev.omapzoom.org/pub/scm/bootloader/x-loader.git;branch=${BRANCH};protocol=git"
SRCREV = "${TAG}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(pandaboard|sdp4430)"

XLOAD_LOAD_ADDRESS = 0x40304350
XLOAD_MACHINE_pandaboard="omap4430panda_config"
XLOAD_MACHINE_sdp4430="omap4430sdp_config"
