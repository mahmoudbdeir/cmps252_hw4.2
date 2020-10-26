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

@Tag("15")
class Record_4628 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4628: FirstName is Tina")
	void FirstNameOfRecord4628() {
		assertEquals("Tina", customers.get(4627).getFirstName());
	}

	@Test
	@DisplayName("Record 4628: LastName is Racedo")
	void LastNameOfRecord4628() {
		assertEquals("Racedo", customers.get(4627).getLastName());
	}

	@Test
	@DisplayName("Record 4628: Company is Electroven Mfg Corp")
	void CompanyOfRecord4628() {
		assertEquals("Electroven Mfg Corp", customers.get(4627).getCompany());
	}

	@Test
	@DisplayName("Record 4628: Address is 68 S Main St")
	void AddressOfRecord4628() {
		assertEquals("68 S Main St", customers.get(4627).getAddress());
	}

	@Test
	@DisplayName("Record 4628: City is Providence")
	void CityOfRecord4628() {
		assertEquals("Providence", customers.get(4627).getCity());
	}

	@Test
	@DisplayName("Record 4628: County is Providence")
	void CountyOfRecord4628() {
		assertEquals("Providence", customers.get(4627).getCounty());
	}

	@Test
	@DisplayName("Record 4628: State is RI")
	void StateOfRecord4628() {
		assertEquals("RI", customers.get(4627).getState());
	}

	@Test
	@DisplayName("Record 4628: ZIP is 2903")
	void ZIPOfRecord4628() {
		assertEquals("2903", customers.get(4627).getZIP());
	}

	@Test
	@DisplayName("Record 4628: Phone is 401-521-7575")
	void PhoneOfRecord4628() {
		assertEquals("401-521-7575", customers.get(4627).getPhone());
	}

	@Test
	@DisplayName("Record 4628: Fax is 401-521-8781")
	void FaxOfRecord4628() {
		assertEquals("401-521-8781", customers.get(4627).getFax());
	}

	@Test
	@DisplayName("Record 4628: Email is tina@racedo.com")
	void EmailOfRecord4628() {
		assertEquals("tina@racedo.com", customers.get(4627).getEmail());
	}

	@Test
	@DisplayName("Record 4628: Web is http://www.tinaracedo.com")
	void WebOfRecord4628() {
		assertEquals("http://www.tinaracedo.com", customers.get(4627).getWeb());
	}
}
