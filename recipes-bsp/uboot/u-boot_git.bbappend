THISDIR := "${@os.path.dirname(bb.data.getVar('FILE', d, True))}"
FILESPATH =. "${@base_set_filespath(["${THISDIR}/${PN}"], d)}:"

# Append Pandaboard support
UBOOT_MACHINE_pandaboard = "omap4_panda_config"
COMPATIBLE_MACHINE = "pandaboard"
