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
 * @interface NewGroup
 */
export interface NewGroup {
    /**
     * 
     * @type {string}
     * @memberof NewGroup
     */
    name: string;
    /**
     * 
     * @type {string}
     * @memberof NewGroup
     */
    description?: string;
    /**
     * 
     * @type {Array<string>}
     * @memberof NewGroup
     */
    members?: Array<string>;
}

export function NewGroupFromJSON(json: any): NewGroup {
    return NewGroupFromJSONTyped(json, false);
}

export function NewGroupFromJSONTyped(json: any, ignoreDiscriminator: boolean): NewGroup {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'name': json['name'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'members': !exists(json, 'members') ? undefined : json['members'],
    };
}

export function NewGroupToJSON(value?: NewGroup | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'name': value.name,
        'description': value.description,
        'members': value.members,
    };
}
