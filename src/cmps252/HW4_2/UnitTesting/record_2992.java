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

@Tag("4")
class Record_2992 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2992: FirstName is Mario")
	void FirstNameOfRecord2992() {
		assertEquals("Mario", customers.get(2991).getFirstName());
	}

	@Test
	@DisplayName("Record 2992: LastName is Callicutt")
	void LastNameOfRecord2992() {
		assertEquals("Callicutt", customers.get(2991).getLastName());
	}

	@Test
	@DisplayName("Record 2992: Company is Abel, Donald K Cpa")
	void CompanyOfRecord2992() {
		assertEquals("Abel, Donald K Cpa", customers.get(2991).getCompany());
	}

	@Test
	@DisplayName("Record 2992: Address is 31284 San Antonio St  #-6")
	void AddressOfRecord2992() {
		assertEquals("31284 San Antonio St  #-6", customers.get(2991).getAddress());
	}

	@Test
	@DisplayName("Record 2992: City is Hayward")
	void CityOfRecord2992() {
		assertEquals("Hayward", customers.get(2991).getCity());
	}

	@Test
	@DisplayName("Record 2992: County is Alameda")
	void CountyOfRecord2992() {
		assertEquals("Alameda", customers.get(2991).getCounty());
	}

	@Test
	@DisplayName("Record 2992: State is CA")
	void StateOfRecord2992() {
		assertEquals("CA", customers.get(2991).getState());
	}

	@Test
	@DisplayName("Record 2992: ZIP is 94544")
	void ZIPOfRecord2992() {
		assertEquals("94544", customers.get(2991).getZIP());
	}

	@Test
	@DisplayName("Record 2992: Phone is 510-489-9449")
	void PhoneOfRecord2992() {
		assertEquals("510-489-9449", customers.get(2991).getPhone());
	}

	@Test
	@DisplayName("Record 2992: Fax is 510-489-1582")
	void FaxOfRecord2992() {
		assertEquals("510-489-1582", customers.get(2991).getFax());
	}

	@Test
	@DisplayName("Record 2992: Email is mario@callicutt.com")
	void EmailOfRecord2992() {
		assertEquals("mario@callicutt.com", customers.get(2991).getEmail());
	}

	@Test
	@DisplayName("Record 2992: Web is http://www.mariocallicutt.com")
	void WebOfRecord2992() {
		assertEquals("http://www.mariocallicutt.com", customers.get(2991).getWeb());
	}
}
