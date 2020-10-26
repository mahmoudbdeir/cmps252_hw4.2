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

@Tag("39")
class Record_4516 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4516: FirstName is Nelda")
	void FirstNameOfRecord4516() {
		assertEquals("Nelda", customers.get(4515).getFirstName());
	}

	@Test
	@DisplayName("Record 4516: LastName is Mulhern")
	void LastNameOfRecord4516() {
		assertEquals("Mulhern", customers.get(4515).getLastName());
	}

	@Test
	@DisplayName("Record 4516: Company is Americanna Inn Cnfrnc Ctr")
	void CompanyOfRecord4516() {
		assertEquals("Americanna Inn Cnfrnc Ctr", customers.get(4515).getCompany());
	}

	@Test
	@DisplayName("Record 4516: Address is 208 3rd Ave")
	void AddressOfRecord4516() {
		assertEquals("208 3rd Ave", customers.get(4515).getAddress());
	}

	@Test
	@DisplayName("Record 4516: City is Asbury Park")
	void CityOfRecord4516() {
		assertEquals("Asbury Park", customers.get(4515).getCity());
	}

	@Test
	@DisplayName("Record 4516: County is Monmouth")
	void CountyOfRecord4516() {
		assertEquals("Monmouth", customers.get(4515).getCounty());
	}

	@Test
	@DisplayName("Record 4516: State is NJ")
	void StateOfRecord4516() {
		assertEquals("NJ", customers.get(4515).getState());
	}

	@Test
	@DisplayName("Record 4516: ZIP is 7712")
	void ZIPOfRecord4516() {
		assertEquals("7712", customers.get(4515).getZIP());
	}

	@Test
	@DisplayName("Record 4516: Phone is 732-502-8288")
	void PhoneOfRecord4516() {
		assertEquals("732-502-8288", customers.get(4515).getPhone());
	}

	@Test
	@DisplayName("Record 4516: Fax is 732-502-1879")
	void FaxOfRecord4516() {
		assertEquals("732-502-1879", customers.get(4515).getFax());
	}

	@Test
	@DisplayName("Record 4516: Email is nelda@mulhern.com")
	void EmailOfRecord4516() {
		assertEquals("nelda@mulhern.com", customers.get(4515).getEmail());
	}

	@Test
	@DisplayName("Record 4516: Web is http://www.neldamulhern.com")
	void WebOfRecord4516() {
		assertEquals("http://www.neldamulhern.com", customers.get(4515).getWeb());
	}
}
