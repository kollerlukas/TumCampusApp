package de.tum.`in`.tumcampusapp.utils

/**
 * Contains different constants used by several classes. Allows a unified access.
 */
object Const {
    const val MENSA_FOR_FAVORITEDISH = "FavoriteDishCafeteriaID"
    const val ACCESS_TOKEN = "access_token"
    const val ACTION_EXTRA = "action"
    const val BACKGROUND_MODE = "background_mode"
    const val CAFETERIA_ID = "cafeteriasId"
    const val CAFETERIA_DATE = "cafeteriaDate"
    const val CAFETERIAS = "cafeterias"
    const val CALENDAR_WEEK_MODE = "calender_week_mode"
    const val EVENT_BOOKED_MODE = "event_booked_mode"
    const val COMPLETED = "completed"
    const val DATABASE_NAME = "database.db"
    const val DATE = "date"
    const val DOWNLOAD_ALL_FROM_EXTERNAL = "download_all_from_external"
    const val ERROR = "error"
    const val MESSAGE = "message"
    const val FORCE_DOWNLOAD = "force_download"
    const val LRZ_ID = "lrz_id"
    const val NEWS = "news"
    const val EVENTS = "events"
    const val KINO = "kino"
    const val STUDY_ROOM_GROUP_ID = "study_room_group_id"
    const val ROLE = "card_role"
    const val SILENCE_ON = "silence_on"
    const val SILENCE_SERVICE = "silent_mode"
    const val SILENCE_OLD_STATE = "silence_old_state"
    const val TITLE_EXTRA = "title"

    const val API_HOSTNAME = "tumcabe.in.tum.de"
    const val API_HOSTNAME_NEW = "app.tum.de"
    const val STUDY_ROOMS_HOSTNAME = "www.devapp.it.tum.de"

    const val CURRENT_CHAT_ROOM = "current_chat_room"
    const val CHAT_ROOM_DISPLAY_NAME = "chat_room_display_name"
    const val CHAT_ROOM_NAME = "chat_room_name"

    const val PRIVATE_KEY = "chat_member_private_key"
    const val PUBLIC_KEY = "chat_member_public_key"
    const val PUBLIC_KEY_UPLOADED = "chat_member_public_key_uploaded"

    const val TUMO_PIDENT_NR = "pIdentNr"
    const val TUMO_STUDENT_ID = "tumoStudentNr"
    const val TUMO_EXTERNAL_ID = "tumoExternNr"
    const val TUMO_EMPLOYEE_ID = "tumoBediensteteNr"
    const val TUMO_DISABLED = "tumo_is_disabled"

    const val FCM_REG_ID = "gcm_registration_id"
    const val FCM_REG_ID_SENT_TO_SERVER = "gcm_registration_id_sent_to_server"
    const val FCM_REG_ID_LAST_TRANSMISSION = "gcm_registration_id_last_transmission"
    const val FCM_INSTANCE_ID = "gcm_instance_id"
    const val FCM_TOKEN_ID = "gcm_token_id"
    const val APP_LAUNCHES = "app_launches"
    const val SYNC_CALENDAR = "sync_calendar"
    const val PREFERENCE_SCREEN = "preference_screen"
    const val P_TOKEN = "pToken"

    const val EVERYTHING_SETUP = "everything_setup"
    const val SYNC_CALENDAR_IMPORT = "calendar_import"
    const val GROUP_CHAT_ENABLED = "group_chat_enabled"
    const val BUG_REPORTS = "bug_reports"
    const val DEFAULT_CAMPUS = "card_default_campus"
    const val AUTO_JOIN_NEW_ROOMS = "auto_join_new_rooms"
    const val CHAT_MEMBER = "chat_member"
    const val POSITION = "position"

    const val PREF_UNIQUE_ID = "PREF_UNIQUE_ID"

    const val URL_ROOM_FINDER_API = "/Api/roomfinder/room/"
    const val URL_DEFAULT_MAP_IMAGE = "https://$API_HOSTNAME${URL_ROOM_FINDER_API}defaultMap/"
    const val URL_MAP_IMAGE = "https://$API_HOSTNAME${URL_ROOM_FINDER_API}map/"
    const val ROOM_ID = "room_id"

    const val KEY_NOTIFICATION_ID = "notificationID"
    const val KEY_NOTIFICATION = "notification"

    const val NOTIFICATION_CHANNEL_DEFAULT = "general"
    const val NOTIFICATION_CHANNEL_CHAT = "chat"
    const val NOTIFICATION_CHANNEL_EDUROAM = "eduroam"
    const val NOTIFICATION_CHANNEL_CAFETERIA = "cafeteria"
    const val NOTIFICATION_CHANNEL_MVV = "mvv"
    const val NOTIFICATION_CHANNEL_EMERGENCY = "emergency"

