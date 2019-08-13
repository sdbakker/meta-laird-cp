DESCRIPTION = "CP Summit Sample Image"
LICENSE = "MIT"

IMAGE_FSTYPES = "sdcard.xz tar.bz2"

inherit core-image

export IMAGE_BASENAME = "${PN}"

IMAGE_FEATURES += "\
	ssh-server-dropbear \
	splash \
	"

IMAGE_FEATURES_remove = "\
	tools-profile \
	tools-debug \
	tools-testapps \
	"

IMAGE_INSTALL += "\
	net-config \
	usb-gadget \
	iproute2 \
	rng-tools \
	ca-certificates \
	tzdata \
	alsa-utils \
	htop \
	ethtool \
	iperf3 \
	tcpdump \
	iw \
	summit-backports-laird \
	summit60-firmware-sdio-sdio \
	summit60-firmware-sdio-uart \
	summit60-firmware-pcie-uart \
	summit60-firmware-pcie-usb \
	summit60-firmware-usb-uart \
	summit-supplicant-openssl10 \
	laird-networkmanager \
	"
