# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "The ROS specific CMake bits in the ament buildsystem."
AUTHOR = "Michel Hidalgo <michel@ekumenlabs.com>"
ROS_AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ament_cmake_ros"
ROS_BPN = "ament_cmake_ros"

ROS_BUILD_DEPENDS = " \
    domain-coordinator \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    domain-coordinator \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-gmock-native \
    ament-cmake-gtest-native \
    ament-cmake-native \
    ament-cmake-pytest-native \
"

ROS_EXEC_DEPENDS = " \
    domain-coordinator \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ament_cmake_ros-release/archive/release/humble/ament_cmake_ros/0.10.0-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/ament_cmake_ros"
SRC_URI = "git://github.com/ros2-gbp/ament_cmake_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "6acf4d960db2b92025ba4ca3e86b5d5240f817d1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
