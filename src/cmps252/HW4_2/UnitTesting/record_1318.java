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
class Record_1318 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1318: FirstName is Dion")
	void FirstNameOfRecord1318() {
		assertEquals("Dion", customers.get(1317).getFirstName());
	}

	@Test
	@DisplayName("Record 1318: LastName is Alevedo")
	void LastNameOfRecord1318() {
		assertEquals("Alevedo", customers.get(1317).getLastName());
	}

	@Test
	@DisplayName("Record 1318: Company is Crows New & Used Auto Parts")
	void CompanyOfRecord1318() {
		assertEquals("Crows New & Used Auto Parts", customers.get(1317).getCompany());
	}

	@Test
	@DisplayName("Record 1318: Address is 367 Ghent Rd")
	void AddressOfRecord1318() {
		assertEquals("367 Ghent Rd", customers.get(1317).getAddress());
	}

	@Test
	@DisplayName("Record 1318: City is Akron")
	void CityOfRecord1318() {
		assertEquals("Akron", customers.get(1317).getCity());
	}

	@Test
	@DisplayName("Record 1318: County is Summit")
	void CountyOfRecord1318() {
		assertEquals("Summit", customers.get(1317).getCounty());
	}

	@Test
	@DisplayName("Record 1318: State is OH")
	void StateOfRecord1318() {
		assertEquals("OH", customers.get(1317).getState());
	}

	@Test
	@DisplayName("Record 1318: ZIP is 44333")
	void ZIPOfRecord1318() {
		assertEquals("44333", customers.get(1317).getZIP());
	}

	@Test
	@DisplayName("Record 1318: Phone is 330-666-1105")
	void PhoneOfRecord1318() {
		assertEquals("330-666-1105", customers.get(1317).getPhone());
	}

	@Test
	@DisplayName("Record 1318: Fax is 330-666-3637")
	void FaxOfRecord1318() {
		assertEquals("330-666-3637", customers.get(1317).getFax());
	}

	@Test
	@DisplayName("Record 1318: Email is dion@alevedo.com")
	void EmailOfRecord1318() {
		assertEquals("dion@alevedo.com", customers.get(1317).getEmail());
	}

	@Test
	@DisplayName("Record 1318: Web is http://www.dionalevedo.com")
	void WebOfRecord1318() {
		assertEquals("http://www.dionalevedo.com", customers.get(1317).getWeb());
	}
}
