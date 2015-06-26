/* jshint latedef:false */
/* jshint forin:false */
/* jshint noempty:false */

'use strict';

var util = require('util');
var msRest = require('ms-rest');
var msRestAzure = require('ms-rest-azure');
var ServiceClient = msRestAzure.AzureServiceClient;
var WebResource = msRest.WebResource;

var models = require('./models');
var operations = require('./operations');

/**
 * @class
 * Initializes a new instance of the MicrosoftAzureTestUrl class.
 * @constructor
 *
 * @param {ServiceClientCredentials} credentials - Credentials for
 * authenticating with the service.
 *
 * @param {string} [baseUri] - The base URI of the service.
 *
 * @param {object} [options] - The parameter options
 *
 * @param {Array} [options.filters] - Filters to be added to the request pipeline
 *
 * @param {object} [options.requestOptions] - Options for the underlying request object
 * {@link https://github.com/request/request#requestoptions-callback Options doc}
 *
 * @param {bool} [options.noRetryPolicy] - If set to true, turn off default retry policy
 */
function MicrosoftAzureTestUrl(credentials, baseUri, options) {
  if (!credentials) {
    throw new Error('credentials cannot be null.');
  }

  if (!options) options = {};
  MicrosoftAzureTestUrl['super_'].call(this, credentials, options);
  this.baseUri = baseUri;
  this.credentials = credentials;
  if (!this.baseUri) {
    this.baseUri = 'https://management.azure.com/';
  }

  if (!this.apiVersion) {
    this.apiVersion = "2014-04-01-preview";
  }
  this.groupOperations = new operations.GroupOperations(this);
    this._models = models;
}

util.inherits(MicrosoftAzureTestUrl, ServiceClient);

module.exports = MicrosoftAzureTestUrl;
