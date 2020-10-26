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

@Tag("34")
class Record_82 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 82: FirstName is Gary")
	void FirstNameOfRecord82() {
		assertEquals("Gary", customers.get(81).getFirstName());
	}

	@Test
	@DisplayName("Record 82: LastName is Luoto")
	void LastNameOfRecord82() {
		assertEquals("Luoto", customers.get(81).getLastName());
	}

	@Test
	@DisplayName("Record 82: Company is Bodine Electric Motors")
	void CompanyOfRecord82() {
		assertEquals("Bodine Electric Motors", customers.get(81).getCompany());
	}

	@Test
	@DisplayName("Record 82: Address is 201 Roscoe Rd")
	void AddressOfRecord82() {
		assertEquals("201 Roscoe Rd", customers.get(81).getAddress());
	}

	@Test
	@DisplayName("Record 82: City is Modesto")
	void CityOfRecord82() {
		assertEquals("Modesto", customers.get(81).getCity());
	}

	@Test
	@DisplayName("Record 82: County is Stanislaus")
	void CountyOfRecord82() {
		assertEquals("Stanislaus", customers.get(81).getCounty());
	}

	@Test
	@DisplayName("Record 82: State is CA")
	void StateOfRecord82() {
		assertEquals("CA", customers.get(81).getState());
	}

	@Test
	@DisplayName("Record 82: ZIP is 95357")
	void ZIPOfRecord82() {
		assertEquals("95357", customers.get(81).getZIP());
	}

	@Test
	@DisplayName("Record 82: Phone is 209-524-7233")
	void PhoneOfRecord82() {
		assertEquals("209-524-7233", customers.get(81).getPhone());
	}

	@Test
	@DisplayName("Record 82: Fax is 209-524-5626")
	void FaxOfRecord82() {
		assertEquals("209-524-5626", customers.get(81).getFax());
	}

	@Test
	@DisplayName("Record 82: Email is gary@luoto.com")
	void EmailOfRecord82() {
		assertEquals("gary@luoto.com", customers.get(81).getEmail());
	}

	@Test
	@DisplayName("Record 82: Web is http://www.garyluoto.com")
	void WebOfRecord82() {
		assertEquals("http://www.garyluoto.com", customers.get(81).getWeb());
	}
}
