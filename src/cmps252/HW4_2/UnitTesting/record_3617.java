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

@Tag("15")
class Record_3617 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3617: FirstName is Irma")
	void FirstNameOfRecord3617() {
		assertEquals("Irma", customers.get(3616).getFirstName());
	}

	@Test
	@DisplayName("Record 3617: LastName is Bayon")
	void LastNameOfRecord3617() {
		assertEquals("Bayon", customers.get(3616).getLastName());
	}

	@Test
	@DisplayName("Record 3617: Company is Hartwell International Inc")
	void CompanyOfRecord3617() {
		assertEquals("Hartwell International Inc", customers.get(3616).getCompany());
	}

	@Test
	@DisplayName("Record 3617: Address is 601 S Figueroa St")
	void AddressOfRecord3617() {
		assertEquals("601 S Figueroa St", customers.get(3616).getAddress());
	}

	@Test
	@DisplayName("Record 3617: City is Los Angeles")
	void CityOfRecord3617() {
		assertEquals("Los Angeles", customers.get(3616).getCity());
	}

	@Test
	@DisplayName("Record 3617: County is Los Angeles")
	void CountyOfRecord3617() {
		assertEquals("Los Angeles", customers.get(3616).getCounty());
	}

	@Test
	@DisplayName("Record 3617: State is CA")
	void StateOfRecord3617() {
		assertEquals("CA", customers.get(3616).getState());
	}

	@Test
	@DisplayName("Record 3617: ZIP is 90017")
	void ZIPOfRecord3617() {
		assertEquals("90017", customers.get(3616).getZIP());
	}

	@Test
	@DisplayName("Record 3617: Phone is 213-896-2338")
	void PhoneOfRecord3617() {
		assertEquals("213-896-2338", customers.get(3616).getPhone());
	}

	@Test
	@DisplayName("Record 3617: Fax is 213-896-5673")
	void FaxOfRecord3617() {
		assertEquals("213-896-5673", customers.get(3616).getFax());
	}

	@Test
	@DisplayName("Record 3617: Email is irma@bayon.com")
	void EmailOfRecord3617() {
		assertEquals("irma@bayon.com", customers.get(3616).getEmail());
	}

	@Test
	@DisplayName("Record 3617: Web is http://www.irmabayon.com")
	void WebOfRecord3617() {
		assertEquals("http://www.irmabayon.com", customers.get(3616).getWeb());
	}
}
