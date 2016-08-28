EXTRA_DEPS = ""
EXTRA_DEPS_dart-sd410 = "qrtr-apps gnss-gpsd qdsp-config"

RDEPENDS_${PN} += "${EXTRA_DEPS}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

ALLOW_EMPTY_${PN} = "1"
