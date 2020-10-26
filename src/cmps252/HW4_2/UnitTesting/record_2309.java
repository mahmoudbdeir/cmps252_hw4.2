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

@Tag("0")
class Record_2309 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2309: FirstName is Doreen")
	void FirstNameOfRecord2309() {
		assertEquals("Doreen", customers.get(2308).getFirstName());
	}

	@Test
	@DisplayName("Record 2309: LastName is Potempa")
	void LastNameOfRecord2309() {
		assertEquals("Potempa", customers.get(2308).getLastName());
	}

	@Test
	@DisplayName("Record 2309: Company is Rych, Steven K Md")
	void CompanyOfRecord2309() {
		assertEquals("Rych, Steven K Md", customers.get(2308).getCompany());
	}

	@Test
	@DisplayName("Record 2309: Address is 212 Mohonua Pl  #-c3")
	void AddressOfRecord2309() {
		assertEquals("212 Mohonua Pl  #-c3", customers.get(2308).getAddress());
	}

	@Test
	@DisplayName("Record 2309: City is Honolulu")
	void CityOfRecord2309() {
		assertEquals("Honolulu", customers.get(2308).getCity());
	}

	@Test
	@DisplayName("Record 2309: County is Honolulu")
	void CountyOfRecord2309() {
		assertEquals("Honolulu", customers.get(2308).getCounty());
	}

	@Test
	@DisplayName("Record 2309: State is HI")
	void StateOfRecord2309() {
		assertEquals("HI", customers.get(2308).getState());
	}

	@Test
	@DisplayName("Record 2309: ZIP is 96819")
	void ZIPOfRecord2309() {
		assertEquals("96819", customers.get(2308).getZIP());
	}

	@Test
	@DisplayName("Record 2309: Phone is 808-842-7479")
	void PhoneOfRecord2309() {
		assertEquals("808-842-7479", customers.get(2308).getPhone());
	}

	@Test
	@DisplayName("Record 2309: Fax is 808-842-1223")
	void FaxOfRecord2309() {
		assertEquals("808-842-1223", customers.get(2308).getFax());
	}

	@Test
	@DisplayName("Record 2309: Email is doreen@potempa.com")
	void EmailOfRecord2309() {
		assertEquals("doreen@potempa.com", customers.get(2308).getEmail());
	}

	@Test
	@DisplayName("Record 2309: Web is http://www.doreenpotempa.com")
	void WebOfRecord2309() {
		assertEquals("http://www.doreenpotempa.com", customers.get(2308).getWeb());
	}
}
