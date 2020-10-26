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

@Tag("16")
class Record_1705 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1705: FirstName is Augustus")
	void FirstNameOfRecord1705() {
		assertEquals("Augustus", customers.get(1704).getFirstName());
	}

	@Test
	@DisplayName("Record 1705: LastName is Lonn")
	void LastNameOfRecord1705() {
		assertEquals("Lonn", customers.get(1704).getLastName());
	}

	@Test
	@DisplayName("Record 1705: Company is Lamb, Lewis E Iii")
	void CompanyOfRecord1705() {
		assertEquals("Lamb, Lewis E Iii", customers.get(1704).getCompany());
	}

	@Test
	@DisplayName("Record 1705: Address is 611 County Line Rd")
	void AddressOfRecord1705() {
		assertEquals("611 County Line Rd", customers.get(1704).getAddress());
	}

	@Test
	@DisplayName("Record 1705: City is Huntingdon Valley")
	void CityOfRecord1705() {
		assertEquals("Huntingdon Valley", customers.get(1704).getCity());
	}

	@Test
	@DisplayName("Record 1705: County is Montgomery")
	void CountyOfRecord1705() {
		assertEquals("Montgomery", customers.get(1704).getCounty());
	}

	@Test
	@DisplayName("Record 1705: State is PA")
	void StateOfRecord1705() {
		assertEquals("PA", customers.get(1704).getState());
	}

	@Test
	@DisplayName("Record 1705: ZIP is 19006")
	void ZIPOfRecord1705() {
		assertEquals("19006", customers.get(1704).getZIP());
	}

	@Test
	@DisplayName("Record 1705: Phone is 215-364-9651")
	void PhoneOfRecord1705() {
		assertEquals("215-364-9651", customers.get(1704).getPhone());
	}

	@Test
	@DisplayName("Record 1705: Fax is 215-364-7277")
	void FaxOfRecord1705() {
		assertEquals("215-364-7277", customers.get(1704).getFax());
	}

	@Test
	@DisplayName("Record 1705: Email is augustus@lonn.com")
	void EmailOfRecord1705() {
		assertEquals("augustus@lonn.com", customers.get(1704).getEmail());
	}

	@Test
	@DisplayName("Record 1705: Web is http://www.augustuslonn.com")
	void WebOfRecord1705() {
		assertEquals("http://www.augustuslonn.com", customers.get(1704).getWeb());
	}
}
