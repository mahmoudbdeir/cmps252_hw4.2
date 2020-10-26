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
class Record_3774 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3774: FirstName is Walton")
	void FirstNameOfRecord3774() {
		assertEquals("Walton", customers.get(3773).getFirstName());
	}

	@Test
	@DisplayName("Record 3774: LastName is Slown")
	void LastNameOfRecord3774() {
		assertEquals("Slown", customers.get(3773).getLastName());
	}

	@Test
	@DisplayName("Record 3774: Company is Evening Star Bookkeeping Svc")
	void CompanyOfRecord3774() {
		assertEquals("Evening Star Bookkeeping Svc", customers.get(3773).getCompany());
	}

	@Test
	@DisplayName("Record 3774: Address is 78 Rice St")
	void AddressOfRecord3774() {
		assertEquals("78 Rice St", customers.get(3773).getAddress());
	}

	@Test
	@DisplayName("Record 3774: City is Bangor")
	void CityOfRecord3774() {
		assertEquals("Bangor", customers.get(3773).getCity());
	}

	@Test
	@DisplayName("Record 3774: County is Penobscot")
	void CountyOfRecord3774() {
		assertEquals("Penobscot", customers.get(3773).getCounty());
	}

	@Test
	@DisplayName("Record 3774: State is ME")
	void StateOfRecord3774() {
		assertEquals("ME", customers.get(3773).getState());
	}

	@Test
	@DisplayName("Record 3774: ZIP is 4401")
	void ZIPOfRecord3774() {
		assertEquals("4401", customers.get(3773).getZIP());
	}

	@Test
	@DisplayName("Record 3774: Phone is 207-947-6330")
	void PhoneOfRecord3774() {
		assertEquals("207-947-6330", customers.get(3773).getPhone());
	}

	@Test
	@DisplayName("Record 3774: Fax is 207-947-1458")
	void FaxOfRecord3774() {
		assertEquals("207-947-1458", customers.get(3773).getFax());
	}

	@Test
	@DisplayName("Record 3774: Email is walton@slown.com")
	void EmailOfRecord3774() {
		assertEquals("walton@slown.com", customers.get(3773).getEmail());
	}

	@Test
	@DisplayName("Record 3774: Web is http://www.waltonslown.com")
	void WebOfRecord3774() {
		assertEquals("http://www.waltonslown.com", customers.get(3773).getWeb());
	}
}
