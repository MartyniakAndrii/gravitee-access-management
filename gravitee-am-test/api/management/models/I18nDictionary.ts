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
 * @interface I18nDictionary
 */
export interface I18nDictionary {
    /**
     * 
     * @type {string}
     * @memberof I18nDictionary
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof I18nDictionary
     */
    referenceId?: string;
    /**
     * 
     * @type {string}
     * @memberof I18nDictionary
     */
    referenceType?: I18nDictionaryReferenceTypeEnum;
    /**
     * 
     * @type {string}
     * @memberof I18nDictionary
     */
    name?: string;
    /**
     * 
     * @type {string}
     * @memberof I18nDictionary
     */
    locale?: string;
    /**
     * 
     * @type {number}
     * @memberof I18nDictionary
     */
    createdAt?: number;
    /**
     * 
     * @type {number}
     * @memberof I18nDictionary
     */
    updatedAt?: number;
    /**
     * 
     * @type {{ [key: string]: string; }}
     * @memberof I18nDictionary
     */
    entries?: { [key: string]: string; };
}


/**
 * @export
 */
export const I18nDictionaryReferenceTypeEnum = {
    Platform: 'PLATFORM',
    Domain: 'DOMAIN',
    Application: 'APPLICATION',
    Organization: 'ORGANIZATION',
    Environment: 'ENVIRONMENT'
} as const;
export type I18nDictionaryReferenceTypeEnum = typeof I18nDictionaryReferenceTypeEnum[keyof typeof I18nDictionaryReferenceTypeEnum];


export function I18nDictionaryFromJSON(json: any): I18nDictionary {
    return I18nDictionaryFromJSONTyped(json, false);
}

export function I18nDictionaryFromJSONTyped(json: any, ignoreDiscriminator: boolean): I18nDictionary {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': !exists(json, 'id') ? undefined : json['id'],
        'referenceId': !exists(json, 'referenceId') ? undefined : json['referenceId'],
        'referenceType': !exists(json, 'referenceType') ? undefined : json['referenceType'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'locale': !exists(json, 'locale') ? undefined : json['locale'],
        'createdAt': !exists(json, 'createdAt') ? undefined : json['createdAt'],
        'updatedAt': !exists(json, 'updatedAt') ? undefined : json['updatedAt'],
        'entries': !exists(json, 'entries') ? undefined : json['entries'],
    };
}

export function I18nDictionaryToJSON(value?: I18nDictionary | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'referenceId': value.referenceId,
        'referenceType': value.referenceType,
        'name': value.name,
        'locale': value.locale,
        'createdAt': value.createdAt,
        'updatedAt': value.updatedAt,
        'entries': value.entries,
    };
}

