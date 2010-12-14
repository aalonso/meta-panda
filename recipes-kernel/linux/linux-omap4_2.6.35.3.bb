require ../meta/recipes-kernel/linux/linux-omap2.inc

THISDIR := "${@os.path.dirname(bb.data.getVar('FILE', d, True))}"
FILESPATH =. "${@base_set_filespath(["${THISDIR}/${PN}"], d)}:"

TAG="6aba79f8f85b937596373cda8e266b823395996e"
BRANCH="ti-omap4"
PR="r0"

SRC_URI = "git://kernel.ubuntu.com/ubuntu/ubuntu-maverick.git;branch=${BRANCH}protocol=git \
           file://defconfig"
SRCREV = "${TAG}"

S = "${WORKDIR}/git"
COMPATIBLE_MACHINE = "pandaboard"
