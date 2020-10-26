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

@Tag("21")
class Record_3366 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3366: FirstName is Morgan")
	void FirstNameOfRecord3366() {
		assertEquals("Morgan", customers.get(3365).getFirstName());
	}

	@Test
	@DisplayName("Record 3366: LastName is Fatora")
	void LastNameOfRecord3366() {
		assertEquals("Fatora", customers.get(3365).getLastName());
	}

	@Test
	@DisplayName("Record 3366: Company is Lewis Fort Cmnty Fed Crdt Un")
	void CompanyOfRecord3366() {
		assertEquals("Lewis Fort Cmnty Fed Crdt Un", customers.get(3365).getCompany());
	}

	@Test
	@DisplayName("Record 3366: Address is 336 N Central Ave")
	void AddressOfRecord3366() {
		assertEquals("336 N Central Ave", customers.get(3365).getAddress());
	}

	@Test
	@DisplayName("Record 3366: City is Glendale")
	void CityOfRecord3366() {
		assertEquals("Glendale", customers.get(3365).getCity());
	}

	@Test
	@DisplayName("Record 3366: County is Los Angeles")
	void CountyOfRecord3366() {
		assertEquals("Los Angeles", customers.get(3365).getCounty());
	}

	@Test
	@DisplayName("Record 3366: State is CA")
	void StateOfRecord3366() {
		assertEquals("CA", customers.get(3365).getState());
	}

	@Test
	@DisplayName("Record 3366: ZIP is 91203")
	void ZIPOfRecord3366() {
		assertEquals("91203", customers.get(3365).getZIP());
	}

	@Test
	@DisplayName("Record 3366: Phone is 818-242-7331")
	void PhoneOfRecord3366() {
		assertEquals("818-242-7331", customers.get(3365).getPhone());
	}

	@Test
	@DisplayName("Record 3366: Fax is 818-242-9269")
	void FaxOfRecord3366() {
		assertEquals("818-242-9269", customers.get(3365).getFax());
	}

	@Test
	@DisplayName("Record 3366: Email is morgan@fatora.com")
	void EmailOfRecord3366() {
		assertEquals("morgan@fatora.com", customers.get(3365).getEmail());
	}

	@Test
	@DisplayName("Record 3366: Web is http://www.morganfatora.com")
	void WebOfRecord3366() {
		assertEquals("http://www.morganfatora.com", customers.get(3365).getWeb());
	}
}
