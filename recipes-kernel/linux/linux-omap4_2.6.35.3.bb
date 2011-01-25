require recipes-kernel/linux/linux-omap2.inc

THISDIR := "${@os.path.dirname(bb.data.getVar('FILE', d, True))}"
FILESPATH =. "${@base_set_filespath(["${THISDIR}/${PN}"], d)}:"

LICENSE = "GPL"
LECENSE_FILES_CHECKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

TAG="6aba79f8f85b937596373cda8e266b823395996e"
BRANCH="ti-omap4"
PR="r3"

SRC_URI = "git://kernel.ubuntu.com/ubuntu/ubuntu-maverick.git;branch=${BRANCH};protocol=git \
           file://defconfig"
SRCREV = "${TAG}"

S = "${WORKDIR}/git"
COMPATIBLE_MACHINE = "pandaboard"

kernel_do_deploy() {
    install -m 0644 arch/${ARCH}/boot/${KERNEL_IMAGETYPE} ${DEPLOYDIR}/${KERNEL_IMAGE_BASE_NAME}.bin
    if (grep -q -i -e '^CONFIG_MODULES=y$' .config); then
        tar -cvzf ${DEPLOYDIR}/modules-${KERNEL_VERSION}-${PR}-${MACHINE}.tgz -C ${D} lib
    fi

    if test "x${KERNEL_IMAGETYPE}" = "xuImage" ; then
        if test -e arch/${ARCH}/boot/uImage ; then
            ${OBJCOPY} -O binary -R .note -R .comment -S arch/${ARCH}/boot/compressed/vmlinux linux.bin
            uboot-mkimage -A ${ARCH} -O linux -T kernel -C none -a ${UBOOT_ENTRYPOINT} -e ${UBOOT_ENTRYPOINT} -n "${DISTRO_NAME}/${PV}/${MACHINE}" -d linux.bin ${DEPLOYDIR}/${KERNEL_IMAGE_BASE_NAME}.bin
            rm -f linux.bin
        fi
    fi

    cd ${DEPLOYDIR}
    rm -f ${KERNEL_IMAGE_SYMLINK_NAME}.bin
    ln -sf ${KERNEL_IMAGE_BASE_NAME}.bin ${KERNEL_IMAGE_SYMLINK_NAME}.bin
}
