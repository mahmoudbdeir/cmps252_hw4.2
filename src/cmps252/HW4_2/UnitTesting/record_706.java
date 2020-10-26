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

@Tag("10")
class Record_706 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 706: FirstName is Loretta")
	void FirstNameOfRecord706() {
		assertEquals("Loretta", customers.get(705).getFirstName());
	}

	@Test
	@DisplayName("Record 706: LastName is Sibbett")
	void LastNameOfRecord706() {
		assertEquals("Sibbett", customers.get(705).getLastName());
	}

	@Test
	@DisplayName("Record 706: Company is Yarmouth Chamber Of Commerce")
	void CompanyOfRecord706() {
		assertEquals("Yarmouth Chamber Of Commerce", customers.get(705).getCompany());
	}

	@Test
	@DisplayName("Record 706: Address is 635 S Date Ave")
	void AddressOfRecord706() {
		assertEquals("635 S Date Ave", customers.get(705).getAddress());
	}

	@Test
	@DisplayName("Record 706: City is Alhambra")
	void CityOfRecord706() {
		assertEquals("Alhambra", customers.get(705).getCity());
	}

	@Test
	@DisplayName("Record 706: County is Los Angeles")
	void CountyOfRecord706() {
		assertEquals("Los Angeles", customers.get(705).getCounty());
	}

	@Test
	@DisplayName("Record 706: State is CA")
	void StateOfRecord706() {
		assertEquals("CA", customers.get(705).getState());
	}

	@Test
	@DisplayName("Record 706: ZIP is 91803")
	void ZIPOfRecord706() {
		assertEquals("91803", customers.get(705).getZIP());
	}

	@Test
	@DisplayName("Record 706: Phone is 626-570-2547")
	void PhoneOfRecord706() {
		assertEquals("626-570-2547", customers.get(705).getPhone());
	}

	@Test
	@DisplayName("Record 706: Fax is 626-570-7513")
	void FaxOfRecord706() {
		assertEquals("626-570-7513", customers.get(705).getFax());
	}

	@Test
	@DisplayName("Record 706: Email is loretta@sibbett.com")
	void EmailOfRecord706() {
		assertEquals("loretta@sibbett.com", customers.get(705).getEmail());
	}

	@Test
	@DisplayName("Record 706: Web is http://www.lorettasibbett.com")
	void WebOfRecord706() {
		assertEquals("http://www.lorettasibbett.com", customers.get(705).getWeb());
	}
}
