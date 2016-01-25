GST_BAD_OPENGL_FEATURES= "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'gles2', 'opengl', d)}"

# We want OpenGL with freedreno for our machines
PACKAGECONFIG_GL_dart-sd410 = "${@bb.utils.contains('DISTRO_FEATURES', 'opengl', '${GST_BAD_OPENGL_FEATURES}', '', d)}"
