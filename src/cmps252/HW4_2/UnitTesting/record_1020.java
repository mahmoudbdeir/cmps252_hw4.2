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

@Tag("13")
class Record_1020 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1020: FirstName is Martha")
	void FirstNameOfRecord1020() {
		assertEquals("Martha", customers.get(1019).getFirstName());
	}

	@Test
	@DisplayName("Record 1020: LastName is Wakeford")
	void LastNameOfRecord1020() {
		assertEquals("Wakeford", customers.get(1019).getLastName());
	}

	@Test
	@DisplayName("Record 1020: Company is Graft, Robert R Iii")
	void CompanyOfRecord1020() {
		assertEquals("Graft, Robert R Iii", customers.get(1019).getCompany());
	}

	@Test
	@DisplayName("Record 1020: Address is 6701 Haverford Ave")
	void AddressOfRecord1020() {
		assertEquals("6701 Haverford Ave", customers.get(1019).getAddress());
	}

	@Test
	@DisplayName("Record 1020: City is Philadelphia")
	void CityOfRecord1020() {
		assertEquals("Philadelphia", customers.get(1019).getCity());
	}

	@Test
	@DisplayName("Record 1020: County is Philadelphia")
	void CountyOfRecord1020() {
		assertEquals("Philadelphia", customers.get(1019).getCounty());
	}

	@Test
	@DisplayName("Record 1020: State is PA")
	void StateOfRecord1020() {
		assertEquals("PA", customers.get(1019).getState());
	}

	@Test
	@DisplayName("Record 1020: ZIP is 19151")
	void ZIPOfRecord1020() {
		assertEquals("19151", customers.get(1019).getZIP());
	}

	@Test
	@DisplayName("Record 1020: Phone is 215-473-9222")
	void PhoneOfRecord1020() {
		assertEquals("215-473-9222", customers.get(1019).getPhone());
	}

	@Test
	@DisplayName("Record 1020: Fax is 215-473-1554")
	void FaxOfRecord1020() {
		assertEquals("215-473-1554", customers.get(1019).getFax());
	}

	@Test
	@DisplayName("Record 1020: Email is martha@wakeford.com")
	void EmailOfRecord1020() {
		assertEquals("martha@wakeford.com", customers.get(1019).getEmail());
	}

	@Test
	@DisplayName("Record 1020: Web is http://www.marthawakeford.com")
	void WebOfRecord1020() {
		assertEquals("http://www.marthawakeford.com", customers.get(1019).getWeb());
	}
}
