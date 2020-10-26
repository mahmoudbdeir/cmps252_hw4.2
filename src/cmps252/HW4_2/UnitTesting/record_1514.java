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

@Tag("32")
class Record_1514 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1514: FirstName is Sally")
	void FirstNameOfRecord1514() {
		assertEquals("Sally", customers.get(1513).getFirstName());
	}

	@Test
	@DisplayName("Record 1514: LastName is Six")
	void LastNameOfRecord1514() {
		assertEquals("Six", customers.get(1513).getLastName());
	}

	@Test
	@DisplayName("Record 1514: Company is Parkway Fabricators")
	void CompanyOfRecord1514() {
		assertEquals("Parkway Fabricators", customers.get(1513).getCompany());
	}

	@Test
	@DisplayName("Record 1514: Address is 5260 Nw Beaver Dr")
	void AddressOfRecord1514() {
		assertEquals("5260 Nw Beaver Dr", customers.get(1513).getAddress());
	}

	@Test
	@DisplayName("Record 1514: City is Johnston")
	void CityOfRecord1514() {
		assertEquals("Johnston", customers.get(1513).getCity());
	}

	@Test
	@DisplayName("Record 1514: County is Polk")
	void CountyOfRecord1514() {
		assertEquals("Polk", customers.get(1513).getCounty());
	}

	@Test
	@DisplayName("Record 1514: State is IA")
	void StateOfRecord1514() {
		assertEquals("IA", customers.get(1513).getState());
	}

	@Test
	@DisplayName("Record 1514: ZIP is 50131")
	void ZIPOfRecord1514() {
		assertEquals("50131", customers.get(1513).getZIP());
	}

	@Test
	@DisplayName("Record 1514: Phone is 515-276-8596")
	void PhoneOfRecord1514() {
		assertEquals("515-276-8596", customers.get(1513).getPhone());
	}

	@Test
	@DisplayName("Record 1514: Fax is 515-276-2761")
	void FaxOfRecord1514() {
		assertEquals("515-276-2761", customers.get(1513).getFax());
	}

	@Test
	@DisplayName("Record 1514: Email is sally@six.com")
	void EmailOfRecord1514() {
		assertEquals("sally@six.com", customers.get(1513).getEmail());
	}

	@Test
	@DisplayName("Record 1514: Web is http://www.sallysix.com")
	void WebOfRecord1514() {
		assertEquals("http://www.sallysix.com", customers.get(1513).getWeb());
	}
}
