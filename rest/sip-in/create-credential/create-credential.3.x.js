// Download the Node helper library from twilio.com/docs/node/install
// These consts are your accountSid and authToken from https://www.twilio.com/console
const accountSid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX';
const authToken = 'your_auth_token';
const client = require('twilio')(accountSid, authToken);

client.sip.credentialLists('CL32a3c49700934481addd5ce1659f04d2')
  .credentials
  .create({
    username: 'WeeBey',
    password: '05',
  })
  .then((credential) => {
    process.stdout.write(credential.sid);
  });
