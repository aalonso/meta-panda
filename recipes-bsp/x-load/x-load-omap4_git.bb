require x-load.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/x-load-omap4-git/${MACHINE}"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;beginline=1;endline=25;md5=ef08d08cb99057bbb5b9d6d0c5a4396f"

TAG = "accb403c3f14d1d4797bb2262cce0c8bb8d4a765"
BRANCH="master"
PV = "1.41-ti-${BRANCH}"
PR="r4"

SRC_URI = "git://www.sakoman.com/git/x-loader.git;branch=${BRANCH};protocol=git"
SRCREV = "${TAG}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(pandaboard|sdp4430)"

XLOAD_LOAD_ADDRESS = 0x40304350
XLOAD_MACHINE_pandaboard="omap4430panda_config"
XLOAD_MACHINE_sdp4430="omap4430sdp_config"
