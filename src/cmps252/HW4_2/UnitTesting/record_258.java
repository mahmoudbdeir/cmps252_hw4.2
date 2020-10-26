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

@Tag("21")
class Record_258 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 258: FirstName is Nigel")
	void FirstNameOfRecord258() {
		assertEquals("Nigel", customers.get(257).getFirstName());
	}

	@Test
	@DisplayName("Record 258: LastName is Nakashima")
	void LastNameOfRecord258() {
		assertEquals("Nakashima", customers.get(257).getLastName());
	}

	@Test
	@DisplayName("Record 258: Company is Keystone Press")
	void CompanyOfRecord258() {
		assertEquals("Keystone Press", customers.get(257).getCompany());
	}

	@Test
	@DisplayName("Record 258: Address is 36 Monkton Rd")
	void AddressOfRecord258() {
		assertEquals("36 Monkton Rd", customers.get(257).getAddress());
	}

	@Test
	@DisplayName("Record 258: City is Vergennes")
	void CityOfRecord258() {
		assertEquals("Vergennes", customers.get(257).getCity());
	}

	@Test
	@DisplayName("Record 258: County is Addison")
	void CountyOfRecord258() {
		assertEquals("Addison", customers.get(257).getCounty());
	}

	@Test
	@DisplayName("Record 258: State is VT")
	void StateOfRecord258() {
		assertEquals("VT", customers.get(257).getState());
	}

	@Test
	@DisplayName("Record 258: ZIP is 5491")
	void ZIPOfRecord258() {
		assertEquals("5491", customers.get(257).getZIP());
	}

	@Test
	@DisplayName("Record 258: Phone is 802-877-4724")
	void PhoneOfRecord258() {
		assertEquals("802-877-4724", customers.get(257).getPhone());
	}

	@Test
	@DisplayName("Record 258: Fax is 802-877-5221")
	void FaxOfRecord258() {
		assertEquals("802-877-5221", customers.get(257).getFax());
	}

	@Test
	@DisplayName("Record 258: Email is nigel@nakashima.com")
	void EmailOfRecord258() {
		assertEquals("nigel@nakashima.com", customers.get(257).getEmail());
	}

	@Test
	@DisplayName("Record 258: Web is http://www.nigelnakashima.com")
	void WebOfRecord258() {
		assertEquals("http://www.nigelnakashima.com", customers.get(257).getWeb());
	}
}
