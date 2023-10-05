/**
 * Class representing a contributor.
 */
class Contributor {
    /**
     * Create a contributor.
     * @param {string} name - The name of the contributor.
     * @param {string} email - The email of the contributor.
     * @param {string} githubUsername - The GitHub username of the contributor.
     * @param {string} githubProfileUrl - The GitHub profile URL of the contributor.
     */
    constructor(name, email, githubUsername, githubProfileUrl) {
        this.name = name;
        this.email = email;
        this.githubUsername = githubUsername;
        this.githubProfileUrl = githubProfileUrl;
        Object.freeze(this);
    }

    /**
     * Get the contributor's information as a formatted string.
     * @return {string} The contributor's information.
     */
    toString() {
        return `${this.name} (${this.githubUsername}): ${this.githubProfileUrl}`;
    }
}

// Usage:
// Use your fullname to create a new contributor object.
// If unable to use your full name, use your github username instead.
const TestUser = new Contributor("Test User", "testuser@email.com", "testSuperHero", "https://github.com/testPseudoUrl");

const NitkarshChouarsia = new Contributor("Nitkarsh Chouarsia", "playnitkarsh@gmail.com", "NitkarshChouarsia", "https://github.com/NitkarshChouarsia");

const PurshotamBohra = new Contributor("Purshotam Bohra", "test@gmail.com", "test_username", "test_url");

if (require.main == module) {

    // Test User.

    // Either use console.log() or use toString() method to print the contributor's information.
    // or use both, as shown below.
    console.log(TestUser.toString());
    console.log(TestUser);

    // Authentic Contributors.

    console.log(NitkarshChouarsia.toString());
    console.log(NitkarshChouarsia)

    console.log(PurshotamBohra.toString());
    console.log(PurshotamBohra);
}
