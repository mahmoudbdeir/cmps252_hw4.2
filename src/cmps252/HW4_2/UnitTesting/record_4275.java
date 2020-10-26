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

@Tag("39")
class Record_4275 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4275: FirstName is Paula")
	void FirstNameOfRecord4275() {
		assertEquals("Paula", customers.get(4274).getFirstName());
	}

	@Test
	@DisplayName("Record 4275: LastName is Rolff")
	void LastNameOfRecord4275() {
		assertEquals("Rolff", customers.get(4274).getLastName());
	}

	@Test
	@DisplayName("Record 4275: Company is Wstrn Staf Svc Wstrn Tempy Svc")
	void CompanyOfRecord4275() {
		assertEquals("Wstrn Staf Svc Wstrn Tempy Svc", customers.get(4274).getCompany());
	}

	@Test
	@DisplayName("Record 4275: Address is 1620 L St Nw  #-900")
	void AddressOfRecord4275() {
		assertEquals("1620 L St Nw  #-900", customers.get(4274).getAddress());
	}

	@Test
	@DisplayName("Record 4275: City is Washington")
	void CityOfRecord4275() {
		assertEquals("Washington", customers.get(4274).getCity());
	}

	@Test
	@DisplayName("Record 4275: County is District of Columbia")
	void CountyOfRecord4275() {
		assertEquals("District of Columbia", customers.get(4274).getCounty());
	}

	@Test
	@DisplayName("Record 4275: State is DC")
	void StateOfRecord4275() {
		assertEquals("DC", customers.get(4274).getState());
	}

	@Test
	@DisplayName("Record 4275: ZIP is 20036")
	void ZIPOfRecord4275() {
		assertEquals("20036", customers.get(4274).getZIP());
	}

	@Test
	@DisplayName("Record 4275: Phone is 202-452-4198")
	void PhoneOfRecord4275() {
		assertEquals("202-452-4198", customers.get(4274).getPhone());
	}

	@Test
	@DisplayName("Record 4275: Fax is 202-452-8512")
	void FaxOfRecord4275() {
		assertEquals("202-452-8512", customers.get(4274).getFax());
	}

	@Test
	@DisplayName("Record 4275: Email is paula@rolff.com")
	void EmailOfRecord4275() {
		assertEquals("paula@rolff.com", customers.get(4274).getEmail());
	}

	@Test
	@DisplayName("Record 4275: Web is http://www.paularolff.com")
	void WebOfRecord4275() {
		assertEquals("http://www.paularolff.com", customers.get(4274).getWeb());
	}
}
