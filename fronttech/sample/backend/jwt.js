const jwt = require("jsonwebtoken");

const TiaJWT = {
    ecrypt: function (data, privateKey, time) {
        return jwt.sign(data, privateKey, { expiresIn: time });
    },

    decrypt: function (token, privateKey) {
        try {
            let data = jwt.verify(token, privateKey, function(err, dedecoded) {
                if( err ) {
                    if( err.name == "TokenExpiredError" && err.message == "jwt expired" ) {
                        console.log(`JWT verify TokenExpiredError expiredAt ${err.expiredAt}]`);
                        return {
                            result: false,
                            timeout: true,
                            expiredAt: err.expiredAt,
                        };
                    } else {
                        console.log(`JWT verify ${err.name} err ${err.message}]`);
                        return {
                            result: false,
                            timeout: false,
                            err: err.message,
                        };
                    }
                } else {
                    console.log(`JWT verify OK ${dedecoded}]`);
                    return {
                        result: true,
                        timeout: false,
                        userid: dedecoded,
                    };
                }
            });
            return data;
        } catch (e) {
            console.log(`JWT verify NG. Token: ${token} err: ${e}`);
            return {
                result: false,
                timeout: false,
                err: "verify err",
            };
        }
    },
}

module.exports = TiaJWT;