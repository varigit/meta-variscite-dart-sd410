# Copyright (C) 2014 Linaro
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Linaro Qualcomm Landing team 4.2 Kernel"

require recipes-kernel/linux/linux-linaro-qcom.inc
require recipes-kernel/linux/linux-dtb.inc
require recipes-kernel/linux/linux-qcom-bootimg.inc

SRCBRANCH = "release/qcomlt-4.2"
SRCREV = "d9e72b03cd9ce0096b991498aa1847c81ae4439a"

COMPATIBLE_MACHINE = "(dart-sd410)"

KERNEL_DEFCONFIG_dart-sd410 ?= "${S}/arch/arm64/configs/defconfig"
KERNEL_CONFIG_FRAGMENTS += "${S}/kernel/configs/distro.config"
KERNEL_IMAGETYPE_dragonboard-410c ?= "Image"
KERNEL_DEVICETREE_dart-sd410 = "qcom/apq8016-sbc.dtb"


# Wifi firmware has a recognizable arch :( 
ERROR_QA_remove = "arch"
QCOM_BOOTIMG_ROOTFS_dart-sd410 = "mmcblk0p10"
