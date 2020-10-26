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

@Tag("22")
class Record_3856 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3856: FirstName is Abram")
	void FirstNameOfRecord3856() {
		assertEquals("Abram", customers.get(3855).getFirstName());
	}

	@Test
	@DisplayName("Record 3856: LastName is Lech")
	void LastNameOfRecord3856() {
		assertEquals("Lech", customers.get(3855).getLastName());
	}

	@Test
	@DisplayName("Record 3856: Company is Messenger Press")
	void CompanyOfRecord3856() {
		assertEquals("Messenger Press", customers.get(3855).getCompany());
	}

	@Test
	@DisplayName("Record 3856: Address is 259 Lakeview Ave")
	void AddressOfRecord3856() {
		assertEquals("259 Lakeview Ave", customers.get(3855).getAddress());
	}

	@Test
	@DisplayName("Record 3856: City is Clifton")
	void CityOfRecord3856() {
		assertEquals("Clifton", customers.get(3855).getCity());
	}

	@Test
	@DisplayName("Record 3856: County is Passaic")
	void CountyOfRecord3856() {
		assertEquals("Passaic", customers.get(3855).getCounty());
	}

	@Test
	@DisplayName("Record 3856: State is NJ")
	void StateOfRecord3856() {
		assertEquals("NJ", customers.get(3855).getState());
	}

	@Test
	@DisplayName("Record 3856: ZIP is 7011")
	void ZIPOfRecord3856() {
		assertEquals("7011", customers.get(3855).getZIP());
	}

	@Test
	@DisplayName("Record 3856: Phone is 973-772-9888")
	void PhoneOfRecord3856() {
		assertEquals("973-772-9888", customers.get(3855).getPhone());
	}

	@Test
	@DisplayName("Record 3856: Fax is 973-772-3451")
	void FaxOfRecord3856() {
		assertEquals("973-772-3451", customers.get(3855).getFax());
	}

	@Test
	@DisplayName("Record 3856: Email is abram@lech.com")
	void EmailOfRecord3856() {
		assertEquals("abram@lech.com", customers.get(3855).getEmail());
	}

	@Test
	@DisplayName("Record 3856: Web is http://www.abramlech.com")
	void WebOfRecord3856() {
		assertEquals("http://www.abramlech.com", customers.get(3855).getWeb());
	}
}
