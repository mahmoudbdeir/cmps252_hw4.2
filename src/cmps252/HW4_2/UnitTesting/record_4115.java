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

@Tag("43")
class Record_4115 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4115: FirstName is Ida")
	void FirstNameOfRecord4115() {
		assertEquals("Ida", customers.get(4114).getFirstName());
	}

	@Test
	@DisplayName("Record 4115: LastName is Boge")
	void LastNameOfRecord4115() {
		assertEquals("Boge", customers.get(4114).getLastName());
	}

	@Test
	@DisplayName("Record 4115: Company is Kellison & Cady")
	void CompanyOfRecord4115() {
		assertEquals("Kellison & Cady", customers.get(4114).getCompany());
	}

	@Test
	@DisplayName("Record 4115: Address is 89 Roosevelt Hwy")
	void AddressOfRecord4115() {
		assertEquals("89 Roosevelt Hwy", customers.get(4114).getAddress());
	}

	@Test
	@DisplayName("Record 4115: City is Colchester")
	void CityOfRecord4115() {
		assertEquals("Colchester", customers.get(4114).getCity());
	}

	@Test
	@DisplayName("Record 4115: County is Chittenden")
	void CountyOfRecord4115() {
		assertEquals("Chittenden", customers.get(4114).getCounty());
	}

	@Test
	@DisplayName("Record 4115: State is VT")
	void StateOfRecord4115() {
		assertEquals("VT", customers.get(4114).getState());
	}

	@Test
	@DisplayName("Record 4115: ZIP is 5446")
	void ZIPOfRecord4115() {
		assertEquals("5446", customers.get(4114).getZIP());
	}

	@Test
	@DisplayName("Record 4115: Phone is 802-655-8479")
	void PhoneOfRecord4115() {
		assertEquals("802-655-8479", customers.get(4114).getPhone());
	}

	@Test
	@DisplayName("Record 4115: Fax is 802-655-8735")
	void FaxOfRecord4115() {
		assertEquals("802-655-8735", customers.get(4114).getFax());
	}

	@Test
	@DisplayName("Record 4115: Email is ida@boge.com")
	void EmailOfRecord4115() {
		assertEquals("ida@boge.com", customers.get(4114).getEmail());
	}

	@Test
	@DisplayName("Record 4115: Web is http://www.idaboge.com")
	void WebOfRecord4115() {
		assertEquals("http://www.idaboge.com", customers.get(4114).getWeb());
	}
}
