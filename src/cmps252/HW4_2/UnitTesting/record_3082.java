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

@Tag("46")
class Record_3082 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3082: FirstName is Opal")
	void FirstNameOfRecord3082() {
		assertEquals("Opal", customers.get(3081).getFirstName());
	}

	@Test
	@DisplayName("Record 3082: LastName is Goedken")
	void LastNameOfRecord3082() {
		assertEquals("Goedken", customers.get(3081).getLastName());
	}

	@Test
	@DisplayName("Record 3082: Company is Freer & Mcgarry")
	void CompanyOfRecord3082() {
		assertEquals("Freer & Mcgarry", customers.get(3081).getCompany());
	}

	@Test
	@DisplayName("Record 3082: Address is 1811 S Lake Pl")
	void AddressOfRecord3082() {
		assertEquals("1811 S Lake Pl", customers.get(3081).getAddress());
	}

	@Test
	@DisplayName("Record 3082: City is Ontario")
	void CityOfRecord3082() {
		assertEquals("Ontario", customers.get(3081).getCity());
	}

	@Test
	@DisplayName("Record 3082: County is San Bernardino")
	void CountyOfRecord3082() {
		assertEquals("San Bernardino", customers.get(3081).getCounty());
	}

	@Test
	@DisplayName("Record 3082: State is CA")
	void StateOfRecord3082() {
		assertEquals("CA", customers.get(3081).getState());
	}

	@Test
	@DisplayName("Record 3082: ZIP is 91761")
	void ZIPOfRecord3082() {
		assertEquals("91761", customers.get(3081).getZIP());
	}

	@Test
	@DisplayName("Record 3082: Phone is 909-947-3606")
	void PhoneOfRecord3082() {
		assertEquals("909-947-3606", customers.get(3081).getPhone());
	}

	@Test
	@DisplayName("Record 3082: Fax is 909-947-9555")
	void FaxOfRecord3082() {
		assertEquals("909-947-9555", customers.get(3081).getFax());
	}

	@Test
	@DisplayName("Record 3082: Email is opal@goedken.com")
	void EmailOfRecord3082() {
		assertEquals("opal@goedken.com", customers.get(3081).getEmail());
	}

	@Test
	@DisplayName("Record 3082: Web is http://www.opalgoedken.com")
	void WebOfRecord3082() {
		assertEquals("http://www.opalgoedken.com", customers.get(3081).getWeb());
	}
}
