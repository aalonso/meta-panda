require ../meta/recipes-bsp/x-load/x-load.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/x-load-omap4-git/${MACHINE}"

BRANCH="omap4_panda_L24.9"
PV = "1.41-ti-${BRANCH}"
PR="r2"

SRC_URI = "git://gitorious.org/pandaboard/x-loader.git;branch=${BRANCH};protocol=git"
SRCREV = "a41abea82b5f02265cd9f7140f0f10be3a9c97e7"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(pandaboard|sdp4430)"

XLOAD_MACHINE_pandaboard="omap4430panda_config"
XLOAD_MACHINE_sdp4430="omap4430sdp_config"
