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

@Tag("18")
class Record_1945 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1945: FirstName is Rodger")
	void FirstNameOfRecord1945() {
		assertEquals("Rodger", customers.get(1944).getFirstName());
	}

	@Test
	@DisplayName("Record 1945: LastName is Grobes")
	void LastNameOfRecord1945() {
		assertEquals("Grobes", customers.get(1944).getLastName());
	}

	@Test
	@DisplayName("Record 1945: Company is Henshaws Electronic Supply")
	void CompanyOfRecord1945() {
		assertEquals("Henshaws Electronic Supply", customers.get(1944).getCompany());
	}

	@Test
	@DisplayName("Record 1945: Address is 120 Marine St")
	void AddressOfRecord1945() {
		assertEquals("120 Marine St", customers.get(1944).getAddress());
	}

	@Test
	@DisplayName("Record 1945: City is Farmingdale")
	void CityOfRecord1945() {
		assertEquals("Farmingdale", customers.get(1944).getCity());
	}

	@Test
	@DisplayName("Record 1945: County is Nassau")
	void CountyOfRecord1945() {
		assertEquals("Nassau", customers.get(1944).getCounty());
	}

	@Test
	@DisplayName("Record 1945: State is NY")
	void StateOfRecord1945() {
		assertEquals("NY", customers.get(1944).getState());
	}

	@Test
	@DisplayName("Record 1945: ZIP is 11735")
	void ZIPOfRecord1945() {
		assertEquals("11735", customers.get(1944).getZIP());
	}

	@Test
	@DisplayName("Record 1945: Phone is 516-249-9958")
	void PhoneOfRecord1945() {
		assertEquals("516-249-9958", customers.get(1944).getPhone());
	}

	@Test
	@DisplayName("Record 1945: Fax is 516-249-7241")
	void FaxOfRecord1945() {
		assertEquals("516-249-7241", customers.get(1944).getFax());
	}

	@Test
	@DisplayName("Record 1945: Email is rodger@grobes.com")
	void EmailOfRecord1945() {
		assertEquals("rodger@grobes.com", customers.get(1944).getEmail());
	}

	@Test
	@DisplayName("Record 1945: Web is http://www.rodgergrobes.com")
	void WebOfRecord1945() {
		assertEquals("http://www.rodgergrobes.com", customers.get(1944).getWeb());
	}
}
