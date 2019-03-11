/**
 * Location API
 * Geolocation, Geocoding and Maps
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAITimezoneApi.h"
#include "OAIHelpers.h"
#include "OAIModelFactory.h"
#include "OAIQObjectWrapper.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace OpenAPI {

OAITimezoneApi::OAITimezoneApi() {}

OAITimezoneApi::~OAITimezoneApi() {}

OAITimezoneApi::OAITimezoneApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
OAITimezoneApi::timezone(double lat, double lon) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/timezone.php");


    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("lat"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(lat)));

    if (fullPath.indexOf("?") > 0)
      fullPath.append("&");
    else
      fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("lon"))
        .append("=")
        .append(QUrl::toPercentEncoding(stringValue(lon)));


    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAITimezoneApi::timezoneCallback);

    worker->execute(&input);
}

void
OAITimezoneApi::timezoneCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QString json(worker->response);
    OAIObject* output = static_cast<OAIObject*>(create(json, QString("OAIObject")));
    auto wrapper = new OAIQObjectWrapper<OAIObject*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit timezoneSignal(output);
    } else {
        emit timezoneSignalE(output, error_type, error_str);
        emit timezoneSignalEFull(worker, error_type, error_str);
    }
}


}