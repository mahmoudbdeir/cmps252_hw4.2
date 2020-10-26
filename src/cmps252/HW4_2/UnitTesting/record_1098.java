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

@Tag("28")
class Record_1098 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1098: FirstName is Archie")
	void FirstNameOfRecord1098() {
		assertEquals("Archie", customers.get(1097).getFirstName());
	}

	@Test
	@DisplayName("Record 1098: LastName is Naff")
	void LastNameOfRecord1098() {
		assertEquals("Naff", customers.get(1097).getLastName());
	}

	@Test
	@DisplayName("Record 1098: Company is American Paper Towel Co")
	void CompanyOfRecord1098() {
		assertEquals("American Paper Towel Co", customers.get(1097).getCompany());
	}

	@Test
	@DisplayName("Record 1098: Address is 24 W Sheffield Ave")
	void AddressOfRecord1098() {
		assertEquals("24 W Sheffield Ave", customers.get(1097).getAddress());
	}

	@Test
	@DisplayName("Record 1098: City is Englewood")
	void CityOfRecord1098() {
		assertEquals("Englewood", customers.get(1097).getCity());
	}

	@Test
	@DisplayName("Record 1098: County is Bergen")
	void CountyOfRecord1098() {
		assertEquals("Bergen", customers.get(1097).getCounty());
	}

	@Test
	@DisplayName("Record 1098: State is NJ")
	void StateOfRecord1098() {
		assertEquals("NJ", customers.get(1097).getState());
	}

	@Test
	@DisplayName("Record 1098: ZIP is 7631")
	void ZIPOfRecord1098() {
		assertEquals("7631", customers.get(1097).getZIP());
	}

	@Test
	@DisplayName("Record 1098: Phone is 201-871-8849")
	void PhoneOfRecord1098() {
		assertEquals("201-871-8849", customers.get(1097).getPhone());
	}

	@Test
	@DisplayName("Record 1098: Fax is 201-871-8752")
	void FaxOfRecord1098() {
		assertEquals("201-871-8752", customers.get(1097).getFax());
	}

	@Test
	@DisplayName("Record 1098: Email is archie@naff.com")
	void EmailOfRecord1098() {
		assertEquals("archie@naff.com", customers.get(1097).getEmail());
	}

	@Test
	@DisplayName("Record 1098: Web is http://www.archienaff.com")
	void WebOfRecord1098() {
		assertEquals("http://www.archienaff.com", customers.get(1097).getWeb());
	}
}
