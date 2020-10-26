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

@Tag("32")
class Record_553 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 553: FirstName is Bruce")
	void FirstNameOfRecord553() {
		assertEquals("Bruce", customers.get(552).getFirstName());
	}

	@Test
	@DisplayName("Record 553: LastName is Minzy")
	void LastNameOfRecord553() {
		assertEquals("Minzy", customers.get(552).getLastName());
	}

	@Test
	@DisplayName("Record 553: Company is Hill Country Motel")
	void CompanyOfRecord553() {
		assertEquals("Hill Country Motel", customers.get(552).getCompany());
	}

	@Test
	@DisplayName("Record 553: Address is 200 Bowie St")
	void AddressOfRecord553() {
		assertEquals("200 Bowie St", customers.get(552).getAddress());
	}

	@Test
	@DisplayName("Record 553: City is Amarillo")
	void CityOfRecord553() {
		assertEquals("Amarillo", customers.get(552).getCity());
	}

	@Test
	@DisplayName("Record 553: County is Potter")
	void CountyOfRecord553() {
		assertEquals("Potter", customers.get(552).getCounty());
	}

	@Test
	@DisplayName("Record 553: State is TX")
	void StateOfRecord553() {
		assertEquals("TX", customers.get(552).getState());
	}

	@Test
	@DisplayName("Record 553: ZIP is 79106")
	void ZIPOfRecord553() {
		assertEquals("79106", customers.get(552).getZIP());
	}

	@Test
	@DisplayName("Record 553: Phone is 806-373-8780")
	void PhoneOfRecord553() {
		assertEquals("806-373-8780", customers.get(552).getPhone());
	}

	@Test
	@DisplayName("Record 553: Fax is 806-373-2616")
	void FaxOfRecord553() {
		assertEquals("806-373-2616", customers.get(552).getFax());
	}

	@Test
	@DisplayName("Record 553: Email is bruce@minzy.com")
	void EmailOfRecord553() {
		assertEquals("bruce@minzy.com", customers.get(552).getEmail());
	}

	@Test
	@DisplayName("Record 553: Web is http://www.bruceminzy.com")
	void WebOfRecord553() {
		assertEquals("http://www.bruceminzy.com", customers.get(552).getWeb());
	}
}
