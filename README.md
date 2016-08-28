# meta-qcom

## Introduction

OpenEmbedded/Yocto Project layer for Qualcomm based platforms.

This layer depends on:

```
URI: git://github.com/openembedded/oe-core.git
layers: meta
branch: master
revision: HEAD
```

## EULA

Some SoC depends on firmware and/or packages that are covered by
Qualcomm EULA. To have the right to use those binaries in your images
you need to read and accept the EULA available as:

conf/eula/$MACHINE, e.g. conf/eula/dart-sd410

In order to accept it, you should add, in your local.conf file:

ACCEPT_EULA_$MACHINE = "1", e.g.: ACCEPT_EULA_dart-sd410 = "1"

If you do not accept the EULA the generated image will be missing some
components and features.

## Maintainer(s)

Leonid Segal <Leonid.s@variscite.com>
