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

@Tag("31")
class Record_610 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 610: FirstName is Nigel")
	void FirstNameOfRecord610() {
		assertEquals("Nigel", customers.get(609).getFirstName());
	}

	@Test
	@DisplayName("Record 610: LastName is Bodiroga")
	void LastNameOfRecord610() {
		assertEquals("Bodiroga", customers.get(609).getLastName());
	}

	@Test
	@DisplayName("Record 610: Company is Town House Motor Lodge")
	void CompanyOfRecord610() {
		assertEquals("Town House Motor Lodge", customers.get(609).getCompany());
	}

	@Test
	@DisplayName("Record 610: Address is 3650 Iles Ave")
	void AddressOfRecord610() {
		assertEquals("3650 Iles Ave", customers.get(609).getAddress());
	}

	@Test
	@DisplayName("Record 610: City is Farmington")
	void CityOfRecord610() {
		assertEquals("Farmington", customers.get(609).getCity());
	}

	@Test
	@DisplayName("Record 610: County is San Juan")
	void CountyOfRecord610() {
		assertEquals("San Juan", customers.get(609).getCounty());
	}

	@Test
	@DisplayName("Record 610: State is NM")
	void StateOfRecord610() {
		assertEquals("NM", customers.get(609).getState());
	}

	@Test
	@DisplayName("Record 610: ZIP is 87402")
	void ZIPOfRecord610() {
		assertEquals("87402", customers.get(609).getZIP());
	}

	@Test
	@DisplayName("Record 610: Phone is 505-326-7886")
	void PhoneOfRecord610() {
		assertEquals("505-326-7886", customers.get(609).getPhone());
	}

	@Test
	@DisplayName("Record 610: Fax is 505-326-4875")
	void FaxOfRecord610() {
		assertEquals("505-326-4875", customers.get(609).getFax());
	}

	@Test
	@DisplayName("Record 610: Email is nigel@bodiroga.com")
	void EmailOfRecord610() {
		assertEquals("nigel@bodiroga.com", customers.get(609).getEmail());
	}

	@Test
	@DisplayName("Record 610: Web is http://www.nigelbodiroga.com")
	void WebOfRecord610() {
		assertEquals("http://www.nigelbodiroga.com", customers.get(609).getWeb());
	}
}
