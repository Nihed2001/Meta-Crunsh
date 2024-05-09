SUMMARY = "Crunch Application"
DESCRIPTION = "Crunch application."
HOMEPAGE = " https://github.com/pri1311/crunch"

LICENSE = "CLOSED"

SRC_URI = "git://github.com/pri1311/crunch.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
SRCREV = "76114303ca0cf75df7462159323b35a2048e8b3e"

do_configure[noexec] = "1"
do_compile[noexec] = "1"
PYTHON_PN = "python3"
# Runtime dependencies
RDEPENDS:${PN} += " \
    python3-flask \
    python3-flask-login \
    python3-flask-socketio \
    python3-flask-sqlalchemy \
    python3-itsdangerous \
    python3-jinja2 \
    python3-markupsafe \
    python3-engineio \
    python3-socketio \
    python3-six \
    python3-sqlalchemy \
    python3-urllib3 \
    python3-werkzeug \
    python3-gunicorn \
    python3-click \
    python3-certifi \
    python3-sqlite3 \
    python3-cloudinary \
    "
do_install() {
    install -d ${D}/opt
    cp -r * ${D}/opt
}

FILES:${PN} += "/opt"
