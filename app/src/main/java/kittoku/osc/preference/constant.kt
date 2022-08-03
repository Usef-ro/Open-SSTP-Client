package kittoku.osc.preference


internal enum class OscPreference {
    ROOT_STATE,
    HOME_HOSTNAME,
    HOME_USERNAME,
    HOME_PASSWORD,
    HOME_CONNECTOR,
    HOME_STATUS,
    SSL_PORT,
    SSL_VERSION,
    SSL_DO_VERIFY,
    SSL_DO_ADD_CERT,
    SSL_CERT_DIR,
    SSL_DO_SELECT_SUITES,
    SSL_SUITES,
    PPP_MRU,
    PPP_MTU,
    PPP_PAP_ENABLED,
    PPP_MSCHAPv2_ENABLED,
    PPP_AUTH_TIMEOUT,
    PPP_IPv4_ENABLED,
    PPP_IPv6_ENABLED,
    ROUTE_DO_ADD_DEFAULT_ROUTE,
    ROUTE_DO_ROUTE_PRIVATE_ADDRESSES,
    ROUTE_DO_ADD_CUSTOM_ROUTES,
    ROUTE_CUSTOM_ROUTES,
    RECONNECTION_ENABLED,
    RECONNECTION_COUNT,
    RECONNECTION_INTERVAL,
    RECONNECTION_LIFE,
    BUFFER_INCOMING,
    BUFFER_OUTGOING,
    LOG_DO_SAVE_LOG,
    LOG_DIR,
    LINK_OSC,
}
