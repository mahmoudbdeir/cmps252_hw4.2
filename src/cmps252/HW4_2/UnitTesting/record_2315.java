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

@Tag("45")
class Record_2315 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2315: FirstName is Kaye")
	void FirstNameOfRecord2315() {
		assertEquals("Kaye", customers.get(2314).getFirstName());
	}

	@Test
	@DisplayName("Record 2315: LastName is Malkasian")
	void LastNameOfRecord2315() {
		assertEquals("Malkasian", customers.get(2314).getLastName());
	}

	@Test
	@DisplayName("Record 2315: Company is Berkshire Travel Agency Inc")
	void CompanyOfRecord2315() {
		assertEquals("Berkshire Travel Agency Inc", customers.get(2314).getCompany());
	}

	@Test
	@DisplayName("Record 2315: Address is 848 Jesse Jewell Pky Sw")
	void AddressOfRecord2315() {
		assertEquals("848 Jesse Jewell Pky Sw", customers.get(2314).getAddress());
	}

	@Test
	@DisplayName("Record 2315: City is Gainesville")
	void CityOfRecord2315() {
		assertEquals("Gainesville", customers.get(2314).getCity());
	}

	@Test
	@DisplayName("Record 2315: County is Hall")
	void CountyOfRecord2315() {
		assertEquals("Hall", customers.get(2314).getCounty());
	}

	@Test
	@DisplayName("Record 2315: State is GA")
	void StateOfRecord2315() {
		assertEquals("GA", customers.get(2314).getState());
	}

	@Test
	@DisplayName("Record 2315: ZIP is 30501")
	void ZIPOfRecord2315() {
		assertEquals("30501", customers.get(2314).getZIP());
	}

	@Test
	@DisplayName("Record 2315: Phone is 770-536-9706")
	void PhoneOfRecord2315() {
		assertEquals("770-536-9706", customers.get(2314).getPhone());
	}

	@Test
	@DisplayName("Record 2315: Fax is 770-536-9476")
	void FaxOfRecord2315() {
		assertEquals("770-536-9476", customers.get(2314).getFax());
	}

	@Test
	@DisplayName("Record 2315: Email is kaye@malkasian.com")
	void EmailOfRecord2315() {
		assertEquals("kaye@malkasian.com", customers.get(2314).getEmail());
	}

	@Test
	@DisplayName("Record 2315: Web is http://www.kayemalkasian.com")
	void WebOfRecord2315() {
		assertEquals("http://www.kayemalkasian.com", customers.get(2314).getWeb());
	}
}
