# Enable freedreno driver
GALLIUMDRIVERS_append_dart-sd410 = ",freedreno"

PACKAGECONFIG_append_dart-sd410 = " gallium \
                         ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'xa', '', d)} \
                       "
