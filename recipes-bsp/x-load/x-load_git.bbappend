THISDIR := "${@os.path.dirname(bb.data.getVar('FILE', d, True))}"
FILESPATH =. "${@base_set_filespath(["${THISDIR}/${PN}"], d)}:"

XLOAD_MACHINE = "omap4430panda_config"
XLOAD_LOAD_ADDRESS = 0x40304350
COMPATIBLE_MACHINE = "pandaboard"
