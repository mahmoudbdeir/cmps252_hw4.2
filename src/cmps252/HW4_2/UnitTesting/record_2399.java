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

@Tag("29")
class Record_2399 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2399: FirstName is Noemi")
	void FirstNameOfRecord2399() {
		assertEquals("Noemi", customers.get(2398).getFirstName());
	}

	@Test
	@DisplayName("Record 2399: LastName is Dehan")
	void LastNameOfRecord2399() {
		assertEquals("Dehan", customers.get(2398).getLastName());
	}

	@Test
	@DisplayName("Record 2399: Company is Sabel, Allen N")
	void CompanyOfRecord2399() {
		assertEquals("Sabel, Allen N", customers.get(2398).getCompany());
	}

	@Test
	@DisplayName("Record 2399: Address is 33 Lafayette Ave")
	void AddressOfRecord2399() {
		assertEquals("33 Lafayette Ave", customers.get(2398).getAddress());
	}

	@Test
	@DisplayName("Record 2399: City is Brooklyn")
	void CityOfRecord2399() {
		assertEquals("Brooklyn", customers.get(2398).getCity());
	}

	@Test
	@DisplayName("Record 2399: County is Kings")
	void CountyOfRecord2399() {
		assertEquals("Kings", customers.get(2398).getCounty());
	}

	@Test
	@DisplayName("Record 2399: State is NY")
	void StateOfRecord2399() {
		assertEquals("NY", customers.get(2398).getState());
	}

	@Test
	@DisplayName("Record 2399: ZIP is 11217")
	void ZIPOfRecord2399() {
		assertEquals("11217", customers.get(2398).getZIP());
	}

	@Test
	@DisplayName("Record 2399: Phone is 718-625-6781")
	void PhoneOfRecord2399() {
		assertEquals("718-625-6781", customers.get(2398).getPhone());
	}

	@Test
	@DisplayName("Record 2399: Fax is 718-625-5234")
	void FaxOfRecord2399() {
		assertEquals("718-625-5234", customers.get(2398).getFax());
	}

	@Test
	@DisplayName("Record 2399: Email is noemi@dehan.com")
	void EmailOfRecord2399() {
		assertEquals("noemi@dehan.com", customers.get(2398).getEmail());
	}

	@Test
	@DisplayName("Record 2399: Web is http://www.noemidehan.com")
	void WebOfRecord2399() {
		assertEquals("http://www.noemidehan.com", customers.get(2398).getWeb());
	}
}
