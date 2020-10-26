package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("12")
class Record_673 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 673: FirstName is Scottie")
	void FirstNameOfRecord673() {
		assertEquals("Scottie", customers.get(672).getFirstName());
	}

	@Test
	@DisplayName("Record 673: LastName is Mellado")
	void LastNameOfRecord673() {
		assertEquals("Mellado", customers.get(672).getLastName());
	}

	@Test
	@DisplayName("Record 673: Company is St Francis De Sls Fedl Crdt Un")
	void CompanyOfRecord673() {
		assertEquals("St Francis De Sls Fedl Crdt Un", customers.get(672).getCompany());
	}

	@Test
	@DisplayName("Record 673: Address is 317 S Norfolk St")
	void AddressOfRecord673() {
		assertEquals("317 S Norfolk St", customers.get(672).getAddress());
	}

	@Test
	@DisplayName("Record 673: City is San Mateo")
	void CityOfRecord673() {
		assertEquals("San Mateo", customers.get(672).getCity());
	}

	@Test
	@DisplayName("Record 673: County is San Mateo")
	void CountyOfRecord673() {
		assertEquals("San Mateo", customers.get(672).getCounty());
	}

	@Test
	@DisplayName("Record 673: State is CA")
	void StateOfRecord673() {
		assertEquals("CA", customers.get(672).getState());
	}

	@Test
	@DisplayName("Record 673: ZIP is 94401")
	void ZIPOfRecord673() {
		assertEquals("94401", customers.get(672).getZIP());
	}

	@Test
	@DisplayName("Record 673: Phone is 650-340-9560")
	void PhoneOfRecord673() {
		assertEquals("650-340-9560", customers.get(672).getPhone());
	}

	@Test
	@DisplayName("Record 673: Fax is 650-340-6966")
	void FaxOfRecord673() {
		assertEquals("650-340-6966", customers.get(672).getFax());
	}

	@Test
	@DisplayName("Record 673: Email is scottie@mellado.com")
	void EmailOfRecord673() {
		assertEquals("scottie@mellado.com", customers.get(672).getEmail());
	}

	@Test
	@DisplayName("Record 673: Web is http://www.scottiemellado.com")
	void WebOfRecord673() {
		assertEquals("http://www.scottiemellado.com", customers.get(672).getWeb());
	}
}
