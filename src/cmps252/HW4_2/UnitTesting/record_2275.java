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
class Record_2275 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2275: FirstName is Enoch")
	void FirstNameOfRecord2275() {
		assertEquals("Enoch", customers.get(2274).getFirstName());
	}

	@Test
	@DisplayName("Record 2275: LastName is Busi")
	void LastNameOfRecord2275() {
		assertEquals("Busi", customers.get(2274).getLastName());
	}

	@Test
	@DisplayName("Record 2275: Company is S S P Fittings Corp")
	void CompanyOfRecord2275() {
		assertEquals("S S P Fittings Corp", customers.get(2274).getCompany());
	}

	@Test
	@DisplayName("Record 2275: Address is 1188 Bishop St  #-1106")
	void AddressOfRecord2275() {
		assertEquals("1188 Bishop St  #-1106", customers.get(2274).getAddress());
	}

	@Test
	@DisplayName("Record 2275: City is Honolulu")
	void CityOfRecord2275() {
		assertEquals("Honolulu", customers.get(2274).getCity());
	}

	@Test
	@DisplayName("Record 2275: County is Honolulu")
	void CountyOfRecord2275() {
		assertEquals("Honolulu", customers.get(2274).getCounty());
	}

	@Test
	@DisplayName("Record 2275: State is HI")
	void StateOfRecord2275() {
		assertEquals("HI", customers.get(2274).getState());
	}

	@Test
	@DisplayName("Record 2275: ZIP is 96813")
	void ZIPOfRecord2275() {
		assertEquals("96813", customers.get(2274).getZIP());
	}

	@Test
	@DisplayName("Record 2275: Phone is 808-524-8728")
	void PhoneOfRecord2275() {
		assertEquals("808-524-8728", customers.get(2274).getPhone());
	}

	@Test
	@DisplayName("Record 2275: Fax is 808-524-9528")
	void FaxOfRecord2275() {
		assertEquals("808-524-9528", customers.get(2274).getFax());
	}

	@Test
	@DisplayName("Record 2275: Email is enoch@busi.com")
	void EmailOfRecord2275() {
		assertEquals("enoch@busi.com", customers.get(2274).getEmail());
	}

	@Test
	@DisplayName("Record 2275: Web is http://www.enochbusi.com")
	void WebOfRecord2275() {
		assertEquals("http://www.enochbusi.com", customers.get(2274).getWeb());
	}
}
