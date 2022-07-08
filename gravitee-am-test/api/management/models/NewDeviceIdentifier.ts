/* tslint:disable */
/* eslint-disable */
/**
 * Gravitee.io - Access Management API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface NewDeviceIdentifier
 */
export interface NewDeviceIdentifier {
    /**
     * 
     * @type {string}
     * @memberof NewDeviceIdentifier
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof NewDeviceIdentifier
     */
    type: string;
    /**
     * 
     * @type {string}
     * @memberof NewDeviceIdentifier
     */
    name: string;
    /**
     * 
     * @type {string}
     * @memberof NewDeviceIdentifier
     */
    configuration: string;
}

export function NewDeviceIdentifierFromJSON(json: any): NewDeviceIdentifier {
    return NewDeviceIdentifierFromJSONTyped(json, false);
}

export function NewDeviceIdentifierFromJSONTyped(json: any, ignoreDiscriminator: boolean): NewDeviceIdentifier {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': !exists(json, 'id') ? undefined : json['id'],
        'type': json['type'],
        'name': json['name'],
        'configuration': json['configuration'],
    };
}

export function NewDeviceIdentifierToJSON(value?: NewDeviceIdentifier | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'type': value.type,
        'name': value.name,
        'configuration': value.configuration,
    };
}