    const val BACKGROUND_SERVICE_JOB_ID = 1000
    const val SEND_MESSAGE_SERVICE_JOB_ID = 1001
    const val SILENCE_SERVICE_JOB_ID = 1002
    const val SEND_WIFI_SERVICE_JOB_ID = 1003
    const val DOWNLOAD_SERVICE_JOB_ID = 1004
    const val FILL_CACHE_SERVICE_JOB_ID = 1005

    const val FEEDBACK_MESSAGE = "feedback_message"
    const val FEEDBACK_PIC_PATHS = "feedback_paths"
    const val FEEDBACK_INCL_EMAIL = "feedback_include_email"
    const val FEEDBACK_INCL_LOCATION = "feedback_incl_location"
    const val FEEDBACK_TOPIC = "feedback_topic"
    const val FEEDBACK_EMAIL = "feedback_reply_to"
    const val FEEDBACK_IMG_COMPRESSION_QUALITY = 50;
    const val FEEDBACK_TOPIC_GENERAL = "general"
    const val FEEDBACK_TOPIC_APP = "tca"

    const val EXTRA_FOREIGN_CONFIGURATION_EXISTS = "CONFIGURED_BY_OTHER_APP"
    const val GEOFENCING_SERVICE_JOB_ID = 1006
    const val ADD_GEOFENCE_EXTRA = "AddGeofence"
    const val DISTANCE_IN_METER = 50 * 1000f
    const val MUNICH_GEOFENCE = "geofence_munich_id"

    const val TUM_ID_PATTERN = "^[a-z]{2}[0-9]{2}[a-z]{3}$"

    const val WIFI_SCANS_ALLOWED = "WIFI_SCANS_ALLOWED"
    const val WIFI_SCAN_MINIMUM_BATTERY_LEVEL = "WIFI_SCAN_MINIMUM_BATTERY_LEVEL"

    const val CARD_POSITION_PREFERENCE_SUFFIX = "_card_position"
    const val DISCARD_SETTINGS_START = "discard_settings_start"
    const val DISCARD_SETTINGS_PHONE = "discard_settings_phone"
    const val CALENDAR_ID_PARAM = "calendar_id"

    const val RAINBOW_MODE = "rainbow_enabled"
    const val REFRESH_CARDS = "refresh_cards"
    const val EDUROAM_SSID = "eduroam"
    const val LRZ = "lrz"

    const val CHAT_BROADCAST_NAME = "chat-message-received"

    const val EVENT_EDIT = "pEdit"
    const val EVENT_TITLE = "pTitel"
    const val EVENT_COMMENT = "pAnmerkung"
    const val EVENT_START = "pVon"
    const val EVENT_END = "pBis"
    const val EVENT_NR = "pTerminNr"

    const val EVENT_TIME = "event_time"

    const val KINO_DATE = "kinoDate"

    const val CALENDAR_MONTHS_BEFORE = 2
    const val CALENDAR_MONTHS_AFTER = 2

    const val PDF_TITLE = "pdfTitle"
    const val PDF_PATH = "pdfPath"

    const val TOP_NEWS = "topNewsDownload"
    const val NEWS_ALERT_IMAGE = "newsAlertImageURL"
    const val NEWS_ALERT_LINK = "newsAlertLink"
    const val NEWS_ALERT_SHOW_UNTIL = "newsAlertShowUntil"

    const val CONTACTS_PERMISSION_REQUEST_CODE = 0
    const val PERSON_SEARCH_TUM_REQUEST_KEY = "pSuche"

    const val TUM_CAMPUS_URL = "http://campus.tum.de"

    const val TUM_ONLINE_PROFILE_PICTURE_URL_FORMAT_STRING = "https://campus.tum.de/tumonline/visitenkarte.showImage?pPersonenGruppe=%s&pPersonenId=%s"

    const val CALENDAR_FILTER_CANCELED = "calendar_filter_canceled"
    const val CALENDAR_FILTER_HOUR_LIMIT_MIN = "calendar_filter_hour_limit_min"
    const val CALENDAR_FILTER_HOUR_LIMIT_MAX = "calendar_filter_hour_limit_max"
    const val CALENDAR_FILTER_HOUR_LIMIT_MIN_DEFAULT = "8"
    const val CALENDAR_FILTER_HOUR_LIMIT_MAX_DEFAULT = "20"

    const val KEY_NOTIFICATION_TYPE_ID = "type_id"

    const val STRIPE_API_PUBLISHABLE_KEY = "pk_test_OJHHpeotVOpaRO4veynROu18"
    const val KEY_EVENT = "event"
    const val KEY_EVENT_ID = "eventId"
    const val KEY_CARD_HOLDER = "cardholder"
    const val KEY_TICKET_PRICE = "ticketPrice"
    const val KEY_TICKET_HISTORY = "ticketHistory"
}
