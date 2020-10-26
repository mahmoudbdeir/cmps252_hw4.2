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
class Record_4609 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4609: FirstName is Doreen")
	void FirstNameOfRecord4609() {
		assertEquals("Doreen", customers.get(4608).getFirstName());
	}

	@Test
	@DisplayName("Record 4609: LastName is Stallsworth")
	void LastNameOfRecord4609() {
		assertEquals("Stallsworth", customers.get(4608).getLastName());
	}

	@Test
	@DisplayName("Record 4609: Company is Mcewen, Earle L")
	void CompanyOfRecord4609() {
		assertEquals("Mcewen, Earle L", customers.get(4608).getCompany());
	}

	@Test
	@DisplayName("Record 4609: Address is 3333 Midway Dr  #-100")
	void AddressOfRecord4609() {
		assertEquals("3333 Midway Dr  #-100", customers.get(4608).getAddress());
	}

	@Test
	@DisplayName("Record 4609: City is San Diego")
	void CityOfRecord4609() {
		assertEquals("San Diego", customers.get(4608).getCity());
	}

	@Test
	@DisplayName("Record 4609: County is San Diego")
	void CountyOfRecord4609() {
		assertEquals("San Diego", customers.get(4608).getCounty());
	}

	@Test
	@DisplayName("Record 4609: State is CA")
	void StateOfRecord4609() {
		assertEquals("CA", customers.get(4608).getState());
	}

	@Test
	@DisplayName("Record 4609: ZIP is 92110")
	void ZIPOfRecord4609() {
		assertEquals("92110", customers.get(4608).getZIP());
	}

	@Test
	@DisplayName("Record 4609: Phone is 858-621-0631")
	void PhoneOfRecord4609() {
		assertEquals("858-621-0631", customers.get(4608).getPhone());
	}

	@Test
	@DisplayName("Record 4609: Fax is 858-621-9211")
	void FaxOfRecord4609() {
		assertEquals("858-621-9211", customers.get(4608).getFax());
	}

	@Test
	@DisplayName("Record 4609: Email is doreen@stallsworth.com")
	void EmailOfRecord4609() {
		assertEquals("doreen@stallsworth.com", customers.get(4608).getEmail());
	}

	@Test
	@DisplayName("Record 4609: Web is http://www.doreenstallsworth.com")
	void WebOfRecord4609() {
		assertEquals("http://www.doreenstallsworth.com", customers.get(4608).getWeb());
	}
}
