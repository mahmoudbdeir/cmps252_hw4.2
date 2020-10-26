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
class Record_4945 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4945: FirstName is Donovan")
	void FirstNameOfRecord4945() {
		assertEquals("Donovan", customers.get(4944).getFirstName());
	}

	@Test
	@DisplayName("Record 4945: LastName is Clovis")
	void LastNameOfRecord4945() {
		assertEquals("Clovis", customers.get(4944).getLastName());
	}

	@Test
	@DisplayName("Record 4945: Company is Roco Industries")
	void CompanyOfRecord4945() {
		assertEquals("Roco Industries", customers.get(4944).getCompany());
	}

	@Test
	@DisplayName("Record 4945: Address is 880 Corporate Dr")
	void AddressOfRecord4945() {
		assertEquals("880 Corporate Dr", customers.get(4944).getAddress());
	}

	@Test
	@DisplayName("Record 4945: City is Lexington")
	void CityOfRecord4945() {
		assertEquals("Lexington", customers.get(4944).getCity());
	}

	@Test
	@DisplayName("Record 4945: County is Fayette")
	void CountyOfRecord4945() {
		assertEquals("Fayette", customers.get(4944).getCounty());
	}

	@Test
	@DisplayName("Record 4945: State is KY")
	void StateOfRecord4945() {
		assertEquals("KY", customers.get(4944).getState());
	}

	@Test
	@DisplayName("Record 4945: ZIP is 40503")
	void ZIPOfRecord4945() {
		assertEquals("40503", customers.get(4944).getZIP());
	}

	@Test
	@DisplayName("Record 4945: Phone is 859-223-1182")
	void PhoneOfRecord4945() {
		assertEquals("859-223-1182", customers.get(4944).getPhone());
	}

	@Test
	@DisplayName("Record 4945: Fax is 859-223-4822")
	void FaxOfRecord4945() {
		assertEquals("859-223-4822", customers.get(4944).getFax());
	}

	@Test
	@DisplayName("Record 4945: Email is donovan@clovis.com")
	void EmailOfRecord4945() {
		assertEquals("donovan@clovis.com", customers.get(4944).getEmail());
	}

	@Test
	@DisplayName("Record 4945: Web is http://www.donovanclovis.com")
	void WebOfRecord4945() {
		assertEquals("http://www.donovanclovis.com", customers.get(4944).getWeb());
	}
}
